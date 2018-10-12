package com.nagaraju.goud;

public class Display {
	
	public synchronized void m1(String name) {
		
		for(int i=0; i<=10;i++) {
			System.out.print("my name is :");
		try{
		Thread.sleep(3000);
		}
		catch (InterruptedException e) {}
		System.out.println(name);		

	
	}
	}
} 
/*class Mythread1 extends Thread{
	Display d;
	String name;
	
	Mythread1(Display d, String name){
		this.d=d;
		this.name=name;
		
	}
	public void run() {
		d.m1(name);
	}
	

	public static void main(String[] args) {
		Display d = new Display();
		Mythread1 m = new Mythread1(d,"raju");
		m.start();
		//System.out.println("main thread");
	}

}*/



	