package cl.awakelab.negociom5.servicio;

import java.util.List;

import cl.awakelab.negociom5.modelo.Capacitacion;

public interface CapacitacionServicio {
	
	public List<Capacitacion> obtenerCapacitacion();
	public boolean crearCapacitacion(Capacitacion cap);
	public boolean editarCapacitacion(Capacitacion cap);	
	public boolean eliminarCapacitacion(Capacitacion cap);
	public Capacitacion obtenerCapacitacionPorId(int id);

}
