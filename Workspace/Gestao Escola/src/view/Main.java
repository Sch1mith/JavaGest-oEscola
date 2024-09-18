package view;
import model.*;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Aluno tonia = new Aluno("Tonia", 15);
		Aluno chris = new Aluno("Chris", 19);
		Professor drew = new Professor("Drew", 16);
		Professor julius = new Professor("Julius", 49);
		Funcionario rochele = new Funcionario ("Rochele", 47);
		
		ArrayList<Pessoa> escola = new ArrayList<Pessoa>();
		
		escola.add(tonia);
		escola.add(rochele);
		escola.add(julius);
		escola.add(chris);
		escola.add(drew);
		int tamanho = escola.size();		
		for (int i = 0; i < tamanho; i++) {
			escola.get(i).atividade();
		}	
		
		System.out.println("\n");
		
		System.out.println("Matricula do aluno " +  tonia.getNome() +  " -> " + " " + tonia.getId());
		System.out.println("Numero do cracha " +  rochele.getNome() +  " -> " + " " + rochele.getId());
		System.out.println("Registro de professor " +  julius.getNome() +  " -> " + " " + julius.getId());
		System.out.println("Matricula do aluno " +  chris.getNome() +  " -> " + " " + chris.getId());
		System.out.println("Registro de professor " +  drew.getNome() +  " -> " + " " + drew.getId());
		
	}

}
