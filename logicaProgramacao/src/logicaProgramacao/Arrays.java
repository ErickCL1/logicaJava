package logicaProgramacao;

import java.util.Locale;
import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite um número");
		int n = sc.nextInt();
		double[] vect  = new double[n];
		
		for(int i = 0; i <n ;i++) {
			System.out.println("Digite outro número:");
			vect[i] = sc.nextDouble();
			
		}
		
		for(double obj:vect ) {
			System.out.println(obj);
		}
		
		
		
		
		 
		 sc.close();
	}

}
