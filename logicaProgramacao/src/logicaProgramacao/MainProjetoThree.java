package logicaProgramacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainProjetoThree {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<LivroDisponivel> list = new ArrayList<>();

		
		System.out.println("Livros Disponíveis:");
		int n = sc.nextInt();
	
			
		for(LivroDisponivel livro: list) {
			System.out.println("Título: " + livro.getTitulo());
		}
		
	}

}
