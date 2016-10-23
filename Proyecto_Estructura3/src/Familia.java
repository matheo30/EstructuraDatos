
public class Familia {
	private String codigo;
	private String nombre_familia;
	private String direccion;
	private String sector;
	private String telefono;


	public Familia() {

		this.codigo = null;
		this.nombre_familia = null;
		this.direccion = null;
		this.sector = null;
		this.telefono = null;
	}

	public Familia(String codigo, String nombre_familia, String direccion, String sector, String telefono) {

		this.codigo = codigo;
		this.nombre_familia = nombre_familia;
		this.direccion = direccion;
		this.sector = sector;
		this.telefono = telefono;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getNombre_familia() {
		return nombre_familia;
	}


	public void setNombre_familia(String nombre_familia) {
		this.nombre_familia = nombre_familia;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getSector() {
		return sector;
	}


	public void setSector(String sector) {
		this.sector = sector;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}




}
