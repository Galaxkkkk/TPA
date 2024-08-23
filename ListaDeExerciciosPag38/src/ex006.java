import java.util.Scanner;
public class ex006 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double valor1, valor2, valor3;
		System.out.println("| MAIOR E MENOR VALOR! |");
		System.out.print("Informe o Primeiro valor: ");
		valor1 = input.nextDouble();
		System.out.print("Informe o Segundo valor: ");
		valor2 = input.nextDouble();
		System.out.print("Informe o Terceiro valor: ");
		valor3 = input.nextDouble();
		if (valor1 > valor2 && valor2 > valor3 && valor1 > valor3) {
			System.out.println("O Menor valor é: " + valor3 + " O Maior valor é: " + valor1);
		}else if (valor1 > valor2 && valor2 < valor3 && valor1 > valor3) {
			System.out.println("O menor valor é: " + valor2 + " O Maior valor é: " + valor1);
		}else if (valor2 > valor1 && valor1 > valor3 && valor2 > valor3) {
			System.out.println("O menor valor é: " + valor3 + " O Maior valor é: " + valor2);
		}else if (valor2 > valor1 && valor1 < valor3 && valor2 > valor3) {
			System.out.println("O Menor valor é: " + valor1 + " O Maior valor é: " + valor2);
		}else if (valor3 > valor1 && valor1 > valor2 && valor3 > valor2) {
			System.out.println("O menor valor é: " + valor2 + " O Maior valor é: " + valor3);
		}else if (valor3 > valor1 && valor1 < valor2 && valor3 > valor2) {
			System.out.println("O menor valor é: " + valor1 + " O Maior valor é: " + valor3);
		}
		
	}
}
