package example;

import java.util.Scanner;

public class que_3 {
	
	public static void main(String[] args){
		Scanner number= new Scanner(System.in);
		System.out.println("Enter the Marks");
		int marks= number.nextInt();
		
		switch(marks/10) {
		case 10:
			break;
		case 9:
			System.out.println("Grades are: A");
			break;
		case 8:
			System.out.println("Grades are: b");
		case 7:
			System.out.println("Grades are: C");
			break;
		case 6:
			System.out.println("Grades are: D ");
			break;
		case 5:
			System.out.println("Grades are: E");
			break;
		
			
		}
	}

}
