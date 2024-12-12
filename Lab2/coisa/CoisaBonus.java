package br.edu.ufcg.computacao.p2lp2.coisa;

import java.util.Scanner;

public class CoisaBonus {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		final String MainMenu = "CoISA - Menu"
				 + "\n1 - Registro de descanso"
				 + "\n2 - Registro de tempo"
				 + "\n3 - Registro de Disciplina"
				 + "\n4 - Registro de resumos"
				 + "\n0 - Sair";
		
		int op;
		do {
			System.out.println(MainMenu);			
			op = sc.nextInt();
			
			switch(op) {
				case 1:
					registroDescanso();
					break;
				case 2:
					registroTempo();
					break;
				case 3:
					registroDisciplina();
					break;
				case 4:
					registroResumos();
					break;
				case 0:
					System.out.println("Saindo...");
					break;
				default:
					System.out.println("Opção inválida");
					break;
			}
		} while(op != 0);
		sc.close();
	}
	
	private static void registroDescanso() {
		Descanso descanso = new Descanso();
		System.out.println(descanso.getStatusGeral());
		descanso.defineHorasDescanso(12);
		descanso.defineNumeroSemanas(1);
		System.out.println(descanso.getStatusGeral());
		
		descanso.defineHorasDescanso(30);
		descanso.defineNumeroSemanas(1);
		descanso.definirEmoji(">:)");
		System.out.println(descanso.getStatusGeral());
	}
	
	private static void registroTempo() {
		RegistroTempoOnline tempoOnlineP2 = new RegistroTempoOnline("P2", 20);
		System.out.println(tempoOnlineP2.toString());
		tempoOnlineP2.adicionaTempoOnline(10);
		System.out.println(tempoOnlineP2.toString());
		tempoOnlineP2.adicionaTempoOnline(10);
		System.out.println(tempoOnlineP2.toString());
		
		if(tempoOnlineP2.atingiuMetaTempoOnline()) {
			System.out.println("Meta atingida");
		}
	}
	
	private static void registroDisciplina() {
		int[] pesos = {2, 1, 2};
		Disciplina disciplina = new Disciplina("P2", 3, pesos);
		disciplina.cadastraHoras(30);
		disciplina.cadastraNota(0, 9);
		disciplina.cadastraNota(1, 8);
		disciplina.cadastraNota(2, 10);
		System.out.println(disciplina.toString());
		
		Disciplina disciplina2 = new Disciplina("FMCC-2", 3, pesos);
		disciplina2.cadastraHoras(60);
		disciplina2.cadastraNota(0, 3.6);
		disciplina2.cadastraNota(1, 5);
		disciplina2.cadastraNota(2, 2.5);
		System.out.println(disciplina2.toString());
	}
	
	private static void registroResumos() {
		RegistroResumos registroResumos = new RegistroResumos(10);
		registroResumos.adiciona("Classes", "Classes definem um tipo e a base de código para criação de objetos.");
		registroResumos.adiciona("Tipos", "Identifica a semântica (operações e significados) de um conjunto de dados.");
		registroResumos.adiciona("Classes", "Este resumo não será adicionado");
		System.out.println(registroResumos.imprimeResumos());
		
		String[] resumos = registroResumos.pegaResumos();
		for(String resumo: resumos) {
			System.out.println(resumo);
		}
		
		String[] resultadosBusca = registroResumos.busca("definem");
		for(String resultado: resultadosBusca) {
			System.out.println(resultado);
		}
	}
}
