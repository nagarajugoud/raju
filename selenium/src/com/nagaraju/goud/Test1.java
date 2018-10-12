package com.nagaraju.goud;

public class Test1 extends Thread  {

	public static void main(String[] args) {
		MultiRunnable m = new MultiRunnable();
		Thread t = new Thread(m);
		t.start();
		System.out.println("main thread");
		
		

	}

}
