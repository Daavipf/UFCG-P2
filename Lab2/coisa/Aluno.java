package br.edu.ufcg.computacao.p2lp2.coisa;

/* 
 * Representação de um estudante, matriculado na UFCG.
 * Todo estudante deve ter um nome, ano de nascimento e 
 * identificado por um número de matrícula.
 * 
 * @author Davi Pereira
 * */

public class Aluno {

	private String nome;

	private int anoNascimento;

	private double cra = 0.0;
	
	private String matricula;
	
	/*
	 * Construtor da classe Aluno.
	 * @param matricula Número de matrícula, no formato 2XXXYYZZ
	 * @param nome Nome do aluno
	 * @param anoNascimento Ano de dascimento do aluno, no formato YYYY
	 * */
	public Aluno(String matricula, String nome, int anoNascimento) {
		this.matricula = matricula;
		this.nome = nome;
		this.anoNascimento = anoNascimento;
	}
	
	/*
	 * Atribui um valor ao CRA do aluno
	 * @param cra Valor do CRA 
	 * */
	public void setCra(double cra) {
		this.cra = cra;
	}
	
	/*
	 * Retorna a idade do aluno no formato XX anos
	 * @return Idade do aluno
	 * */
	public int getIdade() {
		return 2024 - this.anoNascimento;
	}
	
	/*
	 * Retorna o nome do aluno numa interpolação de string
	 * @return Aluno - <Nome do aluno>
	 * */
	public String toString() {
		return "Aluno - " + this.nome;
	}
	
}
