import java.util.Scanner;

public class Losango {

    public static void main(String[] args) {

        // Exercício 4.3 Losango

        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Digite a Diagonal Maior de seu Losango: ");
        double diagonal = entradaDados.nextDouble();

        System.out.println("Digite a Diagonal Menor de seu Losango: ");
        double diagonalMenor = entradaDados.nextDouble();

        System.out.println("Digite a Altura de seu Losango: ");
        double altura2 = entradaDados.nextDouble();

        System.out.println("A área de seu Losango é: " + (diagonal + diagonalMenor) * altura2 / 2);

    }

}
