package exerciciosArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<>();
		String x;
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Digite uma cor: ");
			x = sc.next();
			cores.add(x);
		}
		
		System.out.println("\nListar todas as cores: ");
		for (String cor : cores) {
			System.out.println(cor);
		}
		
		Collections.sort(cores);
		
		System.out.println("\nOrdenar as cores: ");
		for (String cor : cores) {
			System.out.println(cor);
		}
		
		sc.close();
	}

}
