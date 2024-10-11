import java.util.*;
public class exercicio2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //inicializando Contador e Constante
    int i;
    final int TAM=10;
    //Inicializando Vetores
    int a[] = new int[TAM];
    int b[] = new int[TAM];
    int c[] = new int[TAM];
    //Lendo o Valor de A
    for (i=0; i<TAM; i++){
      System.out.println("Digite o "+(i+1)+"° Valor de A: ");
      a[i] = input.nextInt();
    }
    //Lendo o valor de B
    for (i=0; i<TAM; i++){
      System.out.println("Digite o "+(i+1)+"° Valor de B:");
      b[i] = input.nextInt();
      c[i] = a[i] + b[i];
    }
    //Apresentando os Valores
    System.out.print("\nC = ");
    for (i=0; i<TAM; i++){
      System.out.print(c[i]+", ");
    }
  }
}
