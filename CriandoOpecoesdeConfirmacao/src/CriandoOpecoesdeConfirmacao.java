import javax.swing.JOptionPane;

public class CriandoOpecoesdeConfirmacao {

/*Cria��o de op��es de confir��o*/
	
	public static void main(String[] args) {
	String carros = JOptionPane.showInputDialog("Informe a quantidade de carros?");
	String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas?");
	
	
	double carroNumero = Double.parseDouble(carros);
	double pessoaNumero = Double.parseDouble(pessoas);
	
	int divisao = (int) (carroNumero / pessoaNumero); 
	
	double resto = carroNumero % pessoaNumero;
	
	int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divis�o?");
	
	if (resposta == 0) {
		JOptionPane.showMessageDialog(null, "Divis�o para as pessoas foi de : " + divisao);	
	}else {
		System.out.println("N�o desejo ver o resultado!");
	}
	
	resposta = JOptionPane.showConfirmDialog(null, "Deseja visalizar o RESTO da divis�o?");
	
	if(resposta == 0) {
		JOptionPane.showConfirmDialog(null, "O restante da divis�o � : " + resto);
	}else {
		System.out.println("N�o desejo ver o resultado!");
	}
	
	JOptionPane.showMessageDialog(null, "Divis�o para as pessoas foi de : " + divisao + " carros e sobrando "
			+ resto + " de carro(s)");
	
}

	
	
}
