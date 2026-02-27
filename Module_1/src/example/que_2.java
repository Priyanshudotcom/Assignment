package example;
import java.util.*;

public class que_2 {
	
	
	public static void main(String[] args){
		Scanner number1= new Scanner(System.in);
		System.out.println("Enter the first number");
		int a= number1.nextInt();
		
		Scanner number2= new Scanner(System.in);
		System.out.println("Enter the second number");
		int b= number2.nextInt();
		
		Scanner number3= new Scanner(System.in);
		System.out.println("Enter the third number");
		int c= number3.nextInt();

			
		        int largest;

		        if (a >= b && a >= c) {
		            largest = a;
		        } else if (b >= a && b >= c) {
		            largest = b;
		        } else {
		            largest = c;
		        }

		        System.out.println("The largest number is " + largest);
		    }
		}



