package ar.edu.unlp.objetos.uno.Ejercicio15;

import java.util.ArrayList;

public class Propiedad {
	private Usuario propietario;
	private String descripcion;
	private String direccion;
	private String nombre;
	private double precioXNoche;
	private ArrayList<Reserva> reservas;
	
	public Propiedad() {
		reservas = new ArrayList<Reserva>();
	}
	
	public Propiedad(String nombre, String descripcion, String direccion, double precio, Usuario prop) {
		reservas = new ArrayList<Reserva>();
		this.setDescripcion(descripcion);
		this.setPrecioXNoche(precio);
		this.setNombre(nombre);
		this.setDireccion(direccion);
		this.setPropietario(prop);
	}

	
	/*getters y setters*/
	
	public Usuario getPropietario() {
		return propietario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPropietario(Usuario propietario) {
		this.propietario = propietario;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getPrecioXNoche() {
		return precioXNoche;
	}

	public void setPrecioXNoche(double precioXNoche) {
		this.precioXNoche = precioXNoche;
	}

	public ArrayList<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(ArrayList<Reserva> reservas) {
		this.reservas = reservas;
	}
	
	
}
