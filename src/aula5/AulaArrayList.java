package aula5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AulaArrayList {

	public static void main(String[] args) {
		//<tipoWrapper> nomeLista = new ArrayList<>
		ArrayList<Double> notas = new ArrayList<Double>();
		Scanner sc = new Scanner(System.in);
		
		Double num = 0.0;
		
		for (int i = 0; i <= 5; i++) {
			System.out.println("Digite números positivos: ");
			num = sc.nextDouble();
			notas.add(num);
		}
		
		System.out.println("\nNotas cadastradas: " + notas);
		
		//retorna a primeira ocorrencia de um valor na lista
		System.out.println("Posição do número 5: " + notas.indexOf(5d));
		
		Collections.sort(notas); //ordenando a lista com o método collections.sort que recebe uma lista como parametro
		//for each - lê-se: para cada Valor x presente na lista x, faça:
		for (Double nota : notas) {
			System.out.println(nota);
		}
		sc.close();
	}

}
