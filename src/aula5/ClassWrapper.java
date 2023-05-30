package aula5;

public class ClassWrapper {
/*
 * Uma classe wrapper em Java é uma classe que envolve um tipo primitivo,
 * permitindo que você trabalhe com ele como um objeto e tenha acesso
 * a métodos e funcionalidades adicionais.
 * 
 * A principal vantagem das classes wrapper é a capacidade de usar métodos e funcionalidades adicionais
 * que não estão disponíveis para tipos primitivos. 
 * Além disso, as classes wrapper também são usadas em situações em que tipos primitivos são necessários
 * como em coleções genéricas, que só aceitam objetos.
 */
	public static void main(String[] args) {
		
		double tony = 11.35;
		Double markI = 11.35; //classe wrapper
	
		System.out.println(tony);
		System.out.println(markI.byteValue());
	}

}
