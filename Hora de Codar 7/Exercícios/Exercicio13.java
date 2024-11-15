import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {

        // Exercicio 13

        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Informe 1° número: ");
        int num1 = entradaDados.nextInt();

        System.out.println(" Agora informe o 2° número: ");
        int num2 = entradaDados.nextInt();

        int soma = 0;
        int total_de_numeros = 0;

        for (int i = num1; i <= num2; i++) {

            soma = soma + i;
            total_de_numeros++;

        }

        int media = soma / total_de_numeros;
        System.out.println("A média aritmética de " + num1 + " , " + num2 + " e todos os números entre eles é: " + media);

    }

}
