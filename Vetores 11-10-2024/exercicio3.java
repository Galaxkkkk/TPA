import java.util.*;
public class exercicio3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //inicializando Contador e Constante
    int i;
    final int TAM=10;
    //Inicializando Vetores
    int a[] = new int[TAM];
    int b[] = new int[TAM];
    //Obtendo Valores de A
    for (i=0; i<TAM; i++){
      System.out.print("Digite o "+(i+1)+"° Valor de A: ");
      a[i] = input.nextInt();
    }
    //Invertendo Valores de A para B
    for (i=0; i<TAM; i++){
      b[i] = a[TAM - 1 - i];
    }
    //Mostrando Valores de A
    System.out.print("A = [");
    for (i=0; i<TAM; i++){
      System.out.print(a[i] + ", ");
    }
    System.out.print("]\n");
    //Mostrando Valores de B
    System.out.print("B = [");
    for (i=0; i<TAM; i++){
      System.out.print(b[i] + ", ");
    }
    System.out.print("]\n");
  }
}