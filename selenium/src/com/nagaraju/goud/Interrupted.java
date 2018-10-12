package com.nagaraju.goud;

public class Interrupted extends  Thread{
	public void run() {
		try {
		for(int i=0; i<=5; i++) {
			System.out.println("child thread");
		
	
		    Thread.sleep(2000);
			
		}		
	}
		catch (InterruptedException e) {
			System.out.println("i got interrupted");
		}
	}	
				
	

	public static void main(String[] args) {
		Interrupted i = new Interrupted();
		i.start();
		//i.interrupt();
		//for(int i1=0; i1<=3; i1++) {
			System.out.println("main thread");
		
	}

}
