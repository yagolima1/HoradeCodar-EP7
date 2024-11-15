import java.util.Scanner;

public class nonoExercicio {

    public static void main(String[] args) {

        // Exercício 9

        int[] numeros = new int[10];
        int soma = 0;
        Scanner entradaDados = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Por gentileza, digite o " + (i + 1) + "° número: ");
            numeros[i] = entradaDados.nextInt();

            soma += numeros[i];

        }

        System.out.println("\nOs números informados foram: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        double calculoMedia = (double) soma / 10;
        System.out.println( "\nA média dos 10 números é: " + calculoMedia);


    }

}
