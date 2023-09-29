package Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
	

	@Entity
	@Table(name="empleado")
	
	
public class Empleado {
	
	
	@Id
	@Column(name="IdEmpleado")
	private int idEmpleado;
	@Column(name="Apellidos")
	private String apellido;
	@Column(name="Nombres")
	private String nombre;
	@Column(name="Edad")
	private int edad;
	@Column(name="Sexo")
	private String sexo;
	@Column(name="Salario")
	private double salario;

	public Empleado( ) {
		
	}
	public Empleado( String apellido, String nombre, int edad, String sexo, double salario) {
		this.apellido = apellido;
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.salario = salario;
	}
	

	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", apellido=" + apellido + ", nombre=" + nombre + ", edad=" + edad
				+ ", sexo=" + sexo + ", salario=" + salario + "]";
	}


	public int getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
}
