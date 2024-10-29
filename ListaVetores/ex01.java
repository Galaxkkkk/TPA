import java.util.*;
public class ex01 {
  public static void main(String[] args) {
    //inicializando Scanner
    Scanner input = new Scanner(System.in);
    
    //declarando contador
    int i = 0;

    //inicializando vetores
    final int TAM=20;
    int a[] = new int [TAM];
    int b[] = new int [TAM];

    //Obtendo Valores
    for (i=0; i<TAM; i++){
      System.out.print("Digite um valor para A: ");
      a[i] = input.nextInt();
        if (a[i]%2 == 0){
          b[i] = a[i];
        }
        else{
          a[i] = a[i];
        }
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
