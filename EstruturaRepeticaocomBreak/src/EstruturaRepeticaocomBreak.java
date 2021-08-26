
public class EstruturaRepeticaocomBreak {
	public static void main(String[] args) {
		
		/*Estrutura de repetições FOR com Break (Parada)*/
		
		for (int numero = 0; numero <= 10; numero ++) {
			if(numero == 3) {
				System.out.println("Número esperado foi encontrado que é: " +
			    numero);
				System.out.println("Processo parado, número esperado encontrado");
				break;
			}
		}
	}
}
