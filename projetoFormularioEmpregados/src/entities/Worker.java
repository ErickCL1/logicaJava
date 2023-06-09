package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	private String name;
	private WorkerLevel level;
	private Double BaseSalary;
	
	private Departament department;
	private List <HourContract> contracts = new ArrayList<>();
	
	public Worker() {
	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Departament department) {
		this.name = name;
		this.level = level;
		BaseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return BaseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		BaseSalary = baseSalary;
	}

	public Departament getDepartment() {
		return department;
	}

	public void setDepartment(Departament department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}


	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	public void removeContact(HourContract contract) {
		contracts.remove(contract);
	}
	
	public double income(int year, int month){
		double sum = BaseSalary;
		Calendar cal = Calendar.getInstance();
		for(HourContract c: contracts) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_moth = 1 +cal.get(Calendar.MONTH);
		
			if (year == c_year && month == c_moth) {
				sum += c.totalValue();
			}
		}
		return sum;
	}	
}
