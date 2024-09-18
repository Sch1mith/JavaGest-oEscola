package model;

public abstract class Pessoa{
	private String nome;
	private int idade;
	private static int countPessoa;
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		countPessoa++;
	}
	
		public abstract void atividade();
		
		
		public String getNome() {
			return this.nome;
		}
		
		public int getIdade() {
			return this.idade;
		}
		
		public static int getCountPessoa() {
			return countPessoa;
		}

		
		
}
