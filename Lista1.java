package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Lista1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> cor = new ArrayList<String>();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("\nInforme as cores desejadas(5 cores ao total): ");
			cor.add(scanner.nextLine());
		}
		Iterator< String> icor = cor.iterator();
		
		System.out.println("\nAs cores digitadas foram: \n");
		
		while(icor.hasNext()) {
			System.out.println(icor.next());
		}
		
		Collections.sort(cor);
		System.out.println("\nCores em ordem alfabetica: ");
		System.out.println("\n"+ cor);
	}

}
