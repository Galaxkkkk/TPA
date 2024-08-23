import java.util.Scanner;
public class ex003 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float peso, altura, imc;
		System.out.print("Informe seu Peso: ");
		peso = input.nextFloat();
		System.out.print("Informe sua Altura: ");
		altura = input.nextFloat();
		imc = peso / (altura * altura);
		if (imc < 18.5) {
			System.out.println("Excesso de Magreza");
		}else if (imc < 25) {
			System.out.println("Peso Normal");
		}else if (imc < 30) {
			System.out.println("Excesso de Peso");
		}else if (imc < 35) {
			System.out.println("Obesidade Grau 1");
		}else if (imc < 40) {
			System.out.println("Obesidade Grau 2");
		}else {
			System.out.println("Obesidade Grau 3");
		}
	}
}
