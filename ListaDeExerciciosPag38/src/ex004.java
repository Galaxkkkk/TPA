import java.util.Scanner;
import java.math.*;
public class ex004 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a, b, c, delta, x1, x2;
		System.out.print("Informe o 1� N�mero: ");
		a = input.nextDouble();
		System.out.print("Informe o 2� N�mero: ");
		b = input.nextDouble();
		System.out.print("Informe o 3� N�mero: ");
		c = input.nextDouble();
		delta = (b*b) - 4 * a * c;
		if (delta >= 0) {
			x1 = (-b) + (Math.sqrt(delta)) / (2 * a);
			x2 = (-b) - (Math.sqrt(delta)) / (2 * a);
		System.out.println("S = " + x1 + " , " +  x2);
		}else {
			System.out.println("N�o existem ra�zes reais!");
		}
	}
}
