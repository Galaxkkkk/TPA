import java.util.*;
public class ex10 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        // Vetores representando os conjuntos A e B
        int[] conjuntoA = new int[10];
        int[] conjuntoB = new int[10];
        int[] diferencaConjuntos = new int[10]; // Vetor para armazenar a diferença entre A e B

        // Entrada de dados para o conjunto A
        System.out.println("Digite 10 elementos para o conjunto A:");
        for (int i = 0; i < conjuntoA.length; i++) {
            conjuntoA[i] = input.nextInt();
        }

        // Entrada de dados para o conjunto B
        System.out.println("Digite 10 elementos para o conjunto B:");
        for (int i = 0; i < conjuntoB.length; i++) {
            conjuntoB[i] = input.nextInt();
        }

        // Variável para controlar o índice de inserção no vetor de diferença
        int indiceDiferenca = 0;

        // Calculando a diferença entre os conjuntos A e B
        for (int i = 0; i < conjuntoA.length; i++) {
            boolean elementoEncontradoEmB = false;
            for (int j = 0; j < conjuntoB.length; j++) {
                if (conjuntoA[i] == conjuntoB[j]) {
                    elementoEncontradoEmB = true;
                    break;
                }
            }

            // Se o elemento não for encontrado em B, adiciona à diferença
            if (!elementoEncontradoEmB) {
                diferencaConjuntos[indiceDiferenca] = conjuntoA[i];
                indiceDiferenca++;
            }
        }

        // Exibindo o vetor de diferença entre A e B
        System.out.println("\nDiferenca de A e B (Vetor de Diferença):");
        for (int i = 0; i < indiceDiferenca; i++) {
            System.out.print(diferencaConjuntos[i] + " ");
        }
  }
}
