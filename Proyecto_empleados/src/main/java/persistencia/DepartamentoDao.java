package persistencia;

import java.util.Set;

import modelos.Departamento;

public interface DepartamentoDao {
	
	public void save(Departamento departamento);
	
	public Set<Departamento> findAll();
	
	public Departamento findById(int idDepartamento);
	
	public Departamento findByIdEager(int idDepartamento);


}
