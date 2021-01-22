package cl.awakelab.negociom5.modelo;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class Capacitacion {
	
    @Id
	private int id;
	private String fecha;
	private String hora;
	private String lugar;
	private int duracion;
	private int cantidadasistentes;
	private int cliente_rutcliente;
	
	public Capacitacion() {
		super();
	}

	public Capacitacion(int id, String fecha, String hora, String lugar, int duracion, int cantidadasistentes,
			int cliente_rutcliente) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantidadasistentes = cantidadasistentes;
		this.cliente_rutcliente = cliente_rutcliente;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getCantidadasistentes() {
		return cantidadasistentes;
	}

	public void setCantidadasistentes(int cantidadasistentes) {
		this.cantidadasistentes = cantidadasistentes;
	}

	public int getCliente_rutcliente() {
		return cliente_rutcliente;
	}

	public void setCliente_rutcliente(int cliente_rutcliente) {
		this.cliente_rutcliente = cliente_rutcliente;
	}

	@Override
	public String toString() {
		return "Capacitacion [id=" + id + ", fecha=" + fecha + ", hora=" + hora + ", lugar=" + lugar + ", duracion="
				+ duracion + ", cantidadasistentes=" + cantidadasistentes + ", cliente_rutcliente=" + cliente_rutcliente
				+ "]";
	}
	
}
