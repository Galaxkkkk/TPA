import java.util.*;
public class ex05 {
  public static void main(String[] args) {
    // Definindo o vetor A com 10 elementos inteiros
    int[] A = {10, 15, 21, 8, 30, 12, 18, 25, 7, 14};

    // Para cada elemento do vetor A, imprimimos o valor e os divisores do respectivo elemento
    for (int elemento : A) {
        System.out.println("Elemento: " + elemento);
        System.out.print("Divisores: ");

        // Encontrando divisores do elemento
        for (int i = 1; i <= elemento; i++) {
            if (elemento % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n"); // Pula uma linha após cada elemento para facilitar a leitura
  }
}
}
