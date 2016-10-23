
public class Lista {
	private Nodo inicio;
	private Nodo fin;

	public Lista(){
		inicio=fin=null;
	}

	public void agregarInicio(Familia dato, Persona datos) {
		Nodo nuevo = new Nodo(dato, datos);
		if (inicio == fin && inicio == null) {
			inicio = fin = nuevo;
		} else {
			nuevo.setSiguiente(inicio);
			inicio = nuevo;
		}
	}






}
