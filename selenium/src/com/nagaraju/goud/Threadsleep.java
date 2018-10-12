package com.nagaraju.goud;

public class Threadsleep{
	public void m1() {
		for(int i=0; i<=5; i++) {
			System.out.println("m1 method ");
			
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		}
 }  
	public void m2() throws InterruptedException {
		for(int i=0; i<=5;i++) {
			System.out.println("m2 method ");
			Thread.sleep(1000);
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		Threadsleep ts =new  Threadsleep();
		ts.m1();
		ts.m2();
		


 }	
}


