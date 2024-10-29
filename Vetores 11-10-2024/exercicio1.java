import java.util.*;
public class exercicio1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    //Declarando o Contador
    int i=0;

    //Inicializando Vetores
    final int TAM=10;
    int a[] = new int[TAM];
    int b[] = new int[TAM];
  
    //Obtendo Valores de A
    for (i=0; i < TAM; i++) {
        System.out.print("Digite o "+(i+1)+" valor do vetor A: ");
        a[i] = input.nextInt();
        b[i] = a[i] * a[i];
    }

    //Apresentando A
    System.out.print("A = [");
    for (i=0; i<TAM; i++){
      System.out.print(a[i]+", ");
    }
    System.out.print("]\n");

    //Apresentando B
    System.out.print("B = [");
    for (i=0; i<TAM; i++){
      System.out.print(b[i]+", ");
    }
    System.out.print("]\n");
  }
}
