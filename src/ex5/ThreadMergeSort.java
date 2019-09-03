package ex5;

public class ThreadMergeSort extends Thread {
	private static final int TAM_F = 50;
	int[] vetor;
	int p;
	int r;
	
	ThreadMergeSort() {
		aciona(TAM_F);
	}
	
	ThreadMergeSort(int[]vetor, int p, int r) {
		this.vetor = vetor;
		this.p = p;
		this.r = r;
	}
	
	void merge(int p, int q, int r) {
		int tam = r - p + 1;
		int i = p;
		int j = q + 1;
		int aux = 0;
		int[] outrovetor = new int[tam];
		
		while(i <= q && j <= r) {
			if(vetor[i] < vetor[j]) {
				outrovetor[aux] = vetor[i];
				i++;
			}
			else {
				outrovetor[aux] = vetor[j];
				j++;
			}
			aux++;
		}
		
		while(i <= q) {
			outrovetor[aux] = vetor[i];
			i++;
			aux++;
		}
		
		while(j <= r) {
			outrovetor[aux] = vetor[j];
			j++;
			aux++;
			
		}
		
		aux = 0;
		for(int k = p; k <= r; k++) {
			vetor[k] = outrovetor[aux];
			aux++;
		}
	}
	
	void sort(int p, int r) {
		if(p < r) {
			int q = (p + r)/2;
			sort(p, q);
			sort(q+1, r);
			merge(p, q, r);
		}
	}
	
	void aciona(int tam) {
		
		vetor = new int[TAM_F];
		
		for(int l = TAM_F - 1; l >= 0; l--) {
			vetor[TAM_F - l - 1] = l;
		}
		
		int q = (TAM_F - 1)/2;
		
		Thread primeiraMetade = new ThreadMergeSort(vetor, 0, q);
		Thread segundaMetade = new ThreadMergeSort(vetor, q+1, TAM_F - 1);
		
		primeiraMetade.start();
		segundaMetade.start();
		
		try {
			primeiraMetade.join();
			segundaMetade.join();
		} catch (InterruptedException e) {
			
		}
		
		merge(0, q, TAM_F - 1);
		
		for(int i : vetor) {
			
			System.out.println(">>"+ i);
		}
		
	}
	
	@Override
	public void run( ) {
		
		sort(p, r);
		
	}
	

}
