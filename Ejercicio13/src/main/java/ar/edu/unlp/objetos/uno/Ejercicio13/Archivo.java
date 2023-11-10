package ar.edu.unlp.objetos.uno.Ejercicio13;

public class Archivo {
	private String nombre;

	
	public Archivo() {
		
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int tamaño() {
		return this.getNombre().length();
	}
	
}
