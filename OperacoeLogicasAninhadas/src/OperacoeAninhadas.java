
public class OperacoeAninhadas {

	/*Operações lógicas ainhadas: São operações dentro de operações*/

	public static void  main(String[] args){
		
		int nota1 = 80;
		int nota2 = 100;
		int nota3 = 100;
		int nota4 = 100;
		int media = 0;
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		
		if(media >= 50) {
			if (media >= 70) {
				if (media > 90) {
					System.out.println("Aluno está de aprovado - Parabéns: " + media);
				}else
				System.out.println("Aluno está aprovado direto: " + media);
			}else {
				System.out.println("Aluno está recuperação: " + media);
			}
			}else {
				System.out.println("Aluno reprovado direto: " + media);
			}
		}
		

}
