
public class WhileDoWhile {
	public static void main(String[]args) {
		
		/*Estrutura de repeti��es while*/
		
		int numero = 0;
		
		/*WHILE - Verifica e depois executa*/
		while (numero <= 100) { 
			System.out.println("'WHILE' - O numero atual � : " + numero );
			numero ++;
		}
		
		/*DO WHILE - primeiro executa e depois verifica*/
		
		int numero2 =0;
		do {
			System.out.println("'DO WHILE' - O numero atual � : " + numero2);
			numero2++;
		}while (numero2 <= 100);
	}
}
