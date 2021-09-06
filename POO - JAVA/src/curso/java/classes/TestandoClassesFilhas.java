package curso.java.classes;

import JAVA_POO.Aluno;
import JAVA_POO.Diretor;
import JAVA_POO.Pessoa;
import JAVA_POO.Secretario;

public class TestandoClassesFilhas {
	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Andre Luiz");
		aluno.setNomeEscola("JDEV - Treinamentos");
		aluno.setIdade(22);
		
		Diretor diretor = new Diretor();
		diretor.setNome("Juarez");
		diretor.setRegistroGeral("12300088AAA1111");
		diretor.setIdade(50);
		
		
		Secretario secretario = new Secretario();
		secretario.setNome("Carlos");
		secretario.setExperiencia("Administracao");
		secretario.setNumeroCpf("111333666-58");		
		secretario.setIdade(18);
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println( aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println("O diretor � maior = " + diretor.pessoaMaiorIdade());
		System.out.println("O secret�rio � maior = " + secretario.pessoaMaiorIdade());
		
		
		System.out.println("Salario do Aluno � = " + aluno.salario());
		System.out.println("Salario do Diretor � = " + diretor.salario());
		System.out.println("Salario do Secret�rio � = " + secretario.salario());
		
	
		teste(aluno);
		teste(diretor);
		teste(secretario);
	}
	
	public static void teste(Pessoa pessoa) {
		System.out.println("Essa pessoa � mais = "
		+ pessoa.getNome() + " e o sal�rio � de = " + pessoa.salario());
	}

}
