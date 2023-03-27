//Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeroes entered 
import java.util.*;
import java.util.Scanner;

public class countofallthenumbers {
    public static void main(String[] args) {
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter a number (or 'stop' to exit): ");
            String str = sc.nextLine();
            
            if (str.equals("stop")) {
                break;
            }
            
            int num = Integer.parseInt(str); //to convert the string into a number
            
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }
        
        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);
        System.out.println("Zeroes: " + zeroCount);
    }
}