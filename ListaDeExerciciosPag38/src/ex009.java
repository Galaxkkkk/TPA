import java.util.Scanner;
public class ex009 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double salario, irf, salarioNovo;
		System.out.println("| CALCULO DO IRPF |");
		System.out.print("Informe seu Salário: ");
		salario = input.nextDouble();
		if (salario < 1434) {
			System.out.println(salario);
		}else if (salario < 2150) {
			irf = (salario * (7.5/100)) - 107.59;
			System.out.println(irf);
		}else if (salario < 2866) {
			irf = (salario * (15/100)) - 268.84;
			System.out.println(irf);
		}else if (salario < 3582) {
			irf = (salario * (22.5/100)) - 483.84;
			System.out.println(irf);
		}else if (salario >= 3582) {
			irf = (salario * (27.5/100)) - 662.94;
			salarioNovo = salario - irf;
			System.out.println("Seu novo salário após ter pago o imposto é: " + salarioNovo);
		}
	}
}
