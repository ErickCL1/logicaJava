package program;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import Services.BrazilTaxService;
import Services.RentalService;
import entities.CarRental;
import entities.Vehicle;



public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm");
		
		System.out.println("Entre com os dados do aluguel");
		System.out.print("Modelo do carro: ");
		String carModel = sc.nextLine();
		System.out.println("Retirada (dd/MM/yyyy hh:mm)");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.println("Retorno (dd/MM/yyyy hh:mm)");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);
		
		CarRental cr = new CarRental(start, finish, new Vehicle(carModel));
		
		System.out.print("Entre com o preço por hora: ");
		double pricePerHour =  sc.nextDouble();
		System.out.print("Entre com o preço por dia: ");
		double pricePerDay = sc.nextDouble();
		
		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
		
		rentalService.processInvoice(cr); 
		 // linkando os valores fixados em RentalService com os valores dados pelo usuário em cr, que foi o start e o finish
		
		System.out.println("Fatura");
		System.out.println("Pagamento básico: " + cr.getInvoice().getBasicPayment()); 
		// cr + os dados fixados em getInvoice + 
		System.out.println("Imposto: "  + cr.getInvoice().getTax());
		System.out.println("Pagamento Total: " + cr.getInvoice().getTotalPayment());
		
	
		
		
		sc.close();
	}

}
