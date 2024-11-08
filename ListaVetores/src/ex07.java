import java.util.*;
public class ex07 {
  public static void main(String[] args) {
    // Vetor A com 15 elementos
    int[] A = {3, 4, 5, 6, 2, 1, 7, 8, 3, 5, 6, 9, 4, 2, 10};
    int[] B = new int[15];

    // Calcula o fatorial de cada elemento em A e armazena em B
    for (int i = 0; i < A.length; i++) {
        int fatorial = 1;
        for (int j = 1; j <= A[i]; j++) {
            fatorial *= j;
        }
        B[i] = fatorial;
    }

    // Exibe os elementos de A e B
    System.out.println("Vetor A e Vetor B (fatoriais):");
    for (int i = 0; i < A.length; i++) {
        System.out.println("A[" + i + "] = " + A[i] + " -> B[" + i + "] = " + B[i]);
    }
  }
}
