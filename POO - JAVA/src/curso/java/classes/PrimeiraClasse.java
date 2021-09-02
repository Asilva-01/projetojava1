package curso.java.classes;

import javax.swing.JOptionPane;

import JAVA_POO.Aluno;
import JAVA_POO.Disciplina;

public class PrimeiraClasse {
	
	public static void main(String[]args) {
		
		
		
		/*new Aluno() é uma instancia (Criaçao de Objeto)*/
		/*aluno1 é uma referencia para o objeto aluno*/
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade?");
		String dataNascimento = JOptionPane.showInputDialog("Data de nascimento?");
		String rg = JOptionPane.showInputDialog("Registro Geral?");
		String cpf = JOptionPane.showInputDialog("Informe o número do CPF");
		String mae = JOptionPane.showInputDialog("Nome da mãe");
		String pai = JOptionPane.showInputDialog("Nome do Pai");
		String matricula = JOptionPane.showInputDialog("Data de matrícula");
		String serie = JOptionPane.showInputDialog("Qual a série do aluno?");
		String escola = JOptionPane.showInputDialog("Qual o nome da escola?");
		
		
		Aluno aluno1 = new Aluno();/*Aqui será o João*/

		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(matricula);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNomeEscola(escola);
		
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina("Banco de dados");
		disciplina1.setNota(90);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Matematica");
		disciplina2.setNota(80);
		
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Geografia");
		disciplina3.setNota(97);

		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("Java Web");
		disciplina4.setNota(97);
		
		aluno1.getDisciplinas().add(disciplina1);
		aluno1.getDisciplinas().add(disciplina2);
		aluno1.getDisciplinas().add(disciplina3);
		aluno1.getDisciplinas().add(disciplina4);

		
		System.out.println("Nome é = " + aluno1);
		System.out.println("Idade é = " + aluno1);
		System.out.println("A média é = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());
		
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
