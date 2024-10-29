import java.util.*;
public class ex03 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    //inicializando vetor
    final int TAM=10;
    int a[] = new int [TAM];

    //inicializando contador
    int i = 0;

    //recebendo dados
    for(i=0; i<TAM; i++){
      System.out.println("Digite um valor para A: ");
      a[i] = input.nextInt();
    }

    //declarando primo ou composto
    for(i=0; i<TAM; i++){
      boolean ehprimo = true;
      if (a[i] <= 1){
        ehprimo = false;
      }else{
        for (int j = 2; j<Math.sqrt(a[i]); j++){
          if (a[i] % j == 0){
            ehprimo = false;
            break;
          }
        }
      }
      //Exibindo Resultado
    if (ehprimo){
      System.out.println(a[i]+" é um número primo.");
    }else{
      System.out.println(a[i]+" não é um número primo.");
    }
  }
}
}
