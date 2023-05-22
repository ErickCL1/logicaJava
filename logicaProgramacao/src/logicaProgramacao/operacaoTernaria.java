package logicaProgramacao;

import java.util.Scanner;

public class operacaoTernaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;  // se o preço for menor que 20.0, execute preco * 0.1, caso não execute o outro.
		
		System.out.println(desconto);
		

	}

}
