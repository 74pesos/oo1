package ar.edu.unlp.oo1.Ejjercicio11;

public class InversionEnAcciones extends Inversion {
	private String nombre;
	private int cantidad;
	private double valorUnitario;

	public InversionEnAcciones() {
		super();
	}

	protected double valorActual() {
		return this.getValorUnitario() * this.getCantidad();
	}

	/* getters y setters */
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

}
