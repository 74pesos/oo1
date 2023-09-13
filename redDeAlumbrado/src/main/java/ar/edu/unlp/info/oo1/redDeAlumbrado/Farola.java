package ar.edu.unlp.info.oo1.redDeAlumbrado;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Farola {
	private ArrayList<Farola> neighbors;
	private boolean status;
	public Farola() {
		this.setStatus(false);
		neighbors = new ArrayList<Farola>();
	}
	public void pairWithNeighbor(Farola otra) {
		this.getNeighbors().add(otra);
		otra.getNeighbors().add(this);
	}
	public List<Farola> getNeighbors(){
		return this.neighbors;
	}
	public void turnOn() {
		if(!isOn()) {
			this.setStatus(true);
			ListIterator<Farola> vecinos = this.getNeighbors().listIterator();
			while(vecinos.hasNext()) {
				Farola act = vecinos.next();
				act.turnOn();
			}
		}
	}
	public void turnOff() {
		if(isOn()) {
			this.setStatus(false);
			ListIterator<Farola> vecinos = this.getNeighbors().listIterator();
			while(vecinos.hasNext()) {
				Farola act = vecinos.next();
				act.turnOff();
			}
		}
	}
	public boolean isOn() {
		return (this.getStatus());
	}
	public boolean getStatus() {
		return this.status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public void setNeighbors(ArrayList<Farola> neighbors) {
		this.neighbors = neighbors;
	}
	
	
}
