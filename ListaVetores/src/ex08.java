import java.util.*;
public class ex08 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        // Lendo o vetor A com 10 elementos
        int[] A = new int[10];
        int[] B = new int[10];

        System.out.println("Digite 10 elementos para o vetor A:");
        for (int i = 0; i < A.length; i++) {
            A[i] = input.nextInt();
        }

        // Calculando o somatório para o vetor B
        for (int i = 0; i < A.length; i++) {
            int soma = 0;
            for (int j = i; j < A.length; j++) {
                soma += A[j];
            }
            B[i] = soma;
        }

        // Exibindo os elementos dos vetores A e B
        System.out.println("\nVetor A e Vetor B (somatórios):");
        for (int i = 0; i < A.length; i++) {
            System.out.println("A[" + i + "] = " + A[i] + " -> B[" + i + "] = " + B[i]);
        }
  }
}
