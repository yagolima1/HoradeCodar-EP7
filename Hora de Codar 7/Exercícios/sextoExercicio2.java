import java.util.Scanner;

public class sextoExercicio2 {

    public static void main(String[] args) {

        // Exercício 6.1

        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Por gentileza, digite o 1° Número: ");
        double num1 = entradaDados.nextInt();

        System.out.println("Agora digite o 2° Número: ");
        double num2 = entradaDados.nextInt();

        System.out.println("Agora digite o 3° Número: ");
        double num3 = entradaDados.nextInt();

        System.out.println("Por fim, digite o 4° Número: ");
        double num4 = entradaDados.nextInt();

        if (num1 > num2 && num1 > num3 && num1 > num4){
            System.out.println(num1 + " é o maior número!");
        }

        else if (num2 > num1 && num2 > num3 && num2 > num4){
            System.out.println(num2 + " é o maior número!");
        }

        else if (num3 > num1 && num3 > num2 && num3 > num4){
            System.out.println(num3 + " é o maior número!");
        }

        else if (num4 > num1 && num4 > num2 && num4 > num3){
            System.out.println(num4 + " é o maior número!");
        }

        else {
            System.out.println("Erro, Tente Novamente mais tarde.");
        }

    }

}
