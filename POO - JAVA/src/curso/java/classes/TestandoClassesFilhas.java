package curso.java.classes;

import JAVA_POO.Aluno;
import JAVA_POO.Diretor;
import JAVA_POO.Secretario;

public class TestandoClassesFilhas {
	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Andre Luiz");
		aluno.setNomeEscola("JDEV - Treinamentos");
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("12300088AAA1111");
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administracao");
		secretario.setNumeroCpf("111333666-58");		
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
	}

}
