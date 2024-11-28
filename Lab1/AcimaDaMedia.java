/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Davi Pereira Ferreira - 124110513
 * */

import java.util.Scanner;
import java.util.Arrays;

public class AcimaDaMedia{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] valores = sc.nextLine().split(" ");
        //System.out.println(Arrays.toString(valores));
        float soma = 0;
        float media;
        for(String item: valores){
            soma += Integer.parseInt(item);
        }
        media = soma / valores.length;
        //System.out.println(soma);
        //System.out.println(media);
        String resultado = "";
        for(String item: valores){
            if(Float.parseFloat(item) > media){
                resultado += item + " ";
            }
        }
        System.out.println(resultado);
    }
}