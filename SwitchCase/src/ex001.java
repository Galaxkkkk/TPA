import java.util.Scanner;
public class ex001 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("| SISTEMA RODIZIO SP |");
		int placa;
		System.out.print("Informe o Final da Placa do seu carro: ");
		placa = input.nextInt();
		switch(placa) {
			case 1:
			case 2:
				System.out.println("Seu rod�zio � na Segunda-Feira");
				break;
			case 3:
			case 4:
				System.out.println("Seu rod�zio � na Ter�a-Feira");
				break;
			case 5:
			case 6:
				System.out.println("Seu rod�zio � na Quarta-Feira");
				break;
			case 7:
			case 8:
				System.out.println("Seu rod�zio � na Quinta-Feira");
				break;
			case 9:
			case 0:
				System.out.println("Seu rod�zio � na Sexta-Feira");
				break;
			default:
				System.out.println("Placa Inv�lida");
		}
	}

}
