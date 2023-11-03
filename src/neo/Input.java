package neo;

import java.util.Scanner;

public class Input {
	/*
	 * Classe para pegar o input do usuário
	 */
	
	private static Scanner scanner = new Scanner(System.in); //Scanner da classe
	
	public static String input() {
		/*
		 * Pegar o input usando Scanner
		 */
		
		System.out.print("Frase: ");
		
		return scanner.nextLine();
	}
}
