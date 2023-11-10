package ar.edu.unlp.objetos.uno.Ejercicio15;

import java.time.LocalDate;

public class DateLapse {
	private LocalDate to;
	private LocalDate from;
	
	public DateLapse() {
		
	}
	
	public DateLapse(LocalDate dateT, LocalDate dateF) {
		this.setTo(dateT);
		this.setFrom(dateF);
	}
	
	public int sizeInDays() {
		return (int) java.time.temporal.ChronoUnit.DAYS.between(to, from);
	}
	
	public boolean includesDate(LocalDate other) {
		if((other.isAfter(this.getFrom()) || other.isEqual(this.getFrom())) && (other.isBefore(this.getTo()) || other.isEqual(this.getTo())))
				return true;
		else
			return false;
	}
	/*getters y setters*/
	public LocalDate getTo() {
		return to;
	}
	public void setTo(LocalDate to) {
		this.to = to;
	}
	public LocalDate getFrom() {
		return from;
	}
	public void setFrom(LocalDate from) {
		this.from = from;
	}
	
}
