package curso.java.classes;

import JAVA_POO.Aluno;

public class PrimeiraClasse {
	
	public static void main(String[]args) {
		
		
		
		/*new Aluno() � uma instancia (Cria�ao de Objeto)*/
		/*aluno1 � uma referencia para o objeto aluno*/
		
		Aluno aluno1 = new Aluno();/*Aqui ser� o Jo�o*/
		
		aluno1.nome = "Jo�o";
		aluno1.idade = 50;

		System.out.println("Nome no aluno 1 � = " + aluno1.nome);
		System.out.println("A idade do aluno 1 � = " + aluno1.idade);
		
		
		Aluno aluno2 = new Aluno();/*Aqui ser� o Pedro*/
		
		Aluno aluno3 = new Aluno();/*Aqui ser� o Andre*/
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("Jos�", 50);
	}

}
