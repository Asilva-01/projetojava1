package curso.java.classes;

import javax.swing.JOptionPane;

import JAVA_POO.Aluno;

public class PrimeiraClasse {
	
	public static void main(String[]args) {
		
		
		
		/*new Aluno() � uma instancia (Cria�ao de Objeto)*/
		/*aluno1 � uma referencia para o objeto aluno*/
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade?");
		String dataNascimento = JOptionPane.showInputDialog("Data de nascimento?");
		String rg = JOptionPane.showInputDialog("Registro Geral?");
		String cpf = JOptionPane.showInputDialog("Informe o n�mero do CPF");
		String mae = JOptionPane.showInputDialog("Nome da m�e");
		String pai = JOptionPane.showInputDialog("Nome do Pai");
		String matricula = JOptionPane.showInputDialog("Data de matr�cula");
		String serie = JOptionPane.showInputDialog("Qual a s�rie do aluno?");
		String escola = JOptionPane.showInputDialog("Qual o nome da escola?");
		
		String disciplina1 = JOptionPane.showInputDialog("Disciplina 1 ?");
		String nota1 = JOptionPane.showInputDialog("Qual a nota1 ?");
		
		String disciplina2 = JOptionPane.showInputDialog("Disciplina 2 ?");
		String nota2 = JOptionPane.showInputDialog("Qual a nota2 ?");
		
		String disciplina3 = JOptionPane.showInputDialog("Disciplina 3 ?");
		String nota3 = JOptionPane.showInputDialog("Qual a nota3 ?");
		
		String disciplina4 = JOptionPane.showInputDialog("Disciplina 4 ?");
		String nota4 = JOptionPane.showInputDialog("Qual a nota4 ?");
		
		Aluno aluno1 = new Aluno();/*Aqui ser� o Jo�o*/

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
		
		aluno1.getDisciplina().setNota1(Double.parseDouble(nota1));
		aluno1.getDisciplina().setNota2(Double.parseDouble(nota2));
		aluno1.getDisciplina().setNota3(Double.parseDouble(nota3));
		aluno1.getDisciplina().setNota4(Double.parseDouble(nota4));
		
		aluno1.getDisciplina().setDisciplina2(disciplina1);
		aluno1.getDisciplina().setDisciplina2(disciplina2);
		aluno1.getDisciplina().setDisciplina3(disciplina3);
		aluno1.getDisciplina().setDisciplina4(disciplina4);
		
		
		System.out.println(aluno1.toString());/*Descri��o do objeto na mem�ria*/
		
		/*System.out.println("M�dia do aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());*/
		
		System.out.println("Nome � = " + aluno1.getNome());
		
		System.out.println("Idade � = " + aluno1.getIdade());
		System.out.println("A data de Nascimento � = " + aluno1.getDataNascimento());
		System.out.println("A escola � = " + aluno1.getNomeEscola());
		System.out.println("M�dia de nota do aluno " + aluno1.getNome() + " � : " + aluno1.getMediaNota());
		System.out.println("O Resultado � = " + (aluno1.getAlunoAprovado() ? " Aluno Aprovado" : "Aluno Reprovado"));
		System.out.println("Resultado 2 = " + aluno1.getAlunoAprovado2());
		
		/*=====================================================*/
		
		System.out.println("------------------------------------------------------");
		
		Aluno aluno2 = new Aluno();/*Aqui ser� o Pedro*/
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
	
		
		System.out.println("Nome � do aluno 2 = " + aluno2.getNome());
		System.out.println("Idade do " + aluno2.getNome() + " � : "+ aluno2.getIdade());
		System.out.println("A data de Nascimento do aluno 2 � = " + aluno2.getDataNascimento());
		System.out.println("A escola do aluno2 �  = " + aluno2.getNomeEscola());
		
		
		Aluno aluno3 = new Aluno();/*Aqui ser� o Andre*/
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("Jos�", 50);
	}

}
