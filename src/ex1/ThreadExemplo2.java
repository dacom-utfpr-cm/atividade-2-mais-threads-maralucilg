package ex1;

public class ThreadExemplo2 implements Runnable {

	@Override
	public void run() {
		System.out.println("Esperando resolver a questão\n" + 
				"com um bloqueio de\n" + 
				"poderosas naves de guerra,\n" + 
				"a gananciosa federação de\n" + 
				"comércio suspendeu toda\n" + 
				"remessa para o pequeno\n" + 
				"planeta Naboo.");

		try {
		Thread.sleep(10000);
		}
		catch (Exception e) {
			System.out.println("Oh não, destroyers!")
		}
		
	}

}
