package com.nagaraju.goud;

import java.util.Scanner;

public class Studentmarks {



		public static void main(String[] args) {
			
			int[] a = new int[6];
			float sum=0, avg;
			int i;
			
			Scanner sc = new Scanner(System.in);
		    System.out.println("Enter total number of marks in 6 subjects : ");

		   for(i=0; i<6; i++) {
		    	a[i]=sc.nextInt();
		    	//System.out.println(a[i]);
		    	sum=sum+a[i];
		    	
		    }
		   
	   	System.out.println("Sum of marks is :"+sum);

		   
		   avg=sum/6;
		   System.out.println("Avg marks are :"+avg);
		   
		   if(avg>80) {
			   System.out.println("Grade is A");
		   }
		   
		   else if(avg>60 && avg<=80) {
			   System.out.println("Grade is B");
		   }
		   
		   else if(avg>40 && avg<=60) {
			   System.out.println("Grade is C");
		   }
		   
		   else {
			   System.out.println("Grade is D");
			   
		   }
		   
		   
		   
	        	   
		    
		    
			
			

		}

	}

	


