
public class EstruturaRepeticaocomBreak {
	public static void main(String[] args) {
		
		/*Estrutura de repeti��es FOR com Break (Parada)*/
		
		for (int numero = 0; numero <= 10; numero ++) {
			if(numero == 3) {
				System.out.println("N�mero esperado foi encontrado que �: " +
			    numero);
				System.out.println("Processo parado, n�mero esperado encontrado");
				break;
			}
		}
	}
}
