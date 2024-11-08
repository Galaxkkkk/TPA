import java.util.*;
public class ex11 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        // Vetor A com 10 elementos inteiros
        int[] vetorA = new int[10];

        // Entrada de dados para o vetor A
        System.out.println("Digite 10 elementos para o vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = input.nextInt();
        }

        // Pedindo o elemento a ser buscado
        System.out.print("Digite o elemento que deseja buscar no vetor A: ");
        int elementoX = input.nextInt();

        // Variável para controlar se o elemento foi encontrado
        boolean encontrado = false;

        // Rotina de busca no vetor A
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] == elementoX) {
                encontrado = true;
                break;
            }
        }

        // Exibindo o resultado da busca
        if (encontrado) {
            System.out.println("Elemento " + elementoX + " encontrado no vetor A.");
        } else {
            System.out.println("Elemento " + elementoX + " não encontrado no vetor A.");
        }
  }
}
