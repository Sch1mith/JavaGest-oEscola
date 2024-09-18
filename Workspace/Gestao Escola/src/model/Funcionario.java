package model;
import control.*;

public class Funcionario extends Pessoa implements Pessoas{
	
	private static int countFuncionario;
	private int numCracha;
	
	public Funcionario(String nome, int idade) {
		super (nome, idade);
		countFuncionario++;
		this.numCracha = countFuncionario;
		
	}

	@Override
	public void atividade() {
		System.out.println("Administrando...");
		
	}
	
	@Override
	public int getId() {
		return this.numCracha;
	}


}
