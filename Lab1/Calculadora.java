/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Davi Pereira Ferreira - 124110513
 * */
import java.util.Scanner;

public class Calculadora{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String operacao = sc.nextLine();
        if(!operacao.equals("+") && !operacao.equals("-") && !operacao.equals("*") && !operacao.equals("/")){
            System.out.println("ENTRADA INVALIDA");
            return;
        }
        float numero1 = sc.nextFloat();
        float numero2 = sc.nextFloat();
        switch (operacao){
            case "+":
                System.out.println("RESULTADO: " + (numero1 + numero2));
                break;
            case "-":
                System.out.println("RESULTADO: " + (numero1 - numero2));
                break;
            case "*":
                System.out.println("RESULTADO: " + (numero1 * numero2));
                break;
            case "/":
                if(numero2 == 0){
                    System.out.println("ERRO");
                } else {
                    System.out.println("RESULTADO: " + (numero1 / numero2));
                }
                break;
        }
    }
}