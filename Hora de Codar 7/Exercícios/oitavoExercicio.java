import java.util.Scanner;

public class oitavoExercicio {

    public static void main(String[] args) {

        // Exercício 8

        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Por gentileza, digite o 1° Número: ");
        double num1 = entradaDados.nextInt();

        System.out.println("Agora digite o 2° Número: ");
        double num2 = entradaDados.nextInt();

        if (num2 == 0 || num2 < 0) {
            System.out.println("Erro, Escolha outro Número!");
        }

        else {
            System.out.println("A divisão dos 2 números é: " + (num1 / num2));
        }

    }

}
