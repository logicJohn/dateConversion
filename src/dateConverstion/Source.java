package dateConversion;

/** 
 * @author Johnnie Hernandez
 * @author CSCI2540
 * @version Assignment 1
 * 
 * <h1>Date Conversion</h1>
 * Takes a date given in US format and converts to European format
 * 
 * <b>EX:</b> mm/dd/yyyy = dd.mm.yyyy
 * <b>Note:</b> Program does not correct or check date input
*/

import java.util.Scanner;

public class Source {
	
	
	public static void main(String[] args) {
		String usDate = getDate(); 
		String euDate = usToEuDate(usDate);
		System.out.println("Your date in European form is:");
		System.out.println(euDate);
		return;
	}

	/**
	 * Gets a date in us format from console.
	 * @return A date in us format as a string.
	 */
	private static String getDate () {
		String temp = "";
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a date in the form month/day/year:");
		temp = sc.nextLine();
		sc.close();
		return temp;
	}
	
	/**
	 * Converts a string from US format to EU format.
	 * @param usDate date in US format.
	 * @return A date in EU format.
	 */
	private static String usToEuDate (String usDate) {
		String temp= "";
		String day = "dayError", month= "monthError", year = "yearError";
		int start = 0, end = 0;
		for (end=0 ; end < usDate.length(); end++) {
			if (usDate.charAt(end) == '/' && start == 0) {
				month = usDate.substring(start, end);
				start = end+1;
			}
			else if ( usDate.charAt(end) == '/') {
				day = usDate.substring(start, end);
				year = usDate.substring(end+1, usDate.length());
				break;
			}
		}
		temp = day +"."+ month +"."+ year;
		return temp;
	}
	
}
