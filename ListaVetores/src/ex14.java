import java.util.*;
public class ex14 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        // Vetores A e B com 10 elementos inteiros
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10]; // Vetor C que será formado de acordo com as regras

        // Entrada de dados para o vetor A
        System.out.println("Digite 10 elementos para o vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = input.nextInt();
        }

        // Entrada de dados para o vetor B
        System.out.println("Digite 10 elementos para o vetor B:");
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = input.nextInt();
        }

        // Construindo o vetor C com base nas comparações entre A e B
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] > vetorB[i]) {
                vetorC[i] = 1;  // Ai é maior que Bi
            } else if (vetorA[i] == vetorB[i]) {
                vetorC[i] = 0;  // Ai é igual a Bi
            } else {
                vetorC[i] = -1; // Ai é menor que Bi
            }
        }

        // Exibindo os vetores A, B e C
        System.out.println("\nVetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println("\nVetor B:");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }

        System.out.println("\nVetor C:");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }
  }
}
