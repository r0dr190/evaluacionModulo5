package cl.awakelab.negociom5.modelo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
	
	@Repository
	public interface CapacitacionRepositorio extends CrudRepository<Capacitacion, Integer> {
		
		public List<Capacitacion> findAllByOrderById();

}
