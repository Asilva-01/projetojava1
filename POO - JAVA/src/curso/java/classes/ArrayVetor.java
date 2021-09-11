package curso.java.classes;

import javax.swing.JOptionPane;

import JAVA_POO.Aluno;
import JAVA_POO.Disciplina;

public class ArrayVetor {
	
	/*Usado para executar c�digo*/
	public static void main(String[] args) {
		
	double[] notas = {8.9, 9.7, 7.6, 6.8};	
	double[] notasLogica = {7.8, 8.6, 9.5, 8.9};	
	
	
	/*Cria��o do aluno*/
	Aluno aluno = new Aluno();
	aluno.setNome("Andre Luiz da Silva");
	aluno.setNomeEscola("JDEV Treinamento");
		
	/*Cria��o da disciplina*/
	Disciplina disciplina = new Disciplina();
	disciplina.setDisciplina("Curso de Java");
	disciplina.setNota(notas);
	
	
	aluno.getDisciplinas().add(disciplina);
	
	Disciplina disciplina2 = new Disciplina();
	disciplina2.setDisciplina("l�gica de programa��o");
	disciplina2.setNota(notasLogica);
	
	aluno.getDisciplinas().add(disciplina2);
		
	}
	
}

		
		


