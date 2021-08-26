import javax.swing.JOptionPane;

public class CriandoOpecoesdeConfirmacao {

/*Criação de opções de confirção*/
	
	public static void main(String[] args) {
	String carros = JOptionPane.showInputDialog("Informe a quantidade de carros?");
	String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas?");
	
	
	double carroNumero = Double.parseDouble(carros);
	double pessoaNumero = Double.parseDouble(pessoas);
	
	int divisao = (int) (carroNumero / pessoaNumero); 
	
	double resto = carroNumero % pessoaNumero;
	
	int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisão?");
	
	if (resposta == 0) {
		JOptionPane.showMessageDialog(null, "Divisão para as pessoas foi de : " + divisao);	
	}else {
		System.out.println("Não desejo ver o resultado!");
	}
	
	resposta = JOptionPane.showConfirmDialog(null, "Deseja visalizar o RESTO da divisão?");
	
	if(resposta == 0) {
		JOptionPane.showConfirmDialog(null, "O restante da divisão é : " + resto);
	}else {
		System.out.println("Não desejo ver o resultado!");
	}
	
	JOptionPane.showMessageDialog(null, "Divisão para as pessoas foi de : " + divisao + " carros e sobrando "
			+ resto + " de carro(s)");
	
}

	
	
}
