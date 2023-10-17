package ar.edu.unlp.oo1.Ejjercicio11;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo extends Inversion {

	LocalDate fechaDeConstitucion;
	double montoDepositado;
	double porcentajeDeInteresDiario;

	public PlazoFijo() {
		super();
	}

	public double valorActual() {
		double retorno = 0;
		long dias = ChronoUnit.DAYS.between(this.getFechaDeConstitucion(), LocalDate.now());
		retorno = this.getMontoDepositado()
				+ (this.getMontoDepositado() * ((this.getPorcentajeDeInteresDiario() * 0.01) * dias));
		return retorno;
	}

	/* getters y setters */

	public LocalDate getFechaDeConstitucion() {
		return fechaDeConstitucion;
	}

	public void setFechaDeConstitucion(LocalDate fechaDeConstitucion) {
		this.fechaDeConstitucion = fechaDeConstitucion;
	}

	public double getMontoDepositado() {
		return montoDepositado;
	}

	public void setMontoDepositado(double montoDepositado) {
		this.montoDepositado = montoDepositado;
	}

	public double getPorcentajeDeInteresDiario() {
		return porcentajeDeInteresDiario;
	}

	public void setPorcentajeDeInteresDiario(double porcentajeDeInteresDiario) {
		this.porcentajeDeInteresDiario = porcentajeDeInteresDiario;
	}

}
