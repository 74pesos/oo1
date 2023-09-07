package ar.edu.unlp.info.oo1.ejercicioPresupuestos;
import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;
public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	private List<Item> items;
	
	public Presupuesto(String example) {
		this.setCliente(example);
		this.items = new ArrayList<Item>();
		this.setFecha(LocalDate.now());
	}
	public void agregarItem(Item item) {
		this.items.add(item);
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public double calcularTotal() {
		double total = 0;
		for(Item i:items) {
			total+=i.costo();
		}
		return total;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
}
