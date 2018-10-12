package com.nagaraju.goud;

public class Trycatch {

		int i = 10;

	public static void main(String[] args) {
			
		
		System.out.println("nagaraju");
		try {
			System.out.println("nag");

		} catch (ArithmeticException e) {
			System.out.println();
			System.out.println(10/0);


		}
		finally {
			System.out.println("nagarajugoud");
			try {
				System.out.println(10/0);

			} catch (RuntimeException e2) {
			}

		}


		System.out.println("nagaraju");
		Trycatch a = new Trycatch();
		
		System.out.println(a.i);
			

		}

	}



