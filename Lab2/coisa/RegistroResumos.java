package br.edu.ufcg.computacao.p2lp2.coisa;

import java.util.Arrays;

public class RegistroResumos {
	private int numeroDeResumos;
	private String[] temas;
	private String[] resumos;
	private int indexControle = 0;
	
	public RegistroResumos(int numero) {
		this.numeroDeResumos = numero;
		this.resumos = new String[this.numeroDeResumos];
		this.temas = new String[this.numeroDeResumos];
	}
	
	public void adiciona(String tema, String resumo) {
		
		if(this.temResumo(tema)) {
			return;
		}

		this.temas[this.indexControle] = tema;
		this.resumos[this.indexControle] = resumo;
		indexControle++;
	}
	
	
	public String[] pegaResumos() {
		String[] resumosRegistrados = new String[this.indexControle];
		for(int i = 0; i < this.indexControle; i++) {
			resumosRegistrados[i] = this.temas[i] + ": " + this.resumos[i];
		}
		return resumosRegistrados;
	}
	
	public int conta() {
		return this.indexControle;
	}
	
	public String imprimeResumos() {
		String numeroResumos = this.indexControle + " resumo(s) cadastrado(s)";
		String temas = "";
		for(int i = 0; i < this.indexControle - 1; i++) {
			temas += this.temas[i] + " | ";
		}
		temas += this.temas[this.indexControle-1];
		return "- " + numeroResumos + "\n- " + temas; 
	}
	
	public boolean temResumo(String tema) {
		for(int i = 0; i < this.indexControle; i++) {
			if(this.temas[i] != null && this.temas[i].equals(tema)) {
				return true;
			}
		}
		return false;
	}
	
	public String[] busca(String chaveDeBusca) {
		String[] resultado = new String[this.indexControle];
		Arrays.fill(resultado, "");
		int index = 0;
		
		for(int i = 0; i < this.indexControle; i++) {
			String resumo = this.resumos[i].toLowerCase();
			String chave = chaveDeBusca.toLowerCase();
			if(resumo.contains(chave)) {
				resultado[index] = this.temas[i];
				index++;
			}
		}
		Arrays.sort(resultado);
		return resultado;
	}
	
}
