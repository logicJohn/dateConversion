package dateConverstion;

import java.util.Scanner;

public class Source {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		String usDate = getDate ();
		String euDate = usToEuDate (usDate);
		System.out.println(euDate);
		return;
	}

	public static String getDate () {
		String temp = "";
		Scanner sc = new Scanner (System.in);
		temp = sc.nextLine();
		sc.close();
		return temp;
	}
	
	public static String usToEuDate (String usDate) {
		String temp= "";
		String day = "dayError", month= "monthError", year = "yearError";
		int start = 0, end = 0;
		for (end=0 ; end < usDate.length(); end++) {
			if(usDate.charAt(end) == '/' && start == 0) {
				month = usDate.substring(start, end);
				start = end+1;
			}
			else if( usDate.charAt(end) == '/') {
				day = usDate.substring(start, end);
				year = usDate.substring(end+1, usDate.length()-1);
				break;
			}
		}
		temp = day +"."+ month +"."+ year;
		return temp;
	}
	
}
