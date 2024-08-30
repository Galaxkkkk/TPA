import java.util.Scanner;
public class ex004 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int an, aa, id, i=0;
		System.out.print("Insira o ano Atual: ");
		aa = input.nextInt();
		while (i<6) {
			i+=1;
			System.out.println(" ");
			System.out.print("Insira o ano e Nascimento: ");
			an = input.nextInt();
			id = aa - an;
			System.out.println("A idade do Usuario é " + id + " anos");
			if (id < 18) {
				System.out.println("Menor de Idade");
			}else {
				System.out.println("Maior de Idade");
			}
		}
	}
	
	
}
