import java.util.Scanner;
public class ex_Potencia {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1, expoente, potencia = 1, i = 0;
		System.out.print("Digite um Número: ");
		n1 = input.nextInt();
		System.out.print("Digite um Expoente: ");
		expoente = input.nextInt();
		while (i < expoente) {
			potencia = potencia * n1;
			i++;
		}
		System.out.println(n1 + " elevado a " + expoente + " é: " + potencia);
	}
}
