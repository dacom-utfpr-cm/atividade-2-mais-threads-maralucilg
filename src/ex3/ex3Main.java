package ex3;

import java.util.ArrayList;

/*
 *    3. Faça um programa em Java com threads que exiba
 *    os números primos entre 0 e 100000.
 *    
 *    @maralucilg
 */

public class ex3Main {

	public static void main(String[] args) {
		
		ArrayList<Integer> primos = new ArrayList<Integer>();
		Thread[] vetorthreads = new Thread[3];
		int aux = -1;
		
		for(int i = 1; i < 100000; i+= 2) {
			for(int t = 0; t < vetorthreads.length; t++) {
				if (vetorthreads[t] == null || vetorthreads[t].isAlive()) {
				aux = t;
				break;
				}
				
			}
			
			vetorthreads[aux] = new ThreadPrimo(primos, i);
			vetorthreads[aux].start();
			aux = - 1;
		}
		
		for(Thread t: vetorthreads) {
			if(t != null) {
				while(t.isAlive());
			}
		}
		
		for(int i = 0; i < primos.size(); i++) {
			System.out.println(primos.get(i));
		}
		
		
		
	}

}
