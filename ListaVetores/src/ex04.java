import java.util.*;
public class ex04 {
	public static void main(String[] args) {
		//Criar um vetor A com 10 elementos inteiros. Escreva um programa que
		//imprima cada elemento do vetor A e a relação de todos os pares de 0 até o
		//respectivo elemento.

		Scanner input = new Scanner(System.in);

		final int TAM=10

		int a[] = new int [TAM];

		for(int i=0; i<TAM; i++){
			System.out.print("Digite o valor de A: ");
			a[i] = input.nextInt();
		}
	}
}
