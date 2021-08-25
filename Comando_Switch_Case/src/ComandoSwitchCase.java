
public class ComandoSwitchCase {
 
	/*Operações aninhadas com Switch e Case*/

	public static void  main(String[] args){

		int dia = 3;
		
		switch (dia) {
		case 1:
			System.out.println("O dia é: " + dia + ", então é domingo" );
			break;
		case 2:
			System.out.println("O dia é: " + dia + ", então é segunda-feira");
			break;
		case 3:
			System.out.println("O dia é: " + dia + ", então é terça-feira");
			break;
			
		default: System.out.println("Outro dia qualquer não definido");
			break;
		}
	}	
}
	
