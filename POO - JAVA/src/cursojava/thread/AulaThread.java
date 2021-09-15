package cursojava.thread;

import javax.swing.JOptionPane;

import sun.jvm.hotspot.runtime.StaticBaseConstructor;

public class AulaThread {
	
	public static void main(String[] args) throws InterruptedException {
		
		/*Thread processando em pararelo envio de e-mail*/
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();	

		
		//********************************DIVISÃO DAS THREAD***********************//
		
		/*Thread processando em pararelo envio de e-mail*/
		Thread threadNotaFiscal = new Thread(thread2);
		threadNotaFiscal.start();

		
		/*Codigo do sistema do usuário continua o fluxo de trabalho*/
		System.out.println("CHEGOU AO FIM DO CÓDIGO DE TESTE DE THREAD!");
		/*Fluxo do sistema, cadastros outros*/
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuario");
	}
	
	private static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			
			/*Código da rotina que roda em paralelo*/
			for (int pos = 0; pos <10; pos++) {
				
				
				
				/*Quero executar esse envio com tempo determinado*/
				System.out.println("Executando uma rotina, por exemplo envio de nota fiscal");
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
		
					e.printStackTrace();
				} /*Tempo para execução*/
			}
			/*Fim de codigo paralelo*/
			
			
		}
	};
	
	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			
			/*Código da rotina que roda em paralelo*/
			for (int pos = 0; pos <10; pos++) {
				
				
				
				/*Quero executar esse envio com tempo determinado*/
				System.out.println("Executando uma rotina, por exemplo envio de e-mail");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
		
					e.printStackTrace();
				} /*Tempo para execução*/
			}
			/*Fim de codigo paralelo*/
			
		}
	};
	
	
	}


