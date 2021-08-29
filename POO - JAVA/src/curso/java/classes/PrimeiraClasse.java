package curso.java.classes;

import JAVA_POO.Aluno;

public class PrimeiraClasse {
	
	public static void main(String[]args) {
		
		
		
		/*new Aluno() é uma instancia (Criaçao de Objeto)*/
		/*aluno1 é uma referencia para o objeto aluno*/
		
		Aluno aluno1 = new Aluno();/*Aqui será o João*/

		aluno1.setNome("João da Silva");
		aluno1.setIdade(50);
		aluno1.setDataNascimento("18/10/1987");
		aluno1.setRegistroGeral("44554.45544.545");
		aluno1.setNumeroCpf("215.337.655-55");
		aluno1.setNomeMae("Ana Rosa");
		aluno1.setNomePai("Raimundo");
		aluno1.setDataMatricula("10/01/2021");
		aluno1.setSerieMatriculado("5");
		aluno1.setNomeEscola("JDEV Treinamento");
		
		System.out.println("Nome é = " + aluno1.getNome());
		System.out.println("Idade é = " + aluno1.getIdade());
		System.out.println("A data de Nascimento é = " + aluno1.getDataNascimento());
		System.out.println("A escola é = " + aluno1.getNomeEscola());
		/*=====================================================*/
		
		System.out.println("------------------------------------------------------");
		
		Aluno aluno2 = new Aluno();/*Aqui será o Pedro*/
		aluno2.setNome("Pedro");
		aluno2.setIdade(40);
		aluno2.setDataNascimento("18/10/1981");
		aluno2.setRegistroGeral("44554.45544.545");
		aluno2.setNumeroCpf("215.447.555-55");
		aluno2.setNomeMae("Ana Lucia");
		aluno2.setNomePai("Juares");
		aluno2.setDataMatricula("10/02/2021");
		aluno2.setSerieMatriculado("6");
		aluno2.setNomeEscola("JDEV Treinamento");
		
		System.out.println("Nome é do aluno 2 = " + aluno2.getNome());
		System.out.println("Idade do " + aluno2.getNome() + " é : "+ aluno2.getIdade());
		System.out.println("A data de Nascimento do aluno 2 é = " + aluno2.getDataNascimento());
		System.out.println("A escola do aluno2 é  = " + aluno2.getNomeEscola());
		
		
		Aluno aluno3 = new Aluno();/*Aqui será o Andre*/
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("José", 50);
	}

}
