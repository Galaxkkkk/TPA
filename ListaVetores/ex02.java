import java.util.*;
public class ex02 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    //Inicializando contador
    i = 0;
    n = 0;
    int resultado;
    final int TAM=5;

    // inicializando vetor
    int a[] = new int [TAM];

    //Obtendo Valores
    for (i=0; i<TAM; i++){
      System.out.print("Digite um valor para A");
      a[i] = input.nextInt();
    }
    
    //Mostrando tabuada
    for (i=0; i<TAM; i++){
      do{
        resultado = a[i] * n;
        System.out.println(a[i]+"x"+n+"="+resultado);
      }while (n<=10);
    }
  }  
}
