
package ex4;

import java.util.ArrayList;

public class ThreadBusca extends Thread {
	ArrayList<Integer> vetor;
	int inicio;
	int fim;
	int elemento;
	int pos = -1;
	int count;

	
	ThreadBusca(ArrayList<Integer> vetor, int elemento, int inicio, int fim) {
		this.vetor = vetor;
		this.elemento = elemento;
		this.inicio = inicio;
		this.fim = fim;
		
               
		
	}
	
	public void getCount {

		this.count = count;
	}

	public void getPosition {

		this.pos = pos;
	}
	
	
        @Override
	public void run( ) {
		
		for(int i = inicio; i <= fim; i++) {
			
			if(vetor.get(i) == this.elemento) {
				this.pos = i;
				this.count++;
			}
	}
		
		
			System.out.println("Elemento encontrado" + count);
                        System.out.println(">>" + pos);
		
}
}
