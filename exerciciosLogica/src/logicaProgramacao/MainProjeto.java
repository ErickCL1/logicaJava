package logicaProgramacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class MainProjeto {

	public static void main(String[] args) {
		
		List<LivroDisponivel> list = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println ("--------------------------------");
        System.out.println ("        LIVRARIA FICR           ");
        System.out.println ("--------------------------------");
        System.out.println("Seja Bem-vindo a Livraria FICR");
        System.out.println("1. Livros.");
        System.out.println("2. Livros Diponiveis.");
        System.out.println("3. Funcionário.");
        System.out.println("4. Digite uma das opções:");
        String n = sc.nextLine();
        
		
		System.out.print("Digite o título do livro: ");
        String titulo = sc.nextLine();

        System.out.print("Digite o autor do livro: ");
        String autor = sc.nextLine();

        System.out.print("Digite a editora do livro: ");
        String editora = sc.nextLine();

        System.out.print("Digite a quantidade de livros disponíveis: ");
        int quantidade = sc.nextInt();
       
        
        LivroDisponivel livro = new LivroDisponivel(titulo, autor, editora, quantidade);
        list.add(livro);

		
        System.out.println("Livro cadastrado com sucesso!");
		
	}

}
