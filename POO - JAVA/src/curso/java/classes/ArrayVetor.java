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
	
	/*Cria��o do aluno2*/
	Aluno aluno2 = new Aluno();
	aluno2.setNome("Andre Luiz da Silva - 2");
	aluno2.setNomeEscola("JDEV Treinamento");
		
	/*Cria��o da disciplina*/
	Disciplina disciplina3 = new Disciplina();
	disciplina3.setDisciplina("Curso de Java");
	disciplina3.setNota(notas);
	
	
	aluno2.getDisciplinas().add(disciplina3);
	
	Disciplina disciplina4 = new Disciplina();
	disciplina4.setDisciplina("l�gica de programa��o");
	disciplina4.setNota(notasLogica);
	
	aluno2.getDisciplinas().add(disciplina4);
	
	
	//---------------------------------------------------//
	
	Aluno[] arrayAlunos = new Aluno[2];
	
	arrayAlunos[0] = aluno;
	arrayAlunos[1] = aluno2;
	
	for (int pos = 0; pos < arrayAlunos.length; pos ++) {
		System.out.println("Nome do aluno �: " + arrayAlunos[pos].getNome());
		
		for (Disciplina d : arrayAlunos[pos].getDisciplinas()) {
			System.out.println("Nome da disciplina � : " + d.getDisciplina());
			
			for (int posnota = 0; posnota < d.getNota().length; posnota++) {
				System.out.println("A nota n�mero: " + posnota + " � igual = " + d.getNota()[posnota]);
			}
		}
	}
	
	}
			

}


		
		


