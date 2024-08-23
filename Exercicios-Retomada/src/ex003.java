import java.util.Scanner;
public class ex003 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" Programa de Calcular INSS ");
		double salario, inss;
		System.out.print("Digite o seu Salário: ");
		salario = input.nextInt();
		if (salario <= 1412) {
			inss = (salario/100) * 7.5;
			System.out.println("Você vai ter que pagar de INSS R$:"+inss);
		}else if (salario <= 2666.68) {
			inss = (salario/100) * 9;
			System.out.println("Você vai ter que pagar de INSS R$:"+inss);
		}else if (salario <= 4000.03) {
			inss = (salario/100) * 12;
			System.out.println("Você vai ter que pagar de inss R$:"+inss);
		}else if (salario <= 7786.02){
			inss = (salario/100) * 14;
			System.out.println("Você vai ter que pagar de inss R$:"+inss);
		}else {
			inss = (salario/100) * 16;
			System.out.println("Você vai ter que pagar de inss R$:"+inss);
		}
	}
}
