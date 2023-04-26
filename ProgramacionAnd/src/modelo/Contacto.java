package modelo;

public class Contacto {
	private String nombre;
	private String apellido;
	private String tlf;
	
	public Contacto(String nombre, String apellido, String tlf) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.tlf = tlf;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getTlf() {
		return tlf;
	}
	public void setTlf(String tlf) {
		this.tlf = tlf;
	}

	@Override
	public String toString() {
		return "Contacto: " + nombre + " " + apellido + ", tlf: " + tlf;
	}
	
	
}
