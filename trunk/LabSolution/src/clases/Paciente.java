package clases;

import javax.persistence.*;


@Entity
public class Paciente {
	  @Id
	    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="paciente_id_seq")
	    @SequenceGenerator(name="paciente_id_seq", sequenceName="paciente_id_seq", allocationSize=1)
	    @Column(name = "id")
	public int id;
	public String cedula;
	public String nombres;
	public String apellidos;
	public String telefono;
	public String sexo;

	public int edad;
	
	public Paciente(){}
	
	public Paciente(String cedula, String nombres, String apellidos,
			String telefono,String sexo,  int edad) {
		super();
		this.cedula = cedula;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.edad = edad;
		this.sexo = sexo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
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

	

}
