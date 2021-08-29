package curso.java.classes;

import JAVA_POO.Aluno;

public class PrimeiraClasse {
	
	public static void main(String[]args) {
		
		
		
		/*new Aluno() é uma instancia (Criaçao de Objeto)*/
		/*aluno1 é uma referencia para o objeto aluno*/
		
		Aluno aluno1 = new Aluno();/*Aqui será o João*/
		
		aluno1.nome = "João";
		aluno1.idade = 50;

		System.out.println("Nome no aluno 1 é = " + aluno1.nome);
		System.out.println("A idade do aluno 1 é = " + aluno1.idade);
		
		
		Aluno aluno2 = new Aluno();/*Aqui será o Pedro*/
		
		Aluno aluno3 = new Aluno();/*Aqui será o Andre*/
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("José", 50);
	}

}
