import java.util.Scanner;
public class ex007 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        String nomeMaisVelho = "";
        int idadeMaisVelho = 0;
        String nomeMaisNovo = "";
        int idadeMaisNovo = Integer.MAX_VALUE;
        for (int i = 0; i < 5; i++) {
            System.out.print("Informe o nome do usu�rio: ");
            String nome = input.nextLine();
            System.out.print("Informe a idade do usu�rio: ");
            int idade = Integer.parseInt(input.nextLine());
            if (idade > idadeMaisVelho) {
                nomeMaisVelho = nome;
                idadeMaisVelho = idade;
            }else if (idade < idadeMaisNovo) {
                nomeMaisNovo = nome;
                idadeMaisNovo = idade;
            }
        }
        System.out.println("Usu�rio mais velho: " + nomeMaisVelho + " com " + idadeMaisVelho + " anos");
        System.out.println("Usu�rio mais novo: " + nomeMaisNovo + " com " + idadeMaisNovo + " anos");
	}
}
