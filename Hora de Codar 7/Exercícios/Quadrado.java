import java.util.Scanner;

public class Quadrado {

    public static void main(String[] args) {

        // Exercício 4.2 - Quadrado

        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Digite o lado de seu Quadrado: ");
        double lado = entradaDados.nextInt();

        System.out.println("A área de seu Quadrado é: " + lado * lado);

    }

}
