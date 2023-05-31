package Services;

import java.time.Duration;

import entities.CarRental;
import entities.Invoice;

public class RentalService {
	
	private Double pricePerHour;
	private Double pricePerDay;
	
	private TaxService taxService; // essse instanciamento diz que essa class depende da TaxService

	public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}
	
	public void processInvoice(CarRental carRental) {
		
		double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
		double hours = minutes / 60.0; // transformando minutos em horas.
		
		double basicPayment;
		if (hours <= 12.00) {
			basicPayment  = pricePerHour * Math.ceil(hours); // Math.ceil - função que arredonda pra cima.
		}
		else {
			basicPayment = pricePerDay*Math.ceil(hours/24.0); 
		}
		
		double tax = taxService.tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
		
		
	}

	
}
