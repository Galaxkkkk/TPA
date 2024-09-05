
public class ex_Altura {
	public static void main(String[] args) {
		double alturaJ, alturaP, i = 0;
		alturaJ = 1.34;
		alturaP = 1.45;
		while (alturaJ < alturaP) {
			alturaJ = alturaJ + 0.025;
			alturaP = alturaP + 0.02;
			i = i + 1;
		}
		System.out.println("Demorou " + i + " Anos");
	}
}
