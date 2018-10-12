package com.naga.goud;

public class A {
	public void m1(B b) {
		System.out.println("class A try to waiting state");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("class A try to call B's last() method");
		b.last();
	}

	public void last() {
		
	}
}
class B{
	public void m2(A a) {
		System.out.println("class B try to waiting state");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("class B try to call to A's last() method");
		a.last();
	}

	public void last() {
		
	}
}

class C extends Thread{
	A a = new A();
	B b = new B();
public void m3() {
		this.start();
		a.m1(b);

	}
public void run() {
		b.m2(a);
	}
	
}
class D{
	public static void main(String[] args) {
		C c = new C();
		c.m3();
		
		
	}
}
	



	



	


