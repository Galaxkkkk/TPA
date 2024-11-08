import java.util.*;
public class ex04 {
	public static void main(String[] args) {
		// Definindo o vetor A com 10 elementos inteiros
		int[] A = {5, 7, 3, 9, 6, 2, 8, 1, 4, 10};

		// Para cada elemento do vetor A, imprimimos o valor e os pares de 0 até o respectivo elemento
		for (int elemento : A) {
				System.out.println("Elemento: " + elemento);
				System.out.print("Pares até o elemento: ");
				
				for (int i = 0; i <= elemento; i++) {
						if (i % 2 == 0) {
								System.out.print(i + " ");
						}
				}
				System.out.println("\n"); // Pula uma linha após cada elemento para facilitar a leitura
	}
}
}
