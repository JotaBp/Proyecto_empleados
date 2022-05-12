package modelos;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "departamentos")
public class Departamento implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_departamento")
	private Integer idDepartamento;
	@Column(name = "departamento")
	private String nombDepartamento;
	private Double presupuesto;
	private Double gastos;
	
	@OneToMany(mappedBy = "departamento")
	List<Empleado> empleadosDepartamento;
	
	public Integer getIdDepartamento() {
		return idDepartamento;
	}
	public void setIdDepartamento(Integer idDepartamento) {
		this.idDepartamento = idDepartamento;
	}
	public String getNombDepartamento() {
		return nombDepartamento;
	}
	public void setNombDepartamento(String nombDepartamento) {
		this.nombDepartamento = nombDepartamento;
	}
	public Double getPresupuesto() {
		return presupuesto;
	}
	public void setPresupuesto(Double presupuesto) {
		this.presupuesto = presupuesto;
	}
	public Double getGastos() {
		return gastos;
	}
	public void setGastos(Double gastos) {
		this.gastos = gastos;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		return Objects.hash(gastos, idDepartamento, nombDepartamento, presupuesto);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Departamento other = (Departamento) obj;
		return Objects.equals(gastos, other.gastos) && Objects.equals(idDepartamento, other.idDepartamento)
				&& Objects.equals(nombDepartamento, other.nombDepartamento)
				&& Objects.equals(presupuesto, other.presupuesto);
	}
	
	
}
