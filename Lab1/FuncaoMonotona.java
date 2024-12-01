/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Davi Pereira Ferreira - 124110513
 * */
import java.util.Scanner;
import java.util.Arrays;

public class FuncaoMonotona {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[4];
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = sc.nextInt();
        }

        boolean crescente = true;
        boolean decrescente = true;

        for(int i = 1; i < 4; i ++){
            if(numeros[i] >= numeros[i-1]){
                decrescente = false;
            }
            if(numeros[i] <= numeros[i-1]){
                crescente = false;
            }
        }

        if (crescente) {
            System.out.println("POSSIVELMENTE ESTRITAMENTE CRESCENTE");
        } else if (decrescente) {
            System.out.println("POSSIVELMENTE ESTRITAMENTE DECRESCENTE");
        } else {
            System.out.println("FUNCAO NAO ESTRITAMENTE CRES/DECR");
        }

        sc.close();
    }
}