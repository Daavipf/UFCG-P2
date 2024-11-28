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
        String resultado = "";
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = sc.nextInt();
        }


        System.out.println(Arrays.toString(numeros));
    }
}