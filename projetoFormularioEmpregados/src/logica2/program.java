package logica2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departament;
import entities.HourContract;
import entities.Worker;

public class program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
		System.out.print("Enter department's name: ");
		String departmentName =  sc.nextLine();
		System.out.println("Enter Worker data");
		System.out.print("Name: ");
		String WorkerName = sc.nextLine();
		System.out.print("Level: ");
		String WorkerLevel = sc.nextLine();
		System.out.print("Base Salary: ");
		Double baseSalary = sc.nextDouble();
		Worker worker = new Worker(WorkerName, entities.enums.WorkerLevel.valueOf(WorkerLevel), baseSalary, new Departament(departmentName));
		
		System.out.println("How many contracts to this Worker? ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.println("Enter contract #'" + i + "data: ");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			double valuePerHour =  sc.nextDouble();
			System.out.print("Duration (Hours): ");
			int hours =  sc.nextInt();
			HourContract contrac = new HourContract(contractDate, valuePerHour, 	hours); // instaciando com a class HouContract
			worker.addContract(contrac); // associando a class trabalhados ( worker), criando assim os objetos de contrato dos trabalhadores.
			// contract: nome do array criado em worker, e add contrato nome do método que irá adiocionar os contratos ao array.
		}
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		
		
		
		
		sc.close();
	}

}
