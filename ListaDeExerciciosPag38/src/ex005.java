import java.util.Scanner;
public class ex005 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double l1, l2, l3;
		System.out.println("|IDENTIFICA��O DE TRI�NGULOS|");
		System.out.print("Informe o primeiro lado: ");
		l1 = input.nextDouble();
		System.out.print("Informe o segundo lado: ");
		l2 = input.nextDouble();
		System.out.print("Informe o terceiro lado: ");
		l3 = input.nextDouble();
		if (l1 == l2 && l2 == l3) {
			System.out.println("Tri�ngulo Equil�tero");
		}else if (l1 == l2 || l2 == l3) {
			System.out.println("Triangulo Escaleno");
		}else {
			System.out.println("Tri�ngulo Is�sceles");
		}
	}
}
