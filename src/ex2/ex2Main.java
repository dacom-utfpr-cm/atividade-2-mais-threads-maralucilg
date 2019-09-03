package ex2;

/*
 * 2. Faça um programa em Java para testar um conjunto de operações sobre um grupo de threads.
 *  Use o ThreadGroup.
 *  
 * @maralucilg
 */

public class ex2Main {

	public static void main(String[] args) {
		ThreadGroup grupo = new ThreadGroup("Sociedade do Anel");
		ThreadGroup saruman = new ThreadGroup("Orcs");
		
		Thread t1 = new Thread (grupo , "Frodo");
		Thread t2 = new Thread (grupo , "Sam");
		Thread t3 = new Thread (saruman , "Bilbo");

		for(int i = 0; i < 3; i++) {
			new Thread(grupo, ()->){
				try {
					Thread.sleep(10000);
				} catch (Exception e) {
				System.out.println("Oh não, destroyers!")
				}).start();
			}
		}
		
		System.out.println(grupo.activeCount());
		System.out.println(grupo.getMaxPriority());
		System.out.println(grupo.isDaemon());
		System.out.println("Interrupt ");
		grupo.interrupt();
		
		System.out.println(saruman.activeCount());
		saruman.setMaxPriority(5);
		System.out.println(saruman.getMaxPriority());
		System.out.println(saruman.isDaemon());
		System.out.println("Interrupt ");
		saruman.interrupt();
		
	}

}
