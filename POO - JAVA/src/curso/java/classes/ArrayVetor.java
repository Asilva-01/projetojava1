package curso.java.classes;

public class ArrayVetor {
	
	/*Usado para executar código*/
	public static void main(String[] args) {
		
		/**Array pode ser de todo os tipos de dados e objetos também*/
		
		/*Arry sempre deve ter a quantidade de posiçõe definidas*/
		double[] notas = new double[5];
		
		
		/*Atribuir valor nas posições do arrays*/
		notas[0] = 7.8;
		notas[1] = 8.7;
		notas[2] = 9.7;
		notas[3] = 9.9;
		
		for (int pos = 0; pos <5; pos++) {
			System.out.println("Nota " + (pos + 1) + " é = " + notas[pos]);
		}
		
	}

}
