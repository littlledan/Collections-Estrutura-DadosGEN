package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<Integer>();
			
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
			int pos = num.indexOf(num1);
			System.out.println("\nO numero "+num1+" esta na posição "+pos+" da lista!");			
		}else {
			System.out.println("\nO numero "+num1+" não foi encontrado!!!!");
		}
		

	}

}
