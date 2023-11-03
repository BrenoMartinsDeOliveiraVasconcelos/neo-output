package neo;

import java.util.LinkedList;

public class Output {
	public static void output(LinkedList<LinkedList<Character>> lista) {
		LinkedList<Character> fim = new LinkedList<>();
		
		for (int indice1 = 0; indice1<lista.size(); indice1++) {
			for (int indice2 = 0; indice2<lista.get(indice1).size(); indice2++) {
				if (fim.size() >= 1) {
					// A lista ser maior ou igual a 1 em tamanho significa que já passou alguma iteração antes
					for (int indice3=0; indice3<fim.size(); indice3++) {
						System.out.print(fim.get(indice3));
					}
				}
				
				System.out.print(lista.get(indice1).get(indice2)+"\n"); //printa o caractére
			}
			
			fim.add(lista.get(indice1).getLast()); // O ultimo caractere da lista atual
		}
	};
	
}
