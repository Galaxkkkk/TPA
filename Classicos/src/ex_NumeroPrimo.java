import java.util.Scanner;
public class ex_NumeroPrimo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1, divisores = 0, i = 1;
		System.out.print("Digite um Número: ");
		n1 = input.nextInt();
		while (i <= n1) {
			if (n1 % i == 0) {
				divisores = divisores + 1;
			}
			i = i + 1;
		}if (divisores == 2) {
			System.out.println("É um Número Primo");
		}else {
			System.out.println("Não é um Número Primo");
		}
	}
}
