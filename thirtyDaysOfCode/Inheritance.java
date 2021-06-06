package thirtyDaysOfCode;

import java.util.*;

class Person1 {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person1(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person1 {
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
	
	public Student(String firstName, String lastName, int id, int[] scores) {
		super(firstName, lastName, id);
		testScores = scores;
	}

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
	public char calculate() {
		float average = 0;
		
		for (int i = 0; i < testScores.length; i++) {
			average += testScores[i];
		}
		
		average = (float) (average / (testScores.length * 1.0));
		
		if (average <= 100 && average >= 90) {
			return 'O';
		} else if (average >= 80) {
			return 'E';
		} else if (average >= 70) {
			return 'A';
		} else if (average >= 55) {
			return 'P';
		} else if (average >= 40) {
			return 'D';
		} else {
			return 'T';
		}
	}
}

public class Inheritance {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
}