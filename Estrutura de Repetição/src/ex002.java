import java.util.Scanner;
public class ex002 {
	public static void main(String[] args) {
		int i = 0, n, r;
		Scanner input = new Scanner(System.in);
		System.out.print("Escreva um Numero:");
		n = input.nextInt();
		while (i<10) {
			i+=1;
			System.out.println(r=i*n);
		}
		input.close();
	}
}
