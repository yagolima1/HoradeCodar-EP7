import java.util.Scanner;

public class terceiroExercicio {

    public static void main(String[] args) {

        String text = " ";
        int idade = 0;

        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        text = entradaDados.next();

        System.out.println("Digite sua idade: ");
        idade = entradaDados.nextInt();

        System.out.println("Olá, " + text + " !" + " Sua idade é: " + idade + " anos.");

    }

}
