package dateConverstion;

import java.util.Scanner;

public class gradeAvgCalc {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int[] grades;
		double average;
		grades = new int[getTotalGrades(sc)];
		getGrades(grades, sc);
		average = averageGrade(grades);
		aboveAverageGrades(grades, average);
		sc.close();
	}
	
	public static int getTotalGrades(Scanner sc) {
		int temp = 0;
		System.out.print("Please enter the number of grades: ");
		temp = sc.nextInt();
		System.out.println();
		return temp;
	}
	
	public static void getGrades(int[] grades, Scanner sc) {
		for (int i = 0; i < grades.length; i++) {
			System.out.print("Enter a grade: ");
			grades[i] = sc.nextInt();
		}
		return;
	}
	
	public static double averageGrade(int[] grades) {
		double temp = 0.0;
		for (int i = 0; i < grades.length; i++) {
			temp += grades[i];
		}
		temp = temp / grades.length;
		System.out.print("The average grade is: ");
		System.out.println(temp);
		return temp;
	}
	
	public static void aboveAverageGrades(int[] grades, double average) {
		int count = 0;
		for (int i = 0; i < grades.length; i++) {
			if (grades[i] > average) {
				System.out.println(grades[i]);
				count++;
			}
		}
		System.out.println("for a total of " + count + " grades");
	}
}
