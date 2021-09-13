package curso.java.classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import JAVA_POO.Aluno;
import JAVA_POO.Diretor;
import JAVA_POO.Disciplina;
import JAVA_POO.Secretario;
import JAVA_POO.constantes.StatusAluno;
import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.interfaces.PermitirAcesso;

public class PrimeiraClasse {
	
	private static PermitirAcesso secretario;

	public static void main(String[]args) {
		
		try {
		
		String login = JOptionPane.showInputDialog("Informe o login");
		String senha = JOptionPane.showInputDialog("Informe o senha");
		
		
		
		if(new FuncaoAutenticacao(new Diretor(login, senha)).autenticar()) { 
			/*Trava de acesso somente 100% correto*/
					
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		/*lista que dentro dela temos uma chave que identifica uma sequencia de valores tambem*/
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
		
		for (int qtd = 1 ; qtd <=2; qtd++) {
		
		
		/*new Aluno() � uma instancia (Cria�ao de Objeto)*/
		/*aluno1 � uma referencia para o objeto aluno*/
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno "+qtd+" ?");
		String idade = JOptionPane.showInputDialog("Qual a idade?");
		/*String dataNascimento = JOptionPane.showInputDialog("Data de nascimento?");
		String rg = JOptionPane.showInputDialog("Registro Geral?");
		String cpf = JOptionPane.showInputDialog("Informe o n�mero do CPF");
		String mae = JOptionPane.showInputDialog("Nome da m�e");
		String pai = JOptionPane.showInputDialog("Nome do Pai");
		String matricula = JOptionPane.showInputDialog("Data de matr�cula");
		String serie = JOptionPane.showInputDialog("Qual a s�rie do aluno?");
		String escola = JOptionPane.showInputDialog("Qual o nome da escola?");*/
		
		
		Aluno aluno1 = new Aluno();/*Aqui ser� o Jo�o*/

		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		/*aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(matricula);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNomeEscola(escola);*/
		
		for (int pos = 1; pos <=1; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina "+pos+" ?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina "+pos+" ?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			/*disciplina.setNota(Double.valueOf(notaDisciplina));*/
			
			aluno1.getDisciplinas().add(disciplina);
		}
		

		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");
		
		if (escolha == 0) {/*Op��o SIM � ZERO*/
			
			int continuarRemover = 0; 
			int posicao = 1;
			while (continuarRemover == 0) {
				
			String disciplinaRemover = JOptionPane.showInputDialog
					("Qual a disciplina 1, 2, 3, ou 4 ?");
			aluno1.getDisciplinas().remove(Integer.valueOf
			(disciplinaRemover).intValue()- posicao);
			posicao ++;
			continuarRemover = JOptionPane.showConfirmDialog
			(null, "Continuar a remover? ");
		}
			
			
		}
			alunos.add(aluno1);
		}
		
		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
		
		for (Aluno aluno: alunos) {/*Sperada em listas*/
			if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				maps.get(StatusAluno.APROVADO).add(aluno);
			}else
			if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				maps.get(StatusAluno.RECUPERACAO).add(aluno);
			}else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)) {
				maps.get(StatusAluno.REPROVADO).add(aluno); /*Reprovado*/
			}
		}
		
		System.out.println("-------Lista de Aprovados-----------");
		for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
			System.out.println(aluno.getNome() + " - Resultado = " + aluno.getAlunoAprovado2() + " com m�dia de = "
				 + aluno.getMediaNota());
		}
		
		System.out.println("-------Lista Alunos em Recuperacao-----------");
		for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
			System.out.println(aluno.getNome() + " - Resultado = " + aluno.getAlunoAprovado2() + " com m�dia de = "
				 + aluno.getMediaNota());

	}
		System.out.println("-------Lista Alunos Reprovados-----------");
		for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
			System.out.println(aluno.getNome() + " - Resultado = " + aluno.getAlunoAprovado2() + " com m�dia de = "
				 + aluno.getMediaNota());
		}
				
	}else {
		JOptionPane.showMessageDialog(null, "Acesso n�o permitido !");
	}
		
		/*aqui*/
	
		} catch (NumberFormatException e) {
			
			StringBuilder saida = new StringBuilder();
			
			
			e.printStackTrace();/*Imprime erro no console Java*/
			/*Mensagem do erro ou caousa*/
			System.out.println(" Mensagem: " + e.getMessage());
			
			for (int pos = 0; pos < e.getStackTrace().length; pos++) {
				
				saida.append("\n Classe de erro : " +e.getStackTrace()[pos].getClassName());
				saida.append("\n M�todo de erro : " +e.getStackTrace()[pos].getMethodName());
				saida.append("\n Linha de erro : " +e.getStackTrace()[pos].getLineNumber());
				saida.append("\n Class : " +e.getClass().getName());
			}
			
			
			
			JOptionPane.showMessageDialog(null, "Erro de convers�o de numero " + saida.toString());
		}catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Opa um null pointer exeption : " + e.getClass());
		}catch (Exception e) {
			e.printStackTrace();
			
			
		}finally { /*Sempre � executado com erros ou n�o*/
			JOptionPane.showMessageDialog(null, "Obrigado por aprender JAVA na JDEV Treinamento!");
		}
		
		
	}
}

			
		/*=====================================================*/
		
		/*System.out.println("------------------------------------------------------");*/
		
		/*Aluno aluno2 = new Aluno();/*Aqui ser� o Pedro*/
		/*aluno2.setNome("Pedro");
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
		
		/*Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("Jos�", 50);*/
	

	

