package ar.edu.unlp.objetos.uno.ejercicio8;
import java.time.LocalDate;
public class Consumo {
	private LocalDate fecha;
	private double consumoEnergiaActiva;
	private double consumoEnergiaReactiva;
	
	public double costoEnBaseA(double precioKwh) {
		double resultado = this.getConsumoEnergiaActiva();
		resultado*=precioKwh;
		if(this.factorDePotencia()>0.8) {
			resultado+=resultado*0.10;
		}
		return resultado;
	}
	public double factorDePotencia() {
		double resultado = this.getConsumoEnergiaActiva();
		resultado/=Math.sqrt(Math.pow(this.getConsumoEnergiaActiva(), 2)+Math.pow(this.getConsumoEnergiaReactiva(),2));
		return resultado;
	}
	
	/*getters and setters*/
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public double getConsumoEnergiaActiva() {
		return consumoEnergiaActiva;
	}
	public void setConsumoEnergiaActiva(double consumoEnergiaActiva) {
		this.consumoEnergiaActiva = consumoEnergiaActiva;
	}
	public double getConsumoEnergiaReactiva() {
		return consumoEnergiaReactiva;
	}
	public void setConsumoEnergiaReactiva(double consumoEnergiaReactiva) {
		this.consumoEnergiaReactiva = consumoEnergiaReactiva;
	}
	
}