package com.nagaraju.goud;

public class Mainclass {

	public static void main(String[] args) {
		Show s = new Show();
        Nagaraju n = new Nagaraju(s);
        Naga n1 = new Naga(s);
        n.start();
        n1.start();

	}

}
