package ar.edu.unlp.oo1.Ejjercicio11;

import java.util.ArrayList;

public class Inversor {
	private String nombre;
	private ArrayList<Inversion> inversiones;

	/* getters y setters */
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Inversion> getInversiones() {
		return inversiones;
	}

	public void setInversiones(ArrayList<Inversion> inversiones) {
		this.inversiones = inversiones;
	}

}
