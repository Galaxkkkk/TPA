import java.util.Scanner;
public class ex_Fatorial {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1, i = 1, fatorial = 1;
		System.out.println("Digite um Número: ");
		n1 = input.nextInt();
		while (i <= n1) {
			fatorial = fatorial * i;
			i++;
		}
		System.out.println("O fatorial de " + n1 + " é: " + fatorial);
	}
}
