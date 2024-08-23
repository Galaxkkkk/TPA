import java.util.Scanner;
public class ex001 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" Programa Calculador de CashBack ");
		double valor, cashback;
		System.out.print(" Informe o Valor da sua Compra: ");
		valor = input.nextDouble();
		if (valor <= 100) {
			cashback = ((valor/100)*5);
			System.out.println("Seu cashback será de R$:"+cashback);
		}else if (valor <= 1000) {
			cashback = ((valor/100)*8);
			System.out.println("Seu cashback será de R$:"+cashback);
		}else if (valor <= 2000) {
			cashback = ((valor/100)*10);
			System.out.println("Seu cashback será de R$:"+cashback);
		}else if (valor <= 5000) {
			cashback = ((valor/100)*12.5);
			System.out.println("Seu cashback será de R$:"+cashback);
		}else {
			cashback = ((valor/100)*15);
			System.out.println("Seu cashback será de R$:"+cashback);
		}
	}
}