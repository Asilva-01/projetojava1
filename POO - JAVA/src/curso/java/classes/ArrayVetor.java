package curso.java.classes;

import javax.swing.JOptionPane;

public class ArrayVetor {
	
	/*Usado para executar código*/
	public static void main(String[] args) {
		
		/**Array pode ser de todo os tipos de dados e objetos também*/
		
	
		String posicoes = JOptionPane.showInputDialog("Quantas posições o Arry deve ter?");
		
		/*Arry sempre deve ter a quantidade de posiçõe definidas*/
		double[] notas = new double[Integer.parseInt(posicoes)];
		
		for (int pos = 0; pos < notas.length; pos ++) {
			String valor = JOptionPane.showInputDialog("Qual o valor da posição = " + pos);
			notas[pos] = Double.valueOf(valor);
		}
	
		
		for (int pos = 0; pos <notas.length; pos++) {
			System.out.println("Nota " + (pos + 1) + " é = " + notas[pos]);
			
			/*Atribuir valor nas posições do arrays*/
			/*notas[0] = 7.8;
			notas[1] = 8.7;
			notas[2] = 9.7;
			notas[3] = 9.9;*/
		}
		
	}

}
