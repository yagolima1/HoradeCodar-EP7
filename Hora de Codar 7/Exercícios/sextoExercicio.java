import java.util.Scanner;

public class sextoExercicio {

    public static void main(String[] args) {

        // Exercicio 6

        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Por gentileza, digite o 1° Número: ");
        double numero1 = entradaDados.nextInt();

        System.out.println("Agora digite o 2° Número: ");
        double numero2 = entradaDados.nextInt();

        System.out.println("Por fim, digite o 3° Número: ");
        double numero3 = entradaDados.nextInt();

        if (numero1 > numero2 && numero1 > numero3){
            System.out.println(numero1 + " é o maior número!");
        }

        else if (numero2 > numero1 && numero2 > numero3){
            System.out.println(numero2 + " é o maior número!");
        }

        else if (numero3 > numero1 && numero3 > numero2){
            System.out.println(numero3 + " é o maior número!");
        }

        else {
            System.out.println("Erro, Tente Novamente mais tarde.");
        }

    }

}
