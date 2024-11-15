import java.util.Scanner;

public class decimoExercicio {

    public static void main(String[] args) {

     // Exercício 10

        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Por gentileza, digite a 1° Nota: ");
        double nota1 = entradaDados.nextDouble();

        System.out.println("Agora digite a 2° Nota: ");
        double nota2 = entradaDados.nextDouble();

        System.out.println("Agora digite a 3° Nota: ");
        double nota3 = entradaDados.nextDouble();

        System.out.println("Por fim, digite a 4° Nota: ");
        double nota4 = entradaDados.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A média das notas é: " + media);

        if (media >= 6) {
            System.out.println("Parabéns, Voce foi Aprovado!");
        }

    }

}
