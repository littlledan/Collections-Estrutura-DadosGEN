package Collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Set2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Set<Integer> num = new HashSet<Integer>();
		
		num.add(2);
		num.add(5);
		num.add(1);
		num.add(3);
		num.add(4);
		num.add(9);
		num.add(7);
		num.add(8);
		num.add(10);
		num.add(6);
		
		System.out.println("\nDigite um numero de 1 a 10: ");
		int num1 = scanner.nextInt();
		
		if(num.contains(num1)) {
			System.out.println("\nO numero "+num1+" foi encontrado!");			
		}else {
			System.out.println("\nO numero "+num1+" não foi encontrado!!!!");
		}

	}

}
