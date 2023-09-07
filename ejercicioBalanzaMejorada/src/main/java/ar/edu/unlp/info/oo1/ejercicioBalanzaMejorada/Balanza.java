package ar.edu.unlp.info.oo1.ejercicioBalanzaMejorada;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Balanza {
	/*private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;*/
	private List<Producto> productos;
	
	public Balanza() {
		productos = new ArrayList<Producto>();
	}
	public void ponerEnCero() {
		/*this.setCantidadDeProductos(0);
		this.setPesoTotal(0);
		this.setPrecioTotal(0);*/
		this.productos.clear();
		
	}
	public void agregarProducto(Producto producto) {
		/*double pesoAct= this.getPesoTotal();
		double precioAct= this.getPrecioTotal();
		int productosAct= this.getCantidadDeProductos();
		pesoAct+=producto.getPeso();
		precioAct+=producto.getPrecio();
		productosAct++;
		this.setCantidadDeProductos(productosAct);
		this.setPesoTotal(pesoAct);
		this.setPrecioTotal(precioAct);*/
		this.productos.add(producto);
	}
	public Ticket emitirTicket() {
		//Ticket ticket = new Ticket(this.getCantidadDeProductos(),LocalDate.now(),this.getPesoTotal(),this.getPrecioTotal());
		Ticket ticket = new Ticket(this.getProductos(),LocalDate.now());
		return ticket;
	}
	public List<Producto> getProductos(){
		return this.productos;
	}
	
	/*getters and setters without list*/
	
	/*public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}
	public void setCantidadDeProductos(int cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}
	public double getPrecioTotal() {
		return precioTotal;
	}
	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}
	public double getPesoTotal() {
		return pesoTotal;
	}
	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}*/
	
	/*getters and setters with list*/
	
	public int getCantidadDeProductos() {
		return this.getProductos().size();
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
