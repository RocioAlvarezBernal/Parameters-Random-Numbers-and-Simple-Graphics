/*
1. True/False questions For each of the following statements below,indicate whether it is true or false in Java:

a)The value of a local variable named i has no direct relationship with that of a variable named i in its caller.


b)The value of a parameter named x has no direct relationship with that of a variable named x in its caller.

2. Tracing method execution For the program below,trace through its execution by hand to show what output is produced when it runs.

*File:Hogwarts.java*-------------------*This program is just testing your understanding of parameter passing.
*/


//public class Hogwarts extends ConsoleProgram {
//	public void run() {
//		bludger(2001);
//	}
//
//	private void bludger(int y) {
//		int x = y / 1000;   2001/1000              2.01
//		int z = (x + y);      (2001/1000)+2001     2003.1
//		x = quaffle(z, y);     
//		println("bludger: x = " + x + ", y = " + y + ", z = " + z);
//	}
//
//	private int quaffle(int x, int y) {
//		int z = snitch(x + y, y);
//		y /= z;
//		println("quaffle: x = " + x + ", y = " + y + ", z = " + z);
//		return z;
//	}
//
//	private int snitch(int x, int y) {
//		y = x / (x % 10);
//		println("snitch: x = " + x + ", y = " + y);
//		return y;
//	}
//}


//Write a GraphicsProgram that draws a set of ten circles with different sizes, positions,
//and colors. Each circle should have a randomly chosen color, a randomly chosen radius
//between 5 and 50 pixels, and a randomly chosen position on the canvas, subject to the
//condition that the entire circle must fit inside the canvas without extending past the edge.
//The following sample run shows one possible outcome: 

//psuedo code use random.blank or equivalent to generate random factors and set limits with a 
//for loop between the specifications. 

import acm.program.*;
import acm.graphics.*; 

public class PRNSG extends GraphicsProgram{
	// setting constants for para
	private static final int MIN_SIZE = 5;
	private static final int MAX_SIZE =50;
	private static final int AMOUNT_OF_CIRCLES=10;
	private static final int BOUNDRY_X= getWidth();
	private static final int BOUNDRY_y= getHeight();

	public void run () {
		
		
	}
	
	
}
