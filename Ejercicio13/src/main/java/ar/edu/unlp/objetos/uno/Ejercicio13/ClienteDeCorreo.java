package ar.edu.unlp.objetos.uno.Ejercicio13;

import java.util.ArrayList;
import java.util.Iterator;

public class ClienteDeCorreo {
	private ArrayList<Carpeta> carpetas;
	private Carpeta inbox;
	
	public ClienteDeCorreo() {
		this.carpetas = new ArrayList<Carpeta>();
		this.inbox = new Carpeta();
	}
	public void recibir(Email email) {
		this.inbox.agregarCorreo(email);
	}
	public void mover(Email email, Carpeta origen, Carpeta destino) {
		if(!origen.getNombre().equals(inbox.getNombre()) && !destino.getNombre().equals(inbox.getNombre()))
			if(carpetas.contains(destino) && carpetas.contains(origen)) {
				carpetas.get(carpetas.indexOf(origen)).retirarCorreo(email);
				carpetas.get(carpetas.indexOf(destino)).agregarCorreo(email);		
			}
		else {
			if(origen.getNombre().equals(inbox.getNombre())) {		
				inbox.retirarCorreo(email);
				carpetas.get(carpetas.indexOf(destino)).agregarCorreo(email);
			}
			else {
				carpetas.get(carpetas.indexOf(destino)).retirarCorreo(email);
				inbox.agregarCorreo(email);
				}
			}
	}
	public Email buscar (String texto) {
		/*En respuesta al mensaje 
		 * #buscar retorna el primer email que encuentra cuyo título o cuerpo contienen 
		 * el texto indicado 
		 * como parámetro. 
		 * Busca en todas las carpetas. */
		boolean encontro = false;
		Iterator<Carpeta> iteradorCarpetas = this.carpetas.iterator();
		Iterator<Email> iteradorInbox = this.inbox.getCorreos().iterator();
		Iterator<Email> iteradorCarpeta;
		Email aux;
		while(iteradorInbox.hasNext() && !encontro) 
		{
			aux = iteradorInbox.next();
			if(aux.getTitulo().contains(texto) || aux.getCuerpo().contains(texto)) {
				encontro = true;
				return aux;
			}
		}
		while(iteradorCarpetas.hasNext()) {
			iteradorCarpeta = iteradorCarpetas.next().getCorreos().iterator();
			while(iteradorCarpeta.hasNext() && !encontro) {
				aux = iteradorCarpeta.next();
				if(aux.getTitulo().contains(texto) || aux.getCuerpo().contains(texto)) {
					encontro = true;
					return aux;
				}
			}
		}
		return null;
	}
	public int espacioOcupado() {
		Iterator<Carpeta> iteradorCarpetas = this.carpetas.iterator();
		Iterator<Email> iteradorCorreos;
		int espacioRetorno = 0;
		iteradorCorreos = this.inbox.getCorreos().iterator();
		while (iteradorCorreos.hasNext())
			espacioRetorno += iteradorCorreos.next().tamañoMail();
		while(iteradorCarpetas.hasNext()) {
			iteradorCorreos = iteradorCarpetas.next().getCorreos().iterator();
			while(iteradorCorreos.hasNext())
				espacioRetorno += iteradorCorreos.next().tamañoMail();
		}
		return espacioRetorno;
	}
}
