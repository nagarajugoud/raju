package com.nagaraju.goud;

public class Name extends Thread{
	
	
     public void run() {
    	 for(int i=0; i<=10; i++) {
    			System.out.println("name thread");
    			
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

    		//	Thread.yield();
   }
 }
    	 public static void main(String[] args) throws InterruptedException {

	/*System.out.println(Thread.currentThread().getName());
		
		Name g= new Name();
		System.out.println(  g.getName());
		
		Thread.currentThread().setName("rajugoud");
		System.out.println(Thread.currentThread().getName());

*/ 
	
	/*System.out.println(Thread.currentThread().getPriority());
   Thread.currentThread().setPriority(10);
   System.out.println(Thread.currentThread().getPriority());
   Name n = new Name();
   System.out.println(n.getPriority());
   System.out.println(Thread.currentThread().getPriority());
   
	*/ 
	
	Name n = new Name();
	n.start();
	n.join(10000);
	for(int i=0; i<=2; i++) {	
		System.out.println("main thread");
}
	
}
}	

