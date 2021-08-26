
public class EstruturaRepeticaocomContinue {
public static void main(String[] args) {
		
		/*Estrutura de repetições FOR com CONTINUE*/
		
		for (int numero = 0; numero <= 10; numero ++) {
			if(numero == 3 || numero == 6 || numero == 9) {
				System.out.println("Número esperado foi encontrado que é: " +
			    numero);
				
				continue;
			}
			
		}
	}
}
