package ex3;

import java.util.ArrayList;

public class ThreadPrimo extends Thread {
	
	ArrayList<Integer> primos;
	int elemento;
	
	ThreadPrimo(ArrayList<Integer> primos, int elemento) {
		this.primos = primos;
		this.elemento = elemento;
	}

	@Override
	public void run() {
		for(int i = 2; i < elemento; i++) {
			if(elemento % i == 0) {
				return;
			}
		}
		primos.add(elemento);

}
}