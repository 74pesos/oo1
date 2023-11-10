package ar.edu.unlp.objetos.uno.Ejercicio13;

import java.util.ArrayList;
import java.util.Iterator;

public class Email {
	private String titulo;
	private String cuerpo;
	private ArrayList<Archivo> archivos;
	
	public Email() {
		this.archivos = new ArrayList<Archivo>();
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getCuerpo() {
		return cuerpo;
	}
	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}
	public ArrayList<Archivo> getArchivos() {
		return archivos;
	}
	public void setArchivos(ArrayList<Archivo> archivos) {
		this.archivos = archivos;
	}
	
	public int tamañoMail() {
		int retorno = 0;
		retorno += this.getTitulo().length() + this.getCuerpo().length();
		if(!this.getArchivos().isEmpty()) {
			Iterator<Archivo> archivosIterador = this.getArchivos().iterator();
			while(archivosIterador.hasNext()) {
				retorno += archivosIterador.next().tamaño();
			}
		}
		return retorno;
	}
}
