
public class OperacoeAninhadas {

	/*Opera��es l�gicas ainhadas: S�o opera��es dentro de opera��es*/

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
					System.out.println("Aluno est� de aprovado - Parab�ns: " + media);
				}else
				System.out.println("Aluno est� aprovado direto: " + media);
			}else {
				System.out.println("Aluno est� recupera��o: " + media);
			}
			}else {
				System.out.println("Aluno reprovado direto: " + media);
			}
		}
		

}
