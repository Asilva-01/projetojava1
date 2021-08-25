
public class OperacoesTernarias {
	
	/*É uma forma de efeutar o IF e ESLE utilizando operado ternario*/

	public static void  main(String[] args){
		
		int nota1 = 80;
		int nota2 = 50;
		int nota3 = 70;
		int nota4 = 60;
		int media = 0;
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		
		
		/*Condição lógica com IF e ELSE*/
		if (media >=70) {
			System.out.println("Aluno aprovado: " + media);
		} else if (media >= 40 && media <= 69) {
			System.out.println("Aluno em recuperação: " + media + " - Resultado operação com IF e ELSE");
		}
		
		
		/*Operacação Ternária mesmo resulado que a verificação IF ESLE*/
		String saidaResultado = media >= 70 ? "Aluno Aprovado" : 
			(media >= 40 && media <=69)? "Aluno em Recuperacao" :
			"Aluno Reprovado";
		
		
		System.out.println(saidaResultado + ": " + media + " - Resultado operação ternária");
		
	}
	
	
}
