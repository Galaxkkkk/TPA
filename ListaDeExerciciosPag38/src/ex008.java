import java.util.Scanner;
public class ex008 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double nota1, nota2, media, exame, mediaNova;
		System.out.println("| CALCULADORA DE MÉDIA |");
		System.out.print("Informe a primeira Nota: ");
		nota1 = input.nextDouble();
		System.out.print("Informe a segunda Nota: ");
		nota2 = input.nextDouble();
		media = (nota1 + nota2) / 2;
		if (media <= 3) {
			System.out.println("REPROVADO!");
		}else if (media >= 6) {
			System.out.println("APROVADO!");
		}else if (media >= 3 && media <= 6) {
			System.out.print("Informe Nota do Exame: ");
			exame = input.nextDouble();
			mediaNova = (media + exame) / 2;
			if (mediaNova >= 6) {
				System.out.println("APROVADO!");
			}else {
				System.out.println("REPROVADO!");
			}
		}
	}
}