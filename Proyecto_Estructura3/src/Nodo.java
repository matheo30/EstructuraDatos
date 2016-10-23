
public class Nodo {
	private Nodo siguiente;
	private Familia dato;
	private Persona datos;

	public Nodo(Familia dato, Persona datos) {
		this.dato = dato;
		this.datos = datos;
		siguiente=null;
	}



	public Nodo(Nodo siguiente, Familia dato, Persona datos) {

		this.siguiente = siguiente;
		this.dato = dato;
		this.datos = datos;
	}



	public Nodo getSiguiente() {
		return siguiente;
	}



	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}



	public Familia getDato() {
		return dato;
	}



	public void setDato(Familia dato) {
		this.dato = dato;
	}



	public Persona getDatos() {
		return datos;
	}



	public void setDatos(Persona datos) {
		this.datos = datos;
	}


}
