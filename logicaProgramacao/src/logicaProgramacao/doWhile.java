package logicaProgramacao;

import java.util.Locale;
import java.util.Scanner;

public class doWhile {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma temperatura em Celsius: ");
		double C = sc.nextDouble();
		double F = 9.0 * C / 5.0 + 32.0;
		System.out.println("Equivalente a Fahrenheit:  " + F);
		System.out.print("Deseja repetir (s/n)?");
		char resp = sc.next().charAt(0);
	
		
		

	}

}
