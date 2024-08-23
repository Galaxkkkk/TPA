import java.util.Scanner;
public class idadeVotar {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int anoEleicao, anoNascimento, idade;
		System.out.print("Digite o ano em que você nasceu: ");
		anoNascimento = ler.nextInt();
		System.out.print("Digite o ano das proximas eleições: ");
		anoEleicao = ler.nextInt();
		idade = anoEleicao - anoNascimento;
		System.out.println("Você terá : " + idade + " anos");
		if (idade>=16) {
			System.out.println("Você podera votar 😊");
		}
		else {
			System.out.println("Você não podera votar 😭");
		}		
	}
}
