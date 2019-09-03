package ex1;

import java.util.ArrayList;

public class ThreadSimuladora extends Thread {
	
	ArrayList<Thread> maisthreads;
	ThreadSimuladora(ArrayList maisthreads) {
	this.maisthreads = maisthreads;
	}
	

	@Override
	public void run() {
	
		while(maisthreads.size() > 0) {
			
			for(int i  = 0; i < maisthreads.size(); i++) {
				String estado = maisthreads.get(i).getState().name();
				
				System.out.println("t h r e a d  " + estado);
			}
			
			if(Thread.currentThread().isInterrupted()) {
				break;
			}
		}
		
		
	}
	


}
