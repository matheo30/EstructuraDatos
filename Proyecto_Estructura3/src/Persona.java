
public class Persona {
private String nombre;
private String apellido;
private String cedula;
private int fecha;

public Persona() {
	
	this.nombre = null;
	this.apellido = null;
	this.cedula = null;
	this.fecha = 0;
}

public Persona(String nombre, String apellido, String cedula, int fecha) {
	
	this.nombre = nombre;
	this.apellido = apellido;
	this.cedula = cedula;
	this.fecha = fecha;
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

public String getCedula() {
	return cedula;
}

public void setCedula(String cedula) {
	this.cedula = cedula;
}

public int getFecha() {
	return fecha;
}

public void setFecha(int fecha) {
	this.fecha = fecha;
}

}
