package cursojava.thread;

public class AulaThread {
	
	public static void main(String[] args) throws InterruptedException {
		
		for (int pos = 0; pos <10; pos++) {
			
			
			
			/*Quero executar esse envio com tempo determinado*/
			System.out.println("Executando uma rotina, por exemplo envio de e-mail");
			Thread.sleep(1000); /*Tempo para execução*/
		}
		
		System.out.println("CHEGOU AO FIM DO CÓDIGO DE TESTE DE THREAD!");
	}

}
