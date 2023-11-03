package neo;

public class Main {

	public static void main(String[] args) {
		String frase = Input.input(); // Essa variável será separada em um array para cada caractére
		
		Processor.process(frase);
	}

}
