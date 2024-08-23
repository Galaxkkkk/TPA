import java.util.Scanner;
public class ex002 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int m, d;
		System.out.println("Informe o MÃªs: ");
		m = input.nextInt();
		System.out.println("Informe o Dia: ");
		d = input.nextInt();
		switch(m) {	
		case 1:
			if (d<21) {
				System.out.println("Seu signo é: Capricornio");
			}else  {
				System.out.println("Seu signo é: Aquãrio");
			}
			break;
		case 2:	
			if (d<20) {
				 System.out.println("Seu signo é: Aquário");
			}else {
				System.out.println("Seu signo é: Peixes");
			}
			break;
		case 3:
			if (d<20) {
				System.out.println("Seu signo é: Peixes");
			}else {
				System.out.println("Seu signo é: Aries");
			}
		    break;
		case 4:
			if (d<21) {
				System.out.println("Seu signo é: Aries");
			}else {
				System.out.println("Seu signo é: Touro");
			}
		    break;
		case 5:
			if (d<21) {
				System.out.println("Seu signo é: Touro");
			}else {
				System.out.println("Seu signo é: Gemeos");
			}
		    break;
		case 6:
			if (d<21) {
				System.out.println("Seu signo é: Gemeos");
			}else {
				System.out.println("Seu signo é: Cancer");
			}
			break;
		case 7:
			if (d<21) {
				System.out.println("Seu signo é: Cancer");
			}else {
				System.out.println("Seu signo é: Leão");
			}
			break;
		case 8:
			if (d<21){
				System.out.println("Seu signo é: Leão");
				}else {
					System.out.println("Seu signo é: Virgem");
				}
			    break;
		case 9:
			if (d<22) {
				System.out.println("Seu signo é: Virgem");
			}else {
				System.out.println("Seu signo é: Libra");
			}
			break;
		case 10: 
			if (d<22) {
				System.out.println("Seu signo é: Libra");
			}else {
				System.out.println("Seu signo é: Escorpião");
			}
			break;
		case 11:
			if (d<21) {
				System.out.println("Seu signo é: Escorpião");
			}else {
				System.out.println("Seu signo é: Sagitario");
			}
			break;
		case 12:
			if(d<20) {
				System.out.println("Seu signo é: Sagitario");
			}else {
				System.out.println("Seu signo é: Capricornio");
			}
			break;
			default:
				System.out.println("Dia e Mês invalido");
		}
	}
 
}