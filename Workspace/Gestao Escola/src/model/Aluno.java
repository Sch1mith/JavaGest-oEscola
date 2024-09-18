package model;

import control.Pessoas;

public class Aluno extends Pessoa implements Pessoas {

	private int matricula;
	private static int countAluno;
	
	public Aluno(String nome, int idade) {
		super(nome, idade);
		countAluno++;
		this.matricula = countAluno;
	}

	@Override
	public void atividade() {
		System.out.println("Praticando Violão...");
	}

	@Override
	public int getId() {
		return this.matricula;
	}
	
}
