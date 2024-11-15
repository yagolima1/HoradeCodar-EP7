import java.util.Scanner;

public class Triângulo {

    public static void main(String[] args) {

        // Exercício 4.6 Triângulo

        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Digite a Base de seu Triângulo: ");
        double base3 = entradaDados.nextDouble();

        System.out.println("Digite a Altura de seu Triângulo: ");
        double altura4 = entradaDados.nextDouble();

        System.out.println("A área de seu Triângulo é: " + base3 * altura4 / 2);

    }

}
