/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Davi Pereira Ferreira - 124110513
 * */
import java.util.Scanner;
import java.util.Arrays;

public class OndeEstaWally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            String[] nomes = sc.nextLine().split(" ");
            if (Arrays.asList(nomes).contains("wally")){
                break;
            }
            String possivelNome = "?";
            for(String nome : nomes){
                if (nome.length() == 5){
                    possivelNome = nome;
                }
            }
            System.out.println(possivelNome);
        }
    }
}