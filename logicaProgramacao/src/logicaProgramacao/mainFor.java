package logicaProgramacao;

import java.util.Scanner;

public class mainFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int n = sc.nextInt();
		int soma = 0;
	
		
		for( int i = 0; i < n;i++)  {
			System.out.println("Digite um número:");
			int x = sc.nextInt();
			soma = soma + x;
			}
		
		System.out.println("Soma entre os valores digitados: " + soma);

		
	}

}
