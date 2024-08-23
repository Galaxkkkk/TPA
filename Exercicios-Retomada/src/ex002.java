import java.util.Scanner;
public class ex002 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" Programa Determinador de Categorias para Campeonato ");
		int anoNasc, idade;
		System.out.print("Informe o ano que você nasceu: ");
		anoNasc = input.nextInt();
		idade = 2024 - anoNasc;
		if (idade <= 6) {
			System.out.println("Você é Dente de Leite");
		}else if (idade <= 10) {
			System.out.println("Você é Infantil 1");
		}else if (idade <= 14) {
			System.out.println("Você é Infantil 2");
		}else if (idade <= 16) {
			System.out.println("Você é Juvenil 1");
		}else if (idade <= 17) {
			System.out.println("Você é Juvenil 2");
		}else {
			System.out.println("Você tem mais de 18 anos, Não pode Participar");
		}
	}
}
