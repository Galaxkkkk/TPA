import java.util.Scanner;
public class ex002 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("| SISTEMA PARA IDENTIFICAR M�SES COM 20 e 30 e 31 |");
		int mes;
		System.out.print("Digite um m�s do Ano: ");
		mes = input.nextInt();
		switch(mes){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("Este M�s tem 31 Dias!");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("Este M�s tem 30 Dias!");
				break;
			case 2:
				System.out.println("Este �nico M�s tem 28 Dias!");
				break;
			default:
				System.out.println("M�s Inv�lido");
		}
		
	}
}
