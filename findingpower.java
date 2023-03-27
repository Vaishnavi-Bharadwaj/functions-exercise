//two numbers are entered by the user x and n, write a function to find the value of one number raised to the power of another
import java.util.*;
public class findingpower{
    public static double power(double a, double b){
        return Math.pow(a,b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the values of x and n");
        double x=sc.nextInt();
        double n=sc.nextInt();
        System.out.println("the value is "+power(x,n));
    }
}