import java.util.*;
public class ex06 {
  public static void main(String[] args) {
     // Criando o vetor A com 11 elementos
     int[] A = new int[11];

     // Preenchendo o vetor A com potências de base 2
     for (int i = 0; i < A.length; i++) {
         A[i] = (int) Math.pow(2, i);
     }

     // Imprimindo os elementos do vetor A
     System.out.println("Vetor A:");
     for (int i = 0; i < A.length; i++) {
         System.out.println("A[" + i + "] = " + A[i]);
     }
  }
}
