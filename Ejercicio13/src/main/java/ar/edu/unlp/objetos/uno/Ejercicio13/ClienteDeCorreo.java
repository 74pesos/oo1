package ar.edu.unlp.objetos.uno.Ejercicio13;

import java.util.ArrayList;

public class ClienteDeCorreo {
	private ArrayList<Carpeta> carpetas;
	private Carpeta inbox;
	
	public ClienteDeCorreo() {
		this.carpetas = new ArrayList<Carpeta>();
		this.inbox = new Carpeta();
	}
	public void recibir(Email email) {
		
	}
	public void mover(Email email, Carpeta origen, Carpeta destino) {
		
	}
	public Email buscar (String texto) {
		
	}
	public int espacioOcupado() {
		
	}
}
