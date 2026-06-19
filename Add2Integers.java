/**
 * File: Add2Integers.java
 * ----------------------------
 * This program adds two integers and prints their sum.
 * 
 * If this program were to extend the DialogProgram class,
 * The function would be the same but the presentation would
 * be totally different (a series of dialogue boxes instead
 * of the console window overlaying the view)
 */

import acm.program.*;

public class Add2Integers extends ConsoleProgram {
	
	public void run(){ promptUser(); }
	private void promptUser()
	{
		println("This program adds two integers.");
		int n1 = readInt("Enter n1: ");
		int n2 = readInt("Enter n2: ");
		int total = n1 + n2;
		println("the total is " + total + ".");
	}
}