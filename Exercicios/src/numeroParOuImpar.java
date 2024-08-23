import java.util.Scanner;
public class numeroParOuImpar {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double n1, divisao;
		System.out.print("Digite um Número: ");
		n1 = ler.nextDouble();
		divisao = n1 % 2;
		System.out.println("O número escolhido foi: " + n1);
		if (divisao == 0) {
			System.out.println("Este Número é Par");
		}
		else {
			System.out.println("Este Número é Impar");
		}
	}
}
