import java.util.*;
public class ex13 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        // Vetor A com 10 elementos inteiros
        int[] vetorA = new int[10];
        // Vetor B com 10 elementos, que será preenchido conforme as regras
        int[] vetorB = new int[10];

        // Entrada de dados para o vetor A
        System.out.println("Digite 10 elementos para o vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = input.nextInt();
        }

        // Construindo o vetor B com base em A
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                vetorB[i] = 1;  // Se Ai for par, Bi recebe 1
            } else {
                vetorB[i] = 0;  // Se Ai for ímpar, Bi recebe 0
            }
        }

        // Exibindo os vetores A e B
        System.out.println("\nVetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println("\nVetor B:");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
  }
}
