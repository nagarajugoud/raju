package com.nagaraju.goud;

public class Interrupted1 extends Thread{
	public void run() {
		for(int i=0; i<=10; i++) {
			System.out.println("child thread");
		}
		System.out.println("i want to sleep");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			System.out.println("i got interrupted");
		}
	}
	public static void main(String[] args) {
		Interrupted1 i = new Interrupted1();
		i.start();
		//i.interrupt();
		System.out.println("main thread");

	}

}
