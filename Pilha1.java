package Collections;

import java.util.Scanner;
import java.util.Stack;

public class Pilha1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int op;
		Stack<String> livro = new Stack<String>();

do {
			
			System.out.println("\n\t\tOpções: ");
			System.out.println("\n(1) Adcionar livro na pilha.");
			System.out.println("\n(2) Listar todos os livros na pilha.");
			System.out.println("\n(3) Retirar livro da pilha.");
			System.out.println("\n(0) Sair.");
			System.out.println("\n\t\tEntre com opção desejada: ");
			op = scanner.nextInt();
			
			switch(op) {
			case 1:
				scanner.nextLine();
				System.out.println("\nAdcione o livro desejado: ");
				String nome = scanner.nextLine();
				if(nome.isEmpty()) {
					System.out.println("\nNome não pode estar vazio!!!!!");
				}else {
				livro.add(nome);
				}
				System.out.println("\nPilha: \n\n"+livro);
				System.out.println("\nLivro adicionado.");
				break;
			
			case 2:
				scanner.nextLine();
				System.out.println("\nAtualmente os livro na pilha são: \n"+livro);
				break;
			
			case 3:
				scanner.nextLine();
				if(livro.size() != 0) {
					livro.pop();
					System.out.println("\nPilha: \n\n"+livro);
					System.out.println("\nUm livro foi retirado da pilha!");
				}else {
					System.out.println("\nA pilha esta vazia!!!");
				}
				break;
			case 0:
				System.out.println("\nAgradecemos por utilizar nossa Biblioteca virtual!");
				break;
				default:
				
			}
			
		}while(op != 0);

	}
}


