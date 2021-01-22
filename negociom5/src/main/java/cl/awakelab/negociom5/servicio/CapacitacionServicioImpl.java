package cl.awakelab.negociom5.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.negociom5.modelo.Capacitacion;
import cl.awakelab.negociom5.modelo.CapacitacionRepositorio;

@Service
public class CapacitacionServicioImpl  implements CapacitacionServicio {
	
	@Autowired
	CapacitacionRepositorio cr;


	@Override
	public List<Capacitacion> obtenerCapacitacion() {
		//return (List<Capacitacion>) cr.findAll();
		return (List<Capacitacion>) cr.findAllByOrderById();
	}

	@Override
	public boolean crearCapacitacion(Capacitacion cap) {
		cr.save(cap);
		return true;
	}

	@Override
	public boolean editarCapacitacion(Capacitacion cap) {
		cr.save(cap);
		return true;
	}

	@Override
	public boolean eliminarCapacitacion(Capacitacion cap) {
		cr.delete(cap);
		return true;
	}

	@Override
	public Capacitacion obtenerCapacitacionPorId(int id) {
		return cr.findOne(id);
	}
	
	
	
	/*@Autowired
	CapacitacionRepositorio cr;

	@Override
	public List<Capacitacion> obtenerCapacitacion() {
		//return (List<Capacitacion>) cr.findAll();
		//return (List<Capacitacion>) cr.findAllByOrderById();
	}

	@Override
	public boolean crearCapacitacion(Capacitacion cap) {
		cr.save(cap);
		return true;
	}

	@Override
	public boolean editarCapacitacion(Capacitacion cap) {
		cr.save(cap);
		return true;
	}

	@Override
	public boolean eliminarCapacitacion(Capacitacion cap) {
		cr.delete(cap);
		return true;
	}

	@Override
	public Capacitacion obtenerCapacitacionPorId(int id) {
		return cr.findOne(id);
	}*/
	

}
