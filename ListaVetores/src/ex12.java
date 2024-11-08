import java.util.*;
public class ex12 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        // Vetor A com 10 elementos inteiros
        int[] vetorA = new int[10];

        // Entrada de dados para o vetor A
        System.out.println("Digite 10 elementos para o vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = input.nextInt();
        }

        // Verificando se o vetor é um palíndromo
        boolean ehPalindromo = true;
        int tamanho = vetorA.length;

        for (int i = 0; i < tamanho / 2; i++) {
            if (vetorA[i] != vetorA[tamanho - i - 1]) {
                ehPalindromo = false;
                break;
            }
        }

        // Exibindo o resultado
        if (ehPalindromo) {
            System.out.println("O vetor A é um palíndromo.");
        } else {
            System.out.println("O vetor A não é um palíndromo.");
        }

  }
}
