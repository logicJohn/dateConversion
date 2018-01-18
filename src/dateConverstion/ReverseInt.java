package dateConversion;

/** 
 * @author Johnnie Hernandez
 * @author CSCI2540
 * @version Assignment 1
 * 
 * <h1>Reverse Integer</h1>
 * This program takes a provided integer and prints it in reverse.
 * 
 * <b>Note:</b> When running program using negative integers 
 * causes each printed integer to also be negative.
*/

import java.util.Scanner;

public class ReverseInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp = getInt();
		System.out.println("Your number printed in reverse order is:");
		printReverseInt(temp);
	}

	/**
	 * Gets an integer from user through console
	 * @return An integer
	 */
	private static int getInt() {
		int temp = 0;
		System.out.println("Please enter an integer: ");
		Scanner sc = new Scanner (System.in);
		temp = sc.nextInt();
		sc.close();
		return temp;
	}
	
	/**
	 * Prints each of the digits of temp to the console 
	 * in reverse order
	 * @param temp An integer to be printed
	 */
	private static void printReverseInt(int temp) {
		if(temp == 0) {
			return ;
		}
		else {
			System.out.println(temp % 10);
			printReverseInt(temp / 10);
		}
	}
	
}
