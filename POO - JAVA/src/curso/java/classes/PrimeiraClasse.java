package curso.java.classes;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import JAVA_POO.Aluno;
import JAVA_POO.Disciplina;

public class PrimeiraClasse {
	
	public static void main(String[]args) {
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		for (int qtd = 1 ; qtd <=2; qtd++) {
		
		
		/*new Aluno() é uma instancia (Criaçao de Objeto)*/
		/*aluno1 é uma referencia para o objeto aluno*/
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno "+qtd+" ?");
		/*String idade = JOptionPane.showInputDialog("Qual a idade?");
		String dataNascimento = JOptionPane.showInputDialog("Data de nascimento?");
		String rg = JOptionPane.showInputDialog("Registro Geral?");
		String cpf = JOptionPane.showInputDialog("Informe o número do CPF");
		String mae = JOptionPane.showInputDialog("Nome da mãe");
		String pai = JOptionPane.showInputDialog("Nome do Pai");
		String matricula = JOptionPane.showInputDialog("Data de matrícula");
		String serie = JOptionPane.showInputDialog("Qual a série do aluno?");
		String escola = JOptionPane.showInputDialog("Qual o nome da escola?");*/
		
		
		Aluno aluno1 = new Aluno();/*Aqui será o João*/

		aluno1.setNome(nome);
		/*aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(matricula);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNomeEscola(escola);*/
		
		for (int pos = 1; pos <=4; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina "+pos+" ?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina "+pos+" ?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
		}
		

		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");
		
		if (escolha == 0) {/*Opção SIM é ZERO*/
			
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
			for (int pos = 0; pos < alunos.size(); pos ++) {
				Aluno aluno = alunos.get(pos);
				
				System.out.println("Aluno = " + aluno.getNome());
				System.out.println("Media do aluno = " + aluno.getMediaNota());
				System.out.println("Resultado = " + aluno.getAlunoAprovado2());
				System.out.println("===========================================");
				
				for (int posd = 0; posd < aluno.getDisciplinas().size(); posd ++) {
					
					Disciplina disc = aluno.getDisciplinas().get(posd);
					System.out.println("Materia = " + disc.getDisciplina() + " - Nota = " + disc.getNota());
					System.out.println("===========================================");
				}
				
			}
		
			}
				
					
				
		}
	

			
		/*=====================================================*/
		
		/*System.out.println("------------------------------------------------------");*/
		
		/*Aluno aluno2 = new Aluno();/*Aqui será o Pedro*/
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
	
		
		System.out.println("Nome é do aluno 2 = " + aluno2.getNome());
		System.out.println("Idade do " + aluno2.getNome() + " é : "+ aluno2.getIdade());
		System.out.println("A data de Nascimento do aluno 2 é = " + aluno2.getDataNascimento());
		System.out.println("A escola do aluno2 é  = " + aluno2.getNomeEscola());
		
		
		Aluno aluno3 = new Aluno();/*Aqui será o Andre*/
		
		/*Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("José", 50);*/
	

	

