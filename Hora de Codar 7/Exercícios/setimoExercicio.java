import java.util.Scanner;

public class setimoExercicio {

    public static void main(String[] args) {

       // Exercício 7

        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Por gentileza, digite o 1° Número: ");
        double num1 = entradaDados.nextInt();

        System.out.println("Agora digite o 2° Número: ");
        double num2 = entradaDados.nextInt();

        System.out.println("Por fim, digite o 3° Número: ");
        double num3 = entradaDados.nextInt();

        if (num1 > num3 && num2 > num3) {
            System.out.println("A soma dos 2 maiores números é: " + (num1 + num2));
        }

        else if (num1 > num2 && num3 > num2) {
            System.out.println("A soma dos 2 maiores números é: " + (num1 + num3));
        }

        else if (num2 > num1 && num3 > num1) {
            System.out.println("A soma dos 2 maiores números é: " + (num2 + num3));
        }

    }

}
