package ar.edu.unlp.info.oo1.ejercicioPresupuestos;


public class Item {
	private String detalle;
	private int cantidad;
	private double costoUnitario;
	
	public Item(String deta, int cant, double costo) {
		this.setDetalle(deta);
		this.setCantidad(cant);
		this.setCostoUnitario(costo);
	}
	
	
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getCostoUnitario() {
		return costoUnitario;
	}
	public void setCostoUnitario(double costoUnitario) {
		this.costoUnitario = costoUnitario;
	}
	public double costo() {
		return this.getCantidad()*this.getCostoUnitario();
	}
	
	
}
