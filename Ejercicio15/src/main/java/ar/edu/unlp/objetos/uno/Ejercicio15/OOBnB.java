package ar.edu.unlp.objetos.uno.Ejercicio15;

import java.util.ArrayList;

public class OOBnB {
	private ArrayList<Usuario> usuarios;
	private ArrayList<Propiedad> propiedades;
	//private ArrayList<Reserva> reservas;
	
	public OOBnB() {
		usuarios = new ArrayList<Usuario>();
		propiedades = new ArrayList<Propiedad>();
	}
	
	public Usuario registrarUsuario(String nombre, String direccion, int dni) {
		Usuario auxUser = new Usuario(nombre, direccion, dni);
		this.usuarios.add(auxUser);
		return auxUser;
	}
	
	public Propiedad registrarPropiedad(String nombre, String descripcion, double precio, String direccion, Usuario propietario) {
		Propiedad auxPropiedad = new Propiedad(nombre, descripcion, direccion, precio, propietario);
		return auxPropiedad;
	}
}
