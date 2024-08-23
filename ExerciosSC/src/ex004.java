import java.util.Scanner;
public class ex004 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int c;
		System.out.println("||Digitos disponiveis: 1,2,3,4 e 5||");
		System.out.print("selecine um desses numeros apresentado acima: ");
		c = input.nextInt();
		switch (c) {
			case 1:
				System.out.println("Cachorro quente.  Preço: R$ 8,00");
			break;
			case 2:
				System.out.println("Cheeseburger.  Preço: R$ 12,00");
			break;
			case 3:
				System.out.println("X-Salada.  Preço: R$ 15,00 ");
		    break;
			case 4:
				System.out.println("Misto Quente.  Preço: R$ 11,00");
			break;
			case 5:
				System.out.println("Pão na chapa.  Preço: R$ 6,00");
			break;
			default:
				System.out.println("digito invalido");		
		}
	}
 
}