package ar.edu.unlp.info.oo1.Animalitos;

import java.time.LocalDate;

public class Mamifero {
	private LocalDate fecha;
	private String identificador;
	private String especie;
	private	LocalDate fechaNacimiento;
	private Mamifero padre;
	private Mamifero Madre;
	
	public Mamifero() {
		this.setIdentificador(null);
	}
	public Mamifero(String nombre) {
		this.setIdentificador(nombre);
	}

	public Mamifero getAbueloMaterno() {
		Mamifero retorno = null;
		if(this.getMadre() != null) {
			if (this.getMadre().getPadre() != null) retorno = this.getMadre().getPadre();
		}
		return retorno;
	}
	public Mamifero getAbuelaMaterna() {
		Mamifero retorno = null;
		if(this.getMadre() != null) {
			if (this.getMadre().getMadre() != null) retorno = this.getMadre().getMadre();
		}
		return retorno;
	}
	public Mamifero getAbueloPaterno() {
		Mamifero retorno = null;
		if(this.getPadre() != null) {
			if (this.getPadre().getPadre() != null) retorno = this.getPadre().getPadre();
		}
		return retorno;
	}
	public Mamifero getAbuelaPaterna() {
		Mamifero retorno = null;
		if(this.getPadre() != null) {
			if (this.getPadre().getMadre() != null) retorno = this.getPadre().getMadre();
		}
		return retorno;
	}
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		boolean cond = false;
		cond = tieneComoAncestroPrivado(cond, unMamifero, this,this.getIdentificador());
		return cond;
	}
	private boolean tieneComoAncestroPrivado(boolean status, Mamifero unMamifero, Mamifero act,String id) {
		if ((!status)) {
			if(act.getPadre()!=null)  status = tieneComoAncestroPrivado(status, unMamifero, act.getPadre(),id);
			if(act.getMadre()!= null) status = tieneComoAncestroPrivado(status, unMamifero, act.getMadre(), id);
		}
		if((act.getIdentificador() != id) && (act.getIdentificador() == unMamifero.getIdentificador())) status = true;
		return status;
	}
	/*getters y setters*/
	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}



	public Mamifero getMadre() {
		return Madre;
	}



	public void setMadre(Mamifero madre) {
		Madre = madre;
	}



	public Mamifero getPadre() {
		return padre;
	}



	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	
}

