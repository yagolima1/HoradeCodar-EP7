import java.util.Scanner;

public class Retângulo {

    public static void main(String[] args) {

        // Exercício 4.1 - Retângulo

        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Digite a base de seu Retângulo: ");
        double base = entradaDados.nextDouble();

        System.out.println("Agora digite a altura de seu Retângulo: ");
        double altura = entradaDados.nextDouble();

        System.out.println(" A área de seu Retângulo é: " + base * altura);

    }

}
