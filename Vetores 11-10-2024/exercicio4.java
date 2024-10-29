import java.util.*;
public class exercicio4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] A = new int[10];
    int soma = 0;

    System.out.println("Digite 10 números inteiros para o vetor A:");

    // Leitura dos valores para o vetor A e cálculo da soma
    for (int i = 0; i < 10; i++) {
        System.out.print("Posição " + (i + 1) + ": ");
        A[i] = scanner.nextInt();
        soma += A[i];
    }

    // Cálculo da média
    double media = soma / 10.0;

    // Exibindo a média dos valores lidos
    System.out.println("A média dos valores lidos é: " + media);
    
    scanner.close();
}
}
