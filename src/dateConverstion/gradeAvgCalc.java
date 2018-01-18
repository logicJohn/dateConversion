package dateConverstion;

/** 
 * @author Johnnie Hernandez
 * @author CSCI2540
 * @version Assignment 1
 * 
 * <h1>Grade Average Calculator</h1>
 * This program takes a list of assignments from the user.
 * Then calculates the users grade average and displays
 * the assignments that are above the average.
 * 
 * 
 * <b>Note:</b> When starting the program inserting a total
 * number of grades less than 1 will result in the program ending
*/

import java.util.Scanner;

public class gradeAvgCalc {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int[] grades;
		double average;
		int numOfGrades = getTotalGrades(sc);
		if (numOfGrades < 1 )
		{
			System.out.print("The number of assignments is 0 or less"
					+ "exiting program.");
		}
		grades = new int[numOfGrades];
		getGrades(grades, sc);
		average = averageGrade(grades);
		aboveAverageGrades(grades, average);
		sc.close();
	}
	
	/**
	 * Gets the total number of assignments from console.
	 * @param sc Scanner for the program input.
	 * @return An integer representing the total number of grades.
	*/
	private static int getTotalGrades(Scanner sc) {
		int temp = 0;
		System.out.print("Please enter the number of grades: ");
		temp = sc.nextInt();
		System.out.println();
		return temp;
	}
	
	/**
	 * Fills the array grades with each of the assignment 
	 * through input sc.
	 * @param grades An empty integer array.
	 * @param sc Scanner the program input.
	 */
	private static void getGrades(int[] grades, Scanner sc) {
		for (int i = 0; i < grades.length; i++) {
			System.out.print("Enter a grade: ");
			grades[i] = sc.nextInt();
		}
		return;
	}
	
	/**
	 * Find the average of the assignments in the array grades.
	 * @param grades An integer array containing all assignments.
	 * @return Average of grades.
	 */
	private static double averageGrade(int[] grades) {
		double temp = 0.0;
		for (int i = 0; i < grades.length; i++) {
			temp += grades[i];
		}
		temp = temp / grades.length;
		System.out.print("\nThe average grade is: ");
		System.out.println(temp);
		return temp;
	}
	
	/**
	 * Finds all assignments that are above the average grade.
	 * @param grades An integer array containing all assignments.
	 * @param average A double expressing the average of grades.
	 */
	private static void aboveAverageGrades(int[] grades, double average) {
		int count = 0;
		System.out.println("\nThe grades above the average grade are:");
		for (int i = 0; i < grades.length; i++) {
			if (grades[i] > average) {
				System.out.println(grades[i]);
				count++;
			}
		}
		System.out.println("for a total of " + count + " grades");
	}
}
