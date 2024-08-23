import java.util.Scanner;
public class ex002 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float km, litros, consumo;
		System.out.print("Digite a quantidade da Km Rodados: ");
		km = input.nextFloat();
		System.out.print("Digite a quantidade de Combustivel Gasto (Litros): ");
		litros = input.nextFloat();
		consumo = km / litros;
		if (consumo < 10) {
			System.out.println("Não Econômico!");
		}else {
			System.out.println("Econômico");
		}
	}
}
