package br.edu.ufcg.computacao.p2lp2.coisa;

public class Descanso {
	private String status = "cansado";
	private int horasDescanso;
	private int semanas;
	private String emojiStatus = ":/";
	
	public String getStatusGeral() {
		if(this.estaDescansado()) {
			this.status = "descansado " + this.emojiStatus;
		} else {
			this.status = "cansado " + this.emojiStatus;
		}
		
		return status;
	}
	
	public void defineHorasDescanso(int horas) {
		this.horasDescanso = horas;
		
	}
	
	public void defineNumeroSemanas(int semanas) {
		this.semanas = semanas;
	}
	
	public int getHorasDescanso() {
		return this.horasDescanso;
	}
	
	public int getSemanas() {
		return this.semanas;
	}
	
	private boolean estaDescansado() {
		if(getSemanas() != 0 && getHorasDescanso() / getSemanas() >= 26) {
			return true;
		}
		return false;
	}
	
	public void definirEmoji(String emoji) {
		this.emojiStatus = emoji;
	}
}
