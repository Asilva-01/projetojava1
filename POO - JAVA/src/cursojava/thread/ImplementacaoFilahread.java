package cursojava.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilahread extends Thread {
	
	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_filha =
			new ConcurrentLinkedQueue<ObjetoFilaThread>();
	
	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_filha.add(objetoFilaThread);
	}



	private Object pilha_fila;
	
	
		
	@Override
	public void run() {
		
		System.out.println("Fila rodando");
			
		
		while(true) {
			
		
		
		synchronized (pilha_filha) { /* Bloquear o acesso a esta lista por outro processo*/
			
			Iterator iteracao = pilha_filha.iterator();
			while(iteracao.hasNext()) {/*Enquanto conter dados na lista irá processar*/
				
				/*Pegando objeto atual*/
				ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();/*Pega o objeto atual*/
				
				/*Processa 10 mil notas fiscais*/
				/*Gerar uma lista enorme de PDF*/
				/*Gerar um envio em massa de email*/
				System.out.println("----------------------------------");
				
				System.out.println(processar.getEmail());
				System.out.println(processar.getNome());
				
				iteracao.remove();
				
				try {
					Thread.sleep(1000);/*Dar um tempo pra descarga de memória*/
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			}
		
		try {
			Thread.sleep(1000);/*Processada a lista terá um tempo de limpeza da memória*/
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
			
			
		}
		

		
	
	}	
	

}
