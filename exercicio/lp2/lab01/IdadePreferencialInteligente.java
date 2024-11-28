package lp2.lab01;

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Davi Pereira Ferreira - 124110513 
 * */

public class IdadePreferencialInteligente {
	public static void main(String[] args){
		int idade = 2024 - 1972;
		boolean estaGravida = false;
		int criancasDeColo = 0;
		if (idade >= 60){
			System.out.println("Preferencial idoso");
		} else if (estaGravida){
			System.out.println("Preferencial gestante");
		} else if (criancasDeColo > 0){
			System.out.println("Preferencial pois possui " + criancasDeColo + " crianças de colo.");
		} else {
			System.out.println("Você tem " + idade + " anos. Você não pode usar o atendimento preferencial.");
		}
	}
}
