package ar.edu.unlp.info.oo1.ejercicioBalanzaMejorada;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Ticket {
	private LocalDate fecha;
	private int cantidadDeProductos;
	private double pesoTotal;
	private double precioTotal;
	private List<Producto> productos;
	
	/*public Ticket(int cant, LocalDate fecha, double pesoTotal, double precioTotal) {
		this.setCantidadDeProductos(cant);
		this.setFecha(fecha);
		this.setPesoTotal(pesoTotal);
		this.setPrecioTotal(precioTotal);
	}*/
	public Ticket(List<Producto> productosBalanza, LocalDate fecha) {
		productos = new ArrayList<Producto>(productosBalanza);
		this.setFecha(fecha);
	}
	public double impuesto() {
		return this.getPrecioTotal()*0.21;
	}
	/*public double impuesto() {
		return precioTotal*0.21;
	}*/
	
	/*getters and setters without list*/
	
	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	/*
	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public void setCantidadDeProductos(int cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}

	public double getPesoTotal() {
		return pesoTotal;
	}

	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}*/
	
	/*getters and setters with list*/
	
	public int getCantidadDeProductos() {
		return productos.size();
	}
	public double getPrecioTotal() {
		double total = 0;
		for(Producto i:this.productos) total+=i.getPrecio();
		return total;
	}
	public double getPesoTotal() {
		double pesoTotal = 0;
		for(Producto I:this.productos) pesoTotal+= I.getPeso();
		return pesoTotal;
	}
}
