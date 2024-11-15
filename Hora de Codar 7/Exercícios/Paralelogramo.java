import java.util.Scanner;

public class Paralelogramo {

    public static void main(String[] args) {

        // Exercício 4.5 Paraletogramo

        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Digite a Base de seu Paralelogramo: ");
        double base2 = entradaDados.nextDouble();

        System.out.println("Agora digite a altura de seu Paralelogramo: ");
        double altura3 = entradaDados.nextDouble();

        System.out.println("A área de seu Paralelogramo é: " + base2 * altura3);

    }

}
