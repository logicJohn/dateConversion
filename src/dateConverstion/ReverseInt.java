package dateConverstion;

import java.util.Scanner;

public class ReverseInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp = getInt();
		System.out.println("Your number printed in reverse order is:");
		printReverseInt(temp);
	}

	public static int getInt() {
		int temp = 0;
		System.out.println("Please enter an integer: ");
		Scanner sc = new Scanner (System.in);
		temp = sc.nextInt();
		sc.close();
		return temp;
	}
	
	public static void printReverseInt(int temp) {
		if(temp == 0) {
			return ;
		}
		else {
			System.out.println(temp % 10);
			printReverseInt(temp / 10);
		}
	}
	
	
	
	
	
}
