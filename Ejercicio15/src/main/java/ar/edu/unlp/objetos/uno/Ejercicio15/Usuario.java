package ar.edu.unlp.objetos.uno.Ejercicio15;

import java.util.ArrayList;

public class Usuario {
	private String nombre;
	private String direccion;
	private int DNI;
	private ArrayList<Propiedad> propiedadesEnDominio;
	private ArrayList<Reserva> reservasDeAlquiler;
	
	public Usuario() {
		this.propiedadesEnDominio = new ArrayList<Propiedad>();
		this.reservasDeAlquiler = new ArrayList<Reserva>();		
	}
	public Usuario(String nombre, String direccion, int dni) {
		this.setNombre(nombre);
		this.setDireccion(direccion);
		this.setDNI(dni);
		this.propiedadesEnDominio = new ArrayList<Propiedad>();
		this.reservasDeAlquiler = new ArrayList<Reserva>();
	}
	
	
	
	/*getters y setters*/
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getDNI() {
		return DNI;
	}
	public void setDNI(int dNI) {
		DNI = dNI;
	}
	public ArrayList<Propiedad> getPropiedadesEnDominio() {
		return propiedadesEnDominio;
	}
	public void setPropiedadesEnDominio(ArrayList<Propiedad> propiedadesEnDominio) {
		this.propiedadesEnDominio = propiedadesEnDominio;
	}
	public ArrayList<Reserva> getReservasDeAlquiler() {
		return reservasDeAlquiler;
	}
	public void setReservasDeAlquiler(ArrayList<Reserva> reservasDeAlquiler) {
		this.reservasDeAlquiler = reservasDeAlquiler;
	}
	
	
}
