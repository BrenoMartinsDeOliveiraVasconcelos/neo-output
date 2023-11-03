package neo;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		String frase = Input.input(); // Essa variável será separada em um array para cada caractére
		LinkedList<LinkedList<Character>> saida = Processor.process(frase);
		
		Output.output(saida); //Print
		
	}

}
