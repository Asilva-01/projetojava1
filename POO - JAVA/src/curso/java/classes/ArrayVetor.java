package curso.java.classes;

import javax.swing.JOptionPane;

import JAVA_POO.Aluno;
import JAVA_POO.Disciplina;

public class ArrayVetor {
	
	/*Usado para executar código*/
	public static void main(String[] args) {
		
	double[] notas = {8.9, 9.7, 7.6, 6.8};	
	double[] notasLogica = {7.8, 8.6, 9.5, 8.9};	
	
	
	/*Criação do aluno*/
	Aluno aluno = new Aluno();
	aluno.setNome("Andre Luiz da Silva");
	aluno.setNomeEscola("JDEV Treinamento");
		
	/*Criação da disciplina*/
	Disciplina disciplina = new Disciplina();
	disciplina.setDisciplina("Curso de Java");
	disciplina.setNota(notas);
	
	
	aluno.getDisciplinas().add(disciplina);
	
	Disciplina disciplina2 = new Disciplina();
	disciplina2.setDisciplina("lógica de programação");
	disciplina2.setNota(notasLogica);
	
	aluno.getDisciplinas().add(disciplina2);
	
	
	System.out.println("Nome do aluno = " + aluno.getNome() + " inscrito no curso : " + aluno.getNomeEscola());
	System.out.println("--------------Disciplina do aluno---------------");
	for (Disciplina d : aluno.getDisciplinas()) {
		
		
		System.out.println("Disciplina: " + d.getDisciplina());
		System.out.println("As notas da disciplina são: ");
		
		double notaMax = 0.0;
		for (int pos = 0; pos <d.getNota().length; pos++) {
			System.out.println("Nota " + pos + " é igual = " + d.getNota()[pos]);
			
			
			
			if (pos == 0) {
				notaMax = d.getNota()[pos];
			}else {
				if (d.getNota()[pos] > notaMax) {
					notaMax = d.getNota()[pos];
				}
			}
						
		}
		
		System.out.println("A maior nota da Disciplina = " + d.getDisciplina() + " é de valor : " + notaMax);
	}
		
	}
	
}

		
		


