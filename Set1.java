package Collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Set1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int valor;
		
		Scanner scanner = new Scanner(System.in);
		Set<Integer> valores = new HashSet<Integer>();
		
		for(int i = 0; i < 10; i++) {
			System.out.println("\nDigite o valor numero ");
			valor = scanner.nextInt();
			valores.add(valor);
			
			}
				System.out.println("\nListar dados do set:" + valores);
		}
	}

