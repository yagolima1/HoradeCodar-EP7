import java.util.Scanner;

public class Círculo {

    public static void main(String[] args) {

        // Exercício 4.7 Circulo

        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Digite o Raio de seu Círculo : ");
        int raio = entradaDados.nextInt();

        System.out.println("A área de seu Círculo é: " + raio * raio * 3.14f);

    }

}
