import java.util.Scanner;
public class ex001 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int anoNasc, anoAtual, idade;
		System.out.print("Informe o ano que você nasceu: ");
		anoNasc = ler.nextInt();
		System.out.print("Informe o ano atual: ");
		anoAtual = ler.nextInt();
		idade = anoAtual - anoNasc;
		if (idade < 10) {
			System.out.println("Você é uma Criança");
		} else if (idade < 18) {
			System.out.println("Você é um Adolescente");
		} else if (idade < 60) {
			System.out.println("Você é Adulto");
		} 
			else {
				System.out.println("Você é um idoso");
		}
		
		
	}
}
