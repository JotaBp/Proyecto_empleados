package persistencia;

import java.util.Set;

import modelos.Empleado;

public interface EmpleadoDao {

	public void save(Empleado empleado);
	
	public Set<Empleado> findAll();
	
	public Empleado findById(int idEmpleado);

	public Empleado findByNif(String nif);
	
	//Busca nom en nombre o apellidos
	public Set<Empleado> findByNombre(String nom);
	
}
