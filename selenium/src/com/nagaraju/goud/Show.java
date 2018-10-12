package com.nagaraju.goud;

public class Show {
	public void num() {
		for(int i=0; i<=10; i++) {
			System.out.println("numbers :"+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
	}
  }
   
	public  void chararcter() {
		for(int i=65; i<=75; i++) {
			System.out.println((char)+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Nagaraju extends Thread{
	Show s;
	Nagaraju(Show s){
		this.s=s;
	}
	public void run() {
		s.num();
	}
}
 
class Naga extends Thread{
	Show s;
	Naga(Show s){
		this.s=s;
	}
	public void run() {
		s.chararcter();
	}
	}

