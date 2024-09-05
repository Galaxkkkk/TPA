
public class ex_Tabuada {
	public static void main(String[] args) {
        int n1 = 1, i = 1;
        while (n1 <= 10) {
            System.out.println("Tabuada do " + n1 + ":");
            
            while (i <= 10) {
                System.out.println(n1 + " x " + i + " = " + (n1 * i));
                i++;
            }
            System.out.println(); 
            n1++;
        }
    }
}
