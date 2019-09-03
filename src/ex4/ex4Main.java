/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeexercício4;

/**
 *
 * @author a1711156
 */
import java.util.ArrayList;

/*
 * 4. Faça um programa em Java que realize uma busca paralela em um vetor de inteiros. 
 * Informe para o método: valor procurado, vetor de inteiros e o número de threads.
 * 
 * @maralucilg
 */

public class ex4Main {
	
	private static final int NUM = 20;

	void busca(ArrayList<Integer> vetor, int elemento, int num_threads) {
		ArrayList<Thread> maisthreads = new ArrayList<Thread>();
		Thread rastreadora;
		
		for(int i = 0; i < num_threads; i++) {
			rastreadora = new ThreadBusca(vetor, elemento, i*(vetor.size()/num_threads), (i+1)*(vetor.size()/num_threads) - 1);
			maisthreads.add(rastreadora);
			rastreadora.start();
		}
		int count = 0;
		int pos = 0;
		
		for(int i = 0; i < maisthreads.size(); i++) {

				pos = maisthreads.get(i);
		}
		System.out.println(">>" + count);
		System.out.println(">>" + pos);
	}

	public static void main(String[] args) {
		ArrayList<Integer> vetor = new ArrayList<Integer>();
		int elemento = Integer.parseInt(args[0]);
		int n_threads = Integer.parseInt(args[1]);
		
		for(int i = 0; i < NUM; i++) {
			vetor.add((int)(Math.random()*NUM));
		}
		System.out.println(vetor);
		new ex4Main().busca(vetor, elemento, n_threads);

	}

}
