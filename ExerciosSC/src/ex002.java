import java.util.Scanner;
public class ex002 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int m, d;
		System.out.println("Informe o Mês: ");
		m = input.nextInt();
		System.out.println("Informe o Dia: ");
		d = input.nextInt();
		switch(m) {	
		case 1:
			if (d<21) {
				System.out.println("Seu signo �: Capricornio");
			}else  {
				System.out.println("Seu signo �: Aqu�rio");
			}
			break;
		case 2:	
			if (d<20) {
				 System.out.println("Seu signo �: Aqu�rio");
			}else {
				System.out.println("Seu signo �: Peixes");
			}
			break;
		case 3:
			if (d<20) {
				System.out.println("Seu signo �: Peixes");
			}else {
				System.out.println("Seu signo �: Aries");
			}
		    break;
		case 4:
			if (d<21) {
				System.out.println("Seu signo �: Aries");
			}else {
				System.out.println("Seu signo �: Touro");
			}
		    break;
		case 5:
			if (d<21) {
				System.out.println("Seu signo �: Touro");
			}else {
				System.out.println("Seu signo �: Gemeos");
			}
		    break;
		case 6:
			if (d<21) {
				System.out.println("Seu signo �: Gemeos");
			}else {
				System.out.println("Seu signo �: Cancer");
			}
			break;
		case 7:
			if (d<21) {
				System.out.println("Seu signo �: Cancer");
			}else {
				System.out.println("Seu signo �: Le�o");
			}
			break;
		case 8:
			if (d<21){
				System.out.println("Seu signo �: Le�o");
				}else {
					System.out.println("Seu signo �: Virgem");
				}
			    break;
		case 9:
			if (d<22) {
				System.out.println("Seu signo �: Virgem");
			}else {
				System.out.println("Seu signo �: Libra");
			}
			break;
		case 10: 
			if (d<22) {
				System.out.println("Seu signo �: Libra");
			}else {
				System.out.println("Seu signo �: Escorpi�o");
			}
			break;
		case 11:
			if (d<21) {
				System.out.println("Seu signo �: Escorpi�o");
			}else {
				System.out.println("Seu signo �: Sagitario");
			}
			break;
		case 12:
			if(d<20) {
				System.out.println("Seu signo �: Sagitario");
			}else {
				System.out.println("Seu signo �: Capricornio");
			}
			break;
			default:
				System.out.println("Dia e M�s invalido");
		}
	}
 
}