package ar.edu.unlp.objetos.uno.Ejercicio13;

import java.util.ArrayList;

public class Carpeta {
	private ArrayList<Email> correos;
	private String nombre;
	
	public Carpeta() {
		correos = new ArrayList<Email>();
	}

	
	
	
	public ArrayList<Email> getCorreos() {
		return correos;
	}

	public void setCorreos(ArrayList<Email> correos) {
		this.correos = correos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void agregarCorreo(Email correo) {
		this.correos.add(correo);
	}
	public void retirarCorreo(Email correo) {
		this.correos.remove(correo);
	}
}
