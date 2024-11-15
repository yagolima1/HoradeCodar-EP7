import java.util.Scanner;

public class setimoExercicio2 {

    public static void main(String[] args) {

        // Exercício 7.1

        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Por gentileza, digite o 1° Número: ");
        double num1 = entradaDados.nextInt();

        System.out.println("Agora digite o 2° Número: ");
        double num2 = entradaDados.nextInt();

        System.out.println("Agora digite o 3° Número: ");
        double num3 = entradaDados.nextInt();

        System.out.println("Agora digite o 4° Número: ");
        double num4 = entradaDados.nextInt();

        System.out.println("Por fim, digite o 5° Número: ");
        double num5 = entradaDados.nextInt();

        if (num1 > num3 && num1 > num4 && num1 > num5 && num2 > num3 && num2 > num4 && num2 > num5) {
            System.out.println("A soma dos 2 maiores números é: " + (num1 + num2));
        }

        else if (num1 > num2 && num1 > num4 && num1 > num5 && num3 > num2 && num3 > num4 && num3 > num5) {
            System.out.println("A soma dos 2 maiores números é: " + (num1 + num3));
        }

        else if (num1 > num2 && num1 > num3 && num1 > num5 && num4 > num2 && num4 > num3 && num4 > num5) {
            System.out.println("A soma dos 2 maiores números é: " + (num1 + num4));
        }

        else if (num1 > num2 && num1 > num3 && num1 > num4 && num5 > num2 && num5 > num3 && num5 > num4) {
            System.out.println("A soma dos 2 maiores números é: " + (num1 + num5));
        }

        else if (num2 > num1 && num2 > num4 && num2 > num5 && num3 > num1 && num3 > num4 && num3 > num5) {
            System.out.println("A soma dos 2 maiores números é: " + (num2 + num3));
        }

        else if (num2 > num1 && num2 > num3 && num2 > num5 && num4 > num1 && num4 > num3 && num4 > num5) {
            System.out.println("A soma dos 2 maiores números é: " + (num2 + num4));
        }

        else if (num2 > num1 && num2 > num3 && num2 > num4 && num5 > num1 && num5 > num3 && num5 > num4) {
            System.out.println("A soma dos 2 maiores números é: " + (num2 + num5));
        }

        else if (num3 > num1 && num3 > num2 && num3 > num5 && num4 > num1 && num4 > num2 && num4 > num5) {
            System.out.println("A soma dos 2 maiores números é: " + (num3 + num4));
        }

        else if (num3 > num1 && num3 > num2 && num3 > num4 && num5 > num1 && num5 > num2 && num5 > num4) {
            System.out.println("A soma dos 2 maiores números é: " + (num3 + num5));
        }

        else if (num4 > num1 && num4 > num2 && num4 > num3 && num5 > num1 && num5 > num2 && num5 > num3) {
            System.out.println("A soma dos 2 maiores números é: " + (num4 + num5));
        }

        else {
            System.out.println("Erro, Tente Novamente mais tarde.");
        }

    }

}
