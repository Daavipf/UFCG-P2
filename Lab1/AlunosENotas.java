/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Davi Pereira Ferreira - 124110513
 * */
import java.util.Arrays;
import java.util.Scanner;

public class AlunosENotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maiorNota = 0;
        int menorNota = 0;
        int qtdNotas = 0;
        int soma = 0;
        int media = 0;
        int acima = 0;
        int abaixo = 0;
        while (true){
            String[] aluno = sc.nextLine().split(" ");
            if (Arrays.asList(aluno).contains("-")){
                break;
            }

            int notaAluno = Integer.parseInt(aluno[1]);
            qtdNotas++;
            soma += notaAluno;
            media = soma / qtdNotas;
            if (notaAluno > maiorNota){
                maiorNota = notaAluno;
            }
            if(menorNota == 0){
                menorNota = maiorNota;
            }
            if (notaAluno < menorNota){
                menorNota = notaAluno;
            }
            if (notaAluno >= 700){
                acima += 1;
            }
            if (notaAluno < 700){
                abaixo += 1;
            }
        }

        System.out.println("maior: " + maiorNota);
        System.out.println("menor: " + menorNota);
        System.out.println("media: " + media);
        System.out.println("acima: " + acima);
        System.out.println("abaixo: " + abaixo);
    }
}
