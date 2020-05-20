package Varibals;

import java.util.Scanner;

public class ActiveStudent {
	
	public static void main (String [] args) {
		
		
		Scanner input = new Scanner (System.in);
		
		System.out.println ("How many percent you attending out of school? (0-100)");
		int time = input.nextInt();
		
		System.out.println ("Did you finish all your homework? yes/no?");
		String homework = input.next();
		
		System.out.println ("Have you recapped Java class? Yes/No");
		String java = input.next ();
		
		boolean timeResult = time <= 80%time;
		boolean homeworkResult = homework.equals("yes");
		boolean javaResult = java.contentEquals ("yes");
		
		boolean result = homeworkResult || javaResult;
		
		boolean activeStudent = timeResult && result;	
			
		System.out.println ("Active student: " +activeStudent);
		
	}
	

}
