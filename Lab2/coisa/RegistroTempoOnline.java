package br.edu.ufcg.computacao.p2lp2.coisa;

public class RegistroTempoOnline {
	private String disciplina;
	private int horasDedicadas = 0;
	private int horasEsperadas = 120;
	
	public RegistroTempoOnline(String disciplina, int horas){
		this.disciplina = disciplina;
		this.horasEsperadas = horas;
	}
	
	public RegistroTempoOnline(String disciplina){
		this.disciplina = disciplina;
	}
	
	public void adicionaTempoOnline(int horas) {
		this.horasDedicadas += horas;
	}
	
	public boolean atingiuMetaTempoOnline() {
		if(this.horasDedicadas >= this.horasEsperadas) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return this.disciplina + " " + this.horasDedicadas + "/" + this.horasEsperadas;
	}
}
