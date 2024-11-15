import java.util.Scanner;

public class Trapézio {

    public static void main(String[] args) {

        // Exercício 4.4 Trapézio

        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Digite a Base Maior de seu Trapézio: ");
        double baseMaior = entradaDados.nextDouble();

        System.out.println("Digite a Base Menor de seu Trapézio: ");
        double baseMenor = entradaDados.nextDouble();

        System.out.println("Digite a Altura de seu Trapézio: ");
        double altura1 = entradaDados.nextDouble();

        System.out.println("A área de seu Trapézio é: " + (baseMaior + baseMenor) * altura1 / 2);

    }

}
