package cl.awakelab.negociom5.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cl.awakelab.negociom5.modelo.Capacitacion;
import cl.awakelab.negociom5.servicio.CapacitacionServicio;

@Controller
public class CapacitacionControlador {
	
	@Autowired
	CapacitacionServicio cs;
	
	@RequestMapping(value="/listadocapacitaciones", method=RequestMethod.GET)
	public String vercapacitaciones(Model model) {
		List<Capacitacion> listacapacitaciones = cs.obtenerCapacitacion();
		model.addAttribute("lcap", listacapacitaciones);
		return "listadocapacitaciones";
	}
	
	@RequestMapping(value="/crearcapacitacion", method=RequestMethod.GET)
	public String crearcapacitacion(Model model) {
		return "crearcapacitacion";
	}

	@RequestMapping(value="/procesarcrearcapacitacion", method=RequestMethod.POST)
	public String procesarcrearcapacitacion(Model model, 
			@RequestParam ("id") int id,
			@RequestParam ("fecha") String fecha,
			@RequestParam ("hora") String hora,
			@RequestParam ("lugar") String lugar, 
			@RequestParam ("duracion") int duracion,
			@RequestParam ("cantidadasistentes") int cantidadasistentes,
			@RequestParam ("cliente_rutcliente") int cliente_rutcliente ){
		Capacitacion cap = new Capacitacion(id, fecha, hora, lugar, duracion, cantidadasistentes, cliente_rutcliente );
		cs.crearCapacitacion(cap);
		return "rescrearcapacitacion";
	}

	@RequestMapping(value="/eliminarcapacitacion/{id}", method=RequestMethod.GET)
	public String eliminarcapacitacion(Model model, @PathVariable ("id") int id) {
		Capacitacion cap = cs.obtenerCapacitacionPorId(id);
		cs.eliminarCapacitacion(cap);
		return "reseliminarcapacitacion";
	}

	@RequestMapping(value="/editarcapacitacion/{id}", method=RequestMethod.GET)
	public String editarcapacitacion(Model model, @PathVariable ("id") int id) {
		Capacitacion cap = cs.obtenerCapacitacionPorId(id);
		model.addAttribute("mycap", cap);
		return "editarcapacitacion";
	}

	@RequestMapping(value="/procesareditarcapacitacion", method=RequestMethod.POST)
	public String procesareditarcapacitacion(Model model, 
			@RequestParam ("id") int id,
			@RequestParam ("fecha") String fecha,
			@RequestParam ("hora") String hora,
			@RequestParam ("lugar") String lugar, 
			@RequestParam ("duracion") int duracion,
			@RequestParam ("cantidadasistentes") int cantidadasistentes,
			@RequestParam ("cliente_rutcliente") int cliente_rutcliente ){
		Capacitacion cap = new Capacitacion(id, fecha, hora, lugar, duracion, cantidadasistentes, cliente_rutcliente );
		cs.crearCapacitacion(cap);
		return "reseditarcapacitacion";
	}

}
