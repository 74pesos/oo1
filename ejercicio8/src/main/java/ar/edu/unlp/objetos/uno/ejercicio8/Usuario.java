package ar.edu.unlp.objetos.uno.ejercicio8;
import java.util.ArrayList;
public class Usuario {
	private String domicilio;
	private String nombre;
	private ArrayList<Consumo>consumos;
	
	public Usuario(String nombre, String direccion) {
		this.setNombre(nombre);
		this.setDomicilio(direccion);
		this.consumos = new ArrayList<Consumo>();
	}
	public void agregarMedicion(Consumo medicion) {
		this.consumos.add(medicion);
	}
	public double ultimoConsumoActiva() {
		double retorno = this.consumos.get(this.consumos.size()).getConsumoEnergiaActiva();
		return retorno;
	}
	public Factura facturarEnBaseA(double precioKwh) {
		
		Factura retorno = new Factura();
	}
	
	/*getters and setters*/
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
