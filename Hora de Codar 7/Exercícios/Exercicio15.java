import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {

        // Exercício 15

        Scanner entradaDados = new Scanner(System.in);

        double anacleto = 1.50;
        double felisberto = 1.10;
        int anos = 0;

        while (felisberto <= anacleto) {

            anacleto += 0.02;
            felisberto += 0.03;
            anos++;

        }

        System.out.println("Felisberto ficará mais alto que Anacleto em " + anos + " anos.");

    }

}
