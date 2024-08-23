import java.util.Scanner;
public class ex002 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("| SISTEMA PARA IDENTIFICAR MÊSES COM 20 e 30 e 31 |");
		int mes;
		System.out.print("Digite um mês do Ano: ");
		mes = input.nextInt();
		switch(mes){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("Este Mês tem 31 Dias!");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("Este Mês tem 30 Dias!");
				break;
			case 2:
				System.out.println("Este Único Mês tem 28 Dias!");
				break;
			default:
				System.out.println("Mês Inválido");
		}
		
	}
}
