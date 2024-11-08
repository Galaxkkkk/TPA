import java.util.*;
import java.util.Scanner;
public class ex09 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        // Vetores A e B com 10 elementos
        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[10]; // Vetor para armazenar a interseção

        System.out.println("Digite 10 elementos para o vetor A:");
        for (int i = 0; i < A.length; i++) {
            A[i] = input.nextInt();
        }

        System.out.println("Digite 10 elementos para o vetor B:");
        for (int i = 0; i < B.length; i++) {
            B[i] = input.nextInt();
        }

        // Variável para controlar o índice de inserção no vetor C
        int indexC = 0;

        // Calculando a interseção dos vetores A e B
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    // Verifica se o elemento já foi adicionado a C
                    boolean exists = false;
                    for (int k = 0; k < indexC; k++) {
                        if (C[k] == A[i]) {
                            exists = true;
                            break;
                        }
                    }
                    if (!exists) {
                        C[indexC] = A[i];
                        indexC++;
                    }
                    break;
                }
            }
        }

        // Imprimindo a interseção
        System.out.println("\nInterseção de A e B (Vetor C):");
        for (int i = 0; i < indexC; i++) {
            System.out.print(C[i] + " ");
        }
  }
}
