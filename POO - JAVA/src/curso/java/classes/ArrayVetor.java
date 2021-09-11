package curso.java.classes;

import javax.swing.JOptionPane;

public class ArrayVetor {
	
	/*Usado para executar código*/
	public static void main(String[] args) {
		

		String[] valores = new String[4];
		
		valores[0] = "andre"; 
		valores[1] = "98.5";
		valores[2] = "Curso de Java";		
		valores[3] = "andre1981luiz@gmail.com";
		
		for (int pos = 0; pos < valores.length; pos++) {
			System.out.println("Valores na posição " + pos +" é igual = " + valores[pos]);
		
		
		
		}
		
		System.out.println("==========================================================");
		
		String[] valores1 = {"andre", "98.5", "Curso de Java", "andre1981luiz@gmail.com"};
		
		for (int pos1 = 0; pos1 < valores1.length; pos1++) {
			System.out.println("Valores na posição " + pos1 +" é igual = " + valores1[pos1]);
		}
		
	}}

		
		/**Array pode ser de todo os tipos de dados e objetos também*/
		
	
		/*String posicoes = JOptionPane.showInputDialog("Quantas posições o Arry deve ter?");
		
		/*Arry sempre deve ter a quantidade de posiçõe definidas*/
		/*double[] notas = new double[Integer.parseInt(posicoes)];
		
		for (int pos = 0; pos < notas.length; pos ++) {
			String valor = JOptionPane.showInputDialog("Qual o valor da posição = " + pos);
			notas[pos] = Double.valueOf(valor);*/
		
	
		
		/*for (int pos = 0; pos <notas.length; pos++) {
			System.out.println("Nota " + (pos + 1) + " é = " + notas[pos]);*/
			
			/*Atribuir valor nas posições do arrays*/
			/*notas[0] = 7.8;
			notas[1] = 8.7;
			notas[2] = 9.7;
			notas[3] = 9.9;*/
	


