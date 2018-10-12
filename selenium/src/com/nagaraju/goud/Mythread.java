package com.nagaraju.goud;

public class Mythread extends Thread{
	Display d;
	String name;
	
	Mythread(Display d, String name){
		this.d=d;
		this.name=name;
		
	}
	public void run() {
		d.m1(name);
	}
	

	public static void main(String[] args) {
		Display d = new Display();
		Mythread m = new Mythread(d,"raju");
		Mythread m1 = new Mythread(d, "naga");
		m.start();
		m1.start();
		//System.out.println("main thread");
	}

}
