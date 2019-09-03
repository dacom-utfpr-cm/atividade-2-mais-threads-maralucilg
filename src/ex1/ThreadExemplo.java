package ex1;

public class ThreadExemplo implements Runnable {

	@Override
	public void run() {
		
		System.out.println("A desordem instalou-se na\n" + 
				"República Galáctica. A\n" + 
				"cobrança de impostos das\n" + 
				"rotas de comércio para\n" + 
				"sistemas remotos está sendo\n" + 
				"contestada.");

		try {
		Thread.sleep(10000);
		}
		catch (Exception e) {
			System.out.println("Oh não, destroyers!")
		}
	}

}
