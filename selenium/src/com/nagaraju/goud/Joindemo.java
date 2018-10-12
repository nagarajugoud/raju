package com.nagaraju.goud;

public class Joindemo extends Thread{
	static Thread mt;

	public void run() {
	
		try {
			mt.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("child thread");
}
	
	public static void main(String[] args) throws InterruptedException {
		Joindemo.mt = Thread.currentThread();
		Joindemo j = new Joindemo();
		j.start();
		for(int i=0; i<=5; i++) {
			System.out.println("main thread");
			Thread.sleep(2000);
			
			
		}
		
		
		
		

	}

}
