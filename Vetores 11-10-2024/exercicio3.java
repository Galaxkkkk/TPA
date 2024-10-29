import java.util.*;
public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[10];

        System.out.println("Digite 10 números inteiros para o vetor A:");

        // Leitura dos valores para o vetor A
        for (int i = 0; i < 10; i++) {
            System.out.print("Posição " + (i + 1) + ": ");
            A[i] = scanner.nextInt();
        }

        // Preenchimento do vetor B com A invertido
        for (int i = 0; i < 10; i++) {
            B[i] = A[9 - i];
        }

        // Exibindo os vetores A e B
        System.out.println("Vetor A:");
        for (int i : A) {
            System.out.print(i + " ");
        }

        System.out.println("\nVetor B (invertido):");
        for (int i : B) {
            System.out.print(i + " ");
        }
        
        scanner.close();
    }
}