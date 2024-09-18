package model;
import control.*;

public class Professor extends Pessoa implements Pessoas{

	private static int countProfessor;
	private int RegisFuncionario;
	
	public Professor(String nome, int idade) {
		super(nome, idade);
		countProfessor++;
		this.RegisFuncionario = countProfessor;
	}

	@Override
	public void atividade() {
		System.out.println("Ministrando aula...");
	}
	
	@Override
	public int getId() {
		return this.RegisFuncionario;
	}


}
