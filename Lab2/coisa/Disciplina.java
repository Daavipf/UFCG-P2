package br.edu.ufcg.computacao.p2lp2.coisa;
import java.util.Arrays;

public class Disciplina {
	//private int N_MINIMO_NOTAS = 1;
	private int N_PADRAO_NOTAS = 4;
	private double MEDIA_MINIMA = 7;
	
	private String disciplina;
	private int horasDeEstudo;
	private double[] notas;
	private int[] pesos;
	private boolean usaMediaPonderada = false;
	
	public Disciplina(String disciplina){
		this.disciplina = disciplina;
		this.notas = new double[N_PADRAO_NOTAS];
		this.pesos = new int[N_PADRAO_NOTAS];
		Arrays.fill(pesos, 1);
	}
	
	public Disciplina(String disciplina, int numeroDeNotas){
		this.disciplina = disciplina;
		this.notas = new double[numeroDeNotas];
		this.pesos = new int[numeroDeNotas];
		Arrays.fill(pesos, 1);
	}
	
	public Disciplina(String disciplina, int numeroDeNotas, int[] pesos){
		this.disciplina = disciplina;
		this.notas = new double[numeroDeNotas];
		this.pesos = pesos;
		this.usaMediaPonderada = true;
	}
	
	public void cadastraHoras(int horas) {
		this.horasDeEstudo = horas;
	}
	
	public void cadastraNota(int index, double nota) {
		if(index > this.notas.length) {
			return;
		}
		this.notas[index] = nota;
	}
	
	public double getMedia() {
		double soma = 0;
		for(int i = 0; i < this.notas.length; i ++) {
			soma += this.notas[i];
		}
		
		double media = soma / this.notas.length;
		return media;
	}
	
	public double getMediaPonderada() {
		double somaPesos = 0;
		double soma = 0;
		for(int i = 0; i < this.notas.length; i ++) {
			soma += this.notas[i] * this.pesos[i];
			somaPesos += this.pesos[i];
		}
		
		double media = soma / somaPesos;
		return media;
	}
	
	public boolean aprovado() {
		if(this.getMedia() >= MEDIA_MINIMA) {
			return true;
		}
		return false;
	}
	
	public boolean temMediaPonderada() {
		if(this.usaMediaPonderada) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		if(this.usaMediaPonderada) {
			return this.disciplina + " " + this.horasDeEstudo + " " + this.getMediaPonderada() + " " + Arrays.toString(notas);
		}
		return this.disciplina + " " + this.horasDeEstudo + " " + this.getMedia() + " " + Arrays.toString(notas);
	}
}
