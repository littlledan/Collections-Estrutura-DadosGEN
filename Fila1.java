package Collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int op;
		
		Queue<String> fila = new LinkedList<String>();
		
		do {
			
			System.out.println("\n\t\tOpções: ");
			System.out.println("\n(1) Adcionar cliente a fila.");
			System.out.println("\n(2) Listar todos os clientes na fila.");
			System.out.println("\n(3) Retirar clientesda fila.");
			System.out.println("\n(0) Sair.");
			System.out.println("\n\t\tEntre com opção desejada: ");
			op = scanner.nextInt();
			
			switch(op) {
			case 1:
				scanner.nextLine();
				System.out.println("\nInforme seu nome: ");
				String nome = scanner.nextLine();
				if(nome.isEmpty()) {
					System.out.println("\nNome não pode estar vazio!!!!!");
				}else {
				fila.add(nome);
				}
				System.out.println("\nFila: \n\n"+fila);
				System.out.println("\nCliente adicionado.");
				break;
			
			case 2:
				scanner.nextLine();
				System.out.println("\nAtualmente os clientes na fila são: \n"+fila);
				break;
			
			case 3:
				scanner.nextLine();
				if(fila.size() != 0) {
					fila.remove();
					System.out.println("\nFila: \n\n"+fila);
					System.out.println("\nO primeiro cliente foi chamado!");
				}else {
					System.out.println("\nA fila esta vazia!!!");
				}
				break;
			case 0:
				System.out.println("\nAgradecemos por utilizar nossa lista de chamada prioritaria!");
				break;
				default:
				
			}
			
		}while(op != 0);

	}
}