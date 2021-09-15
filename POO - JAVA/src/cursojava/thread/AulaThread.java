package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {
	
	public static void main(String[] args) throws InterruptedException {
		
		new Thread() {
			
			public void run() {/*Executa o que n�s queremos*/
				
				/*C�digo da rotina que roda em paralelo*/
				for (int pos = 0; pos <10; pos++) {
					
					
					
					/*Quero executar esse envio com tempo determinado*/
					System.out.println("Executando uma rotina, por exemplo envio de e-mail");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
			
						e.printStackTrace();
					} /*Tempo para execu��o*/
				}
				/*Fim de codigo paralelo*/
				
				
			}
			
		}.start();/*Inicia a thread que processa em paralelo*/
		
	
		
		/*Codigo do sistema do usu�rio continua o fluxo de trabalho*/
		System.out.println("CHEGOU AO FIM DO C�DIGO DE TESTE DE THREAD!");
		/*Fluxo do sistema, cadastros outros*/
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuario");
	}

}
