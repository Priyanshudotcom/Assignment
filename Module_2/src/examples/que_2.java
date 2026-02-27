package examples;

import java.util.Scanner;

public class que_2{

    static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        if (isPalindrome(input))
            System.out.println("It is a Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}