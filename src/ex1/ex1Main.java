package ex1;

import java.util.ArrayList;

/*
 * 1. Faça um programa em Java que consulte
 * periodicamente o estado de um conjunto de threads.
 * 
 * @maralucilg
 */
public class ex1Main {

	private static final int NUM_THREADS = 3;

	public static void main(String[] args) {
		
		ArrayList<Thread> screens = new ArrayList<Thread>();
		screens.add(new Thread(new ThreadExemplo()));
		screens.add(new Thread(new ThreadExemplo2()));
		screens.add(new Thread(new ThreadExemplo3()));
		
		Thread simuladora = new ThreadSimuladora(screens);
		simuladora.start();
		
		for(int i = 0; i < NUM_THREADS; i++) {
			
			screens.get(i).start();
			
			try {
				screens.get(i).sleep(10000);
			} catch (InterruptedException e) {
				System.out.println("Oh não, destroyers!");
			}
			
			try {
				screens.get(i).join();
				screens.get(i).interrupt();
			} catch (InterruptedException e) {
				System.out.println("Oh não, destroyers!");
			}
		}
		
		simuladora.interrupt();

	}

}
