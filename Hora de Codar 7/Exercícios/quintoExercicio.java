import java.util.Scanner;

public class quintoExercicio {

    public static void main(String[] args) {

        // Exercício 5

        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Por gentileza, digite um número: ");
        int numero = entradaDados.nextInt();

        if (numero > 0){
            System.out.println( numero + " é positivo!");
        }

        else if (numero < 0){
            System.out.println( numero + " é negativo!");
        }

        else {
            System.out.println( numero + " é neutro!");
        }

    }

}
