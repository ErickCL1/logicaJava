package logicaProgramacao;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		
		int x = sc.nextInt();
		
		int soma=0;
		
		while( x != 0) {
			soma = soma + x ;
			System.out.println("Digite novamente um número: ");
			x = sc.nextInt();
	
		}
		System.out.println("Finalizado!");
	}

}
