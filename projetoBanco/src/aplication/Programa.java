package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.println("How many employees will be registeded? ");
		int N = sc.nextInt();
		
		for(int i =0;i<N;i++) {
			
			System.out.println();
			System.out.println("Employee #"+ (i+1) + ":");
			System.out.print("ID: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name= sc.nextLine();
			System.out.print("Salary: ");
			Double salary  = sc.nextDouble();
			
			Employee emp = new Employee(id, name, salary);
			
			list.add(emp);
		}
		
		System.out.println();
		System.out.println("Enter the employee id that will have salary increase: ");
		int idSalary= sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
		if(emp == null) {
			System.out.println("This id does not exist! ");
		}
		else {
			System.out.println("Enter the percentage");
			double percentage = sc.nextDouble();
			emp.IncreaseSalary(percentage);
			
		}
		
		System.out.println();
		System.out.println("list of employees: ");
		for(Employee obj : list) {
			System.out.println(obj);
		}
		
		
		sc.close();
	}

}
