import java.util.*;
public class ex15 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        // Vetor A com 10 elementos inteiros
        int[] vetorA = new int[10];
        // Vetor B para ordem crescente
        int[] vetorB = new int[10];
        // Vetor C para ordem decrescente
        int[] vetorC = new int[10];

        // Entrada de dados para o vetor A
        System.out.println("Digite 10 elementos para o vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = input.nextInt();
        }

        // Copiando os elementos de A para B e C
        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = vetorA[i];
            vetorC[i] = vetorA[i];
        }

        // Ordenando o vetor B em ordem crescente usando Bubble Sort
        for (int i = 0; i < vetorB.length; i++) {
            for (int j = 0; j < vetorB.length - 1; j++) {
                if (vetorB[j] > vetorB[j + 1]) {
                    // Troca de posição
                    int temp = vetorB[j];
                    vetorB[j] = vetorB[j + 1];
                    vetorB[j + 1] = temp;
                }
            }
        }

        // Ordenando o vetor C em ordem decrescente usando Bubble Sort
        for (int i = 0; i < vetorC.length; i++) {
            for (int j = 0; j < vetorC.length - 1; j++) {
                if (vetorC[j] < vetorC[j + 1]) {
                    // Troca de posição
                    int temp = vetorC[j];
                    vetorC[j] = vetorC[j + 1];
                    vetorC[j + 1] = temp;
                }
            }
        }

        // Exibindo os vetores A, B e C
        System.out.println("\nVetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println("\nVetor B (ordem crescente):");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }

        System.out.println("\nVetor C (ordem decrescente):");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }
  }
}
