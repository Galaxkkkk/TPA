import java.util.Scanner;
public class ex003 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("| Programa Calculador de % de notas dos Alunos |");
		int alunos, nota, mb, b, r, i, porcMB, porcB, porcR, porcI;
		System.out.println("Digitos : MB = 1, B = 2, R = 3, I = 4");
		System.out.print("Digite a quantidade de alunos da sala: ");
		alunos = input.nextInt();
		System.out.print("Digite a o digito da nota que você quer saber: ");
		nota = input.nextInt();
		switch(nota) {
		case 1:
			System.out.print("Digite quantos alunos tiraram MB: ");
			mb = input.nextInt();
			porcMB = (mb*100) / alunos;
			System.out.println("A porcentagem de alunos que tiraram MB foi: " + porcMB + "%");
		break;
		case 2:
			System.out.print("Digite quantos alunos tiraram B: ");
			b = input.nextInt();
			porcB = (b*100) / alunos;
			System.out.println("A porcentagem de alunos que tiraram B foi: " + porcB + "%");
		break;
		case 3:
			System.out.print("Digite quantos alunos tiraram R: ");
			r = input.nextInt();
			porcR = (r*100) / alunos;
			System.out.println("A porcentagem de alunos que tiraram R foi: " + porcR + "%");
		break;
		case 4:
			System.out.print("Digite quantos alunos tiraram I: ");
			i = input.nextInt();
			porcI = (i*100) / alunos;
			System.out.println("A porcentagem de alunos que tiraram I foi: " + porcI + "%");
		break;
		}
		
	}
}
