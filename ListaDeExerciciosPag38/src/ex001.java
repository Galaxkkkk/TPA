import java.util.Scanner;
public class ex001 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int anoNasc, anoAtual, idade;
		System.out.print("Informe o ano que voc� nasceu: ");
		anoNasc = ler.nextInt();
		System.out.print("Informe o ano atual: ");
		anoAtual = ler.nextInt();
		idade = anoAtual - anoNasc;
		if (idade < 10) {
			System.out.println("Voc� � uma Crian�a");
		} else if (idade < 18) {
			System.out.println("Voc� � um Adolescente");
		} else if (idade < 60) {
			System.out.println("Voc� � Adulto");
		} 
			else {
				System.out.println("Voc� � um idoso");
		}
		
		
	}
}
