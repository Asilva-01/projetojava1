package curso.java.classes;

public class Matriz {
	
	/*Executar o codigo Java*/
	public static void main(String[] args) {
		
		int notas[][] = new int[2][3];
		
		notas[0][0] = 80;
		notas[0][1] = 90;
		notas[0][2] = 70;
		
		notas[1][0] = 40;
		notas[1][1] = 60;
		notas[1][2] = 30;
		
		
		/*System.out.println(notas);*/
		/*Percorre as linhas*/
		for (int poslinha = 0; poslinha < notas.length; poslinha ++) {
			System.out.println("=============================================");
			/*Para cada linha Percorrer as colunas ARRAY*/
			for (int poscoluna = 0; poscoluna < notas[poslinha].length; poscoluna++)
			System.out.println("Valor da matriz: " + notas[poslinha][poscoluna]);
		}
	}

}
