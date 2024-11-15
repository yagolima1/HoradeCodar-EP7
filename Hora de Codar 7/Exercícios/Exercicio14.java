import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {

       // Exercício 14

        Scanner entradaDados = new Scanner(System.in);

        int[] notas = new int[10];
        int soma = 0;
            int aprovados = 0;

        for (int i = 0; i < 6; i++) {
            System.out.println("Por gentileza, digite a " + (i + 1) + "° nota: ");
            notas[i] = entradaDados.nextInt();

            soma += notas[i];

        }

        double calculoMedia = (double) soma / 6;
        System.out.println( "\nA média final deste aluno é de: " + calculoMedia);

        if (calculoMedia >= 6.5){
            System.out.println("Aluno Aprovado!");
            aprovados++;
        }

        else {
            System.out.println("Aluno Reprovado!");
        }

        System.out.println("Deseja calcular a media de outro aluno? Sim/Não ?");
        String resposta = entradaDados.next();

        if (resposta.equals("S")) {
            main(args);
        }

        else {
            System.out.println(aprovados + " alunos foram aprovados.");
        }

    }

}
