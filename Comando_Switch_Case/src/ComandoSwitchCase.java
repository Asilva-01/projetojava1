
public class ComandoSwitchCase {
 
	/*Opera��es aninhadas com Switch e Case*/

	public static void  main(String[] args){

		int dia = 3;
		
		switch (dia) {
		case 1:
			System.out.println("O dia �: " + dia + ", ent�o � domingo" );
			break;
		case 2:
			System.out.println("O dia �: " + dia + ", ent�o � segunda-feira");
			break;
		case 3:
			System.out.println("O dia �: " + dia + ", ent�o � ter�a-feira");
			break;
			
		default: System.out.println("Outro dia qualquer n�o definido");
			break;
		}
	}	
}
	
