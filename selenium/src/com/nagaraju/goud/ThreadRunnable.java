package com.nagaraju.goud;

public class ThreadRunnable extends Thread{
	
	public void run() {
		System.out.println("run method");
	}

	public static void main(String[] args) {
		ThreadRunnable t = new ThreadRunnable();
		Thread t1 = new Thread(t);
		t1.run();
		System.out.println("main thread");

	}

}
