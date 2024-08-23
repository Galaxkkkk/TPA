import java.util.Scanner;
public class ex001 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Programa Categoria Estudantes");
		int idade;
		System.out.print("Informe a sua idade: ");
		idade = input.nextInt();
		if (idade == 6) {
			System.out.println("Dente de Leite");
		}else if (idade == 7) {
			System.out.println("Júnior");
		}else if (idade == 8) {
			System.out.println("Júnior Max");
		}else if (idade == 9) {
			System.out.println("Júnior Master");
		}else if (idade == 10) {
			System.out.println("Master");
		}else {
			System.out.println("Não existe Categoria para a sua Idade");
		}
	}
}
