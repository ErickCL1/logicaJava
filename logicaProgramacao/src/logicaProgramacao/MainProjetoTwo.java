package logicaProgramacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainProjetoTwo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Funcionario> funcionarios = new ArrayList<>();
		
		System.out.print("Digite o nome do funcionário: ");
        String nome = sc.nextLine();

        System.out.print("Digite o CPF do funcionário: ");
        int cpf = sc.nextInt();
        
        Funcionario funcionario = new Funcionario(nome, cpf);
        funcionarios.add(funcionario);
        
        	while(cpf < 0 ) {
        	System.out.print("Digite novamente um CPF válido: ");
            int cpfTwo = sc.nextInt();
        	}
        
        System.out.println("Funcionário cadastrado com sucesso!");
		
		
	}

}
