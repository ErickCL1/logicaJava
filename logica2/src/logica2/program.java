package logica2;

import java.util.Locale;
import java.util.Scanner;

import entities.Departament;
import entities.Worker;

public class program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter department's name: ");
		String departmentName =  sc.nextLine();
		System.out.print("Enter Worker data");
		System.out.println("Name: ");
		String WorkerName = sc.nextLine();
		System.out.println("Level: ");
		String WorkerLevel = sc.nextLine();
		System.out.println("Base Salary: ");
		Double baseSalary = sc.nextDouble();
		Worker worker = new Worker(WorkerName, entities.enums.WorkerLevel.valueOf(WorkerLevel), baseSalary, new Departament(departmentName));
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}