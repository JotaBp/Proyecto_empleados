package modelos;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "empleados")
public class Empleado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_empleado")
	private Integer idEmpleado;
	private String nif;
	private String nombre;
	private String apellido1;
	private String apellido2;
	
	@ManyToOne
	@JoinColumn(name = "id_departamento")
	private Departamento departamento;
	
	@ManyToOne
	@JoinColumn(name = "fk_jefe")
	private Empleado jefe;
	
	@OneToMany(mappedBy = "jefe")
	private Set<Empleado> emplACargo;

	public Integer getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(Integer idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Empleado getJefe() {
		return jefe;
	}

	public void setJefe(Empleado jefe) {
		this.jefe = jefe;
	}

	public Set<Empleado> getEmplACargo() {
		return emplACargo;
	}

	public void setEmplACargo(Set<Empleado> emplACargo) {
		this.emplACargo = emplACargo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellido1, apellido2, departamento, emplACargo, idEmpleado, jefe, nif, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return Objects.equals(apellido1, other.apellido1) && Objects.equals(apellido2, other.apellido2)
				&& Objects.equals(departamento, other.departamento) && Objects.equals(emplACargo, other.emplACargo)
				&& Objects.equals(idEmpleado, other.idEmpleado) && Objects.equals(jefe, other.jefe)
				&& Objects.equals(nif, other.nif) && Objects.equals(nombre, other.nombre);
	}
	
	
	
}
