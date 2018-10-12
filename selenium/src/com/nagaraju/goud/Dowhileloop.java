package com.nagaraju.goud;

import java.util.Scanner;

public class Dowhileloop {

	public static void main(String[] args) {
		
				float a, b, res;
				char choice;
				Scanner sc = new Scanner(System.in);
				do {
					
					System.out.println("1.addition/n");
					System.out.println("2.subtraction/n");
					System.out.println("3.multiplication/n");
					System.out.println("4.division/n");
					System.out.println("5.exit./n");
					
					System.out.println("Enter your choice :");
					choice=sc.next().charAt(0);
					
					switch(choice) {
					
					case'1':
						System.out.println("Enter two numbers :");
						a=sc.nextFloat();
						b=sc.nextFloat();
						res=a+b;
					    System.out.println("Result :"+res);	
				        break;
				        
					case'2':
		     		    System.out.println("Enter two numbers :");
		     		    a=sc.nextFloat();
		     		    b=sc.nextFloat();
		     		    res=a-b;
		     		    System.out.println("Result :"+res);
		     		    break;
		     		    
					case'3':
						System.out.println("Enter two numbers :");
						a=sc.nextFloat();
						b=sc.nextFloat();
						res=a*b;
						System.out.println("Result :"+res);
						break;
					 
					case'4':
						System.out.println("Enter two numbers :");
						a=sc.nextFloat();
						b=sc.nextFloat();
						res=a/b;
						System.out.println("Result :"+res);
						break;
						
					case'5':
						System.exit(0);
						break;
						
					default:
					    System.out.println("whole choice wrong ");
					    break;
					 
					}
					
					System.out.println("--------------------------");
				}
				
				while(choice!=5); 
					
					
				}
		




	}


