package br.edu.ufcg.computacao.p2lp2.coisa;

//import java.util.Arrays;
import java.util.Scanner;

public class MainCoisa {
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
		System.out.flush();
		//Scanner sc = new Scanner(System.in);
		Descanso descanso = new Descanso();
		int op;
		final String descansoMenu = "Gerenciamento de Descanso"
				 + "\n1 - Ver status geral"
				 + "\n2 - Definir horas de descanso"
				 + "\n3 - Definir numero de semanas"
				 + "\n4 - Definir emoji"
				 + "\n0 - Voltar";
		do {
			
			System.out.println(descansoMenu);
			op = sc.nextInt();
			
			switch(op) {
				case 1:
					System.out.println(descanso.getStatusGeral());
					break;
				case 2:
					System.out.println("Insira as horas de descanso: ");
					int horas = sc.nextInt();
					descanso.defineHorasDescanso(horas);
					break;
				case 3:
					System.out.println("Insira o número de semanas de descanso: ");
					int semanas = sc.nextInt();
					descanso.defineNumeroSemanas(semanas);
					break;
				case 4:
					System.out.println("Insira o emoji: ");
					sc.nextLine();
					String emoji = sc.nextLine();
					descanso.definirEmoji(emoji);
					break;
				case 0:
					break;
				default:
					System.out.println("Opção inválida");
					break;
			}
		} while(op != 0);
	}

	private static void registroTempo() {
		System.out.flush();
		//Scanner sc = new Scanner(System.in);
		RegistroTempoOnline tempoOnline = null;
		int op;
		final String tempoMenu = "Gerenciamento de Tempo"
				 + "\n1 - Registra disciplina"
				 + "\n2 - Adiciona tempo online"
				 + "\n3 - Verifica meta de tempo"
				 + "\n4 - Verifica dados da disciplina"
				 + "\n0 - Voltar";
		do {
			System.out.println(tempoMenu);
			op = sc.nextInt();
			
			switch(op) {
				case 1:
					sc.nextLine();
					System.out.println("Insira o nome da disciplina: ");
					String disciplina = sc.nextLine();
					System.out.println("Insira as horas requeridas pela disciplina: ");
					int horas = sc.nextInt();
					tempoOnline = new RegistroTempoOnline(disciplina, horas);
					break;
				case 2:
					if(tempoOnline == null) {
						System.out.println("Disciplina ainda não cadastrada");
						break;
					}
					System.out.println("Insira a quantidade de horas: ");
					int horasOnline = sc.nextInt();
					tempoOnline.adicionaTempoOnline(horasOnline);
					break;
				case 3:
					if(tempoOnline == null) {
						System.out.println("Disciplina ainda não cadastrada");
						break;
					}
					if(tempoOnline.atingiuMetaTempoOnline()) {
						System.out.println("Atingiu a meta.");
					} else {
						System.out.println("Não atingiu a meta.");
					}
					break;
				case 4:
					if(tempoOnline == null) {
						System.out.println("Disciplina ainda não cadastrada");
						break;
					}
					System.out.println("Nome / Horas dedicadas / Horas necessárias");
					System.out.println(tempoOnline.toString());
				case 0:
					break;
				default:
					System.out.println("Opção inválida");
					break;
			}
		} while(op != 0);
	}

	//EM ANDAMENTO
	private static void registroDisciplina() {
		System.out.flush();
		Disciplina disciplina = null;
		int[] pesos;
		int qtdNotas = 0;
		int indiceNovaNota = 0;
		int op;
		final String disciplinaMenu = "Gerenciamento de Disciplina"
				 + "\n1 - Cadastra disciplina"
				 + "\n2 - Cadastra horas de estudo"
				 + "\n3 - Cadastra nota"
				 + "\n4 - Verifica média"
				 + "\n5 - Verifica aprovação"
				 + "\n6 - Verifica dados da disciplina"
				 + "\n0 - Voltar";
		
		do {
			System.out.println(disciplinaMenu);
			op = sc.nextInt();
			
			
			
			switch(op) {
				case 1:
					sc.nextLine();
					System.out.println("Insira o nome da disciplina: ");
					String disciplinaNome = sc.nextLine();
					
					System.out.println("Insira a quantidade de notas da disciplina: ");
					qtdNotas = sc.nextInt();
					
					System.out.println("A disciplina utiliza média ponderada? (s - sim/ n - não)");
					sc.nextLine();
					String temMediaPonderada = sc.nextLine();
					
					if(temMediaPonderada.equals("s")) {
						System.out.println("Insira os pesos em ordem por nota: ");
						pesos = new int[qtdNotas];
						for(int i = 0; i < qtdNotas; i++) {
							pesos[i] = sc.nextInt();
						}
						
						disciplina = new Disciplina(disciplinaNome, qtdNotas, pesos);
						break;
					} else {
						disciplina = new Disciplina(disciplinaNome, qtdNotas);
						break;
					}
				case 2:
					if(disciplina == null) {
						System.out.println("Disciplina ainda não cadastrada.");
						break;
					}
					
					System.out.println("Insira as horas: ");
					int horas = sc.nextInt();
					disciplina.cadastraHoras(horas);
					break;
				case 3:
					if(disciplina == null) {
						System.out.println("Disciplina ainda não cadastrada.");
						break;
					}
					
					if(indiceNovaNota == qtdNotas) {
						System.out.println("Quantidade máxima de notas cadastradas.");
						break;
					}
					
					System.out.println("Insira a nota: ");
					double nota = sc.nextDouble();
					disciplina.cadastraNota(indiceNovaNota, nota);
					
					indiceNovaNota++;
					break;
				case 4:
					if(disciplina == null) {
						System.out.println("Disciplina ainda não cadastrada.");
						break;
					}
					
					System.out.println("Média atual:");
					if(disciplina.temMediaPonderada()) {
						System.out.println(disciplina.getMediaPonderada());
					} else {
						System.out.println(disciplina.getMedia());
					}
					break;
				case 5:
					if(disciplina == null) {
						System.out.println("Disciplina ainda não cadastrada.");
						break;
					}
					
					if(disciplina.aprovado()) {
						System.out.println("Aprovado");
					} else {
						System.out.println("Reprovado");
					}
					break;
				case 6:
					if(disciplina == null) {
						System.out.println("Disciplina ainda não cadastrada.");
						break;
					}
					
					System.out.println("Nome - Horas de estudo - Média - Notas");
					
					System.out.println(disciplina.toString());
					break;
				case 0:
					break;
				default:
					System.out.println("Opção inválida");
					break;
			}
		} while(op != 0);
	}

	private static void registroResumos() {
		System.out.flush();
		System.out.println("Resumos");
	}
}
