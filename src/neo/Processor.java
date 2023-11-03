package neo;

import java.util.LinkedList;

public class Processor {
	public static LinkedList<LinkedList<Character>> process(String frase) {
		/*
		 * Retorna um array de caracteres até o caractere x de cada caractere da string
		 */
		
		LinkedList<LinkedList<Character>> caracteres = new LinkedList<>();
		
		for (int index=0; index<frase.length(); index++) {
			char letra = frase.charAt(index); //o caractere em questão
			LinkedList<Character> caracteresAnteriores = new LinkedList<>(); //lista de caractéres antes do caractér
			int caractere = 32;
			
			do {
				// Colocar os catacteres anteriores na lista
				caracteresAnteriores.add((char) caractere);
				
				caractere++;
			}while(caractere < letra);
			
			caracteres.add(caracteresAnteriores); //Adiciona na lista de listas
		}
		
		return caracteres;
	};
}
