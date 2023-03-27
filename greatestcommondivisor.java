//write a function that calculates the greatest common divisor of 2 numbers
import java.util.*;
public class greatestcommondivisor{
    public static int GCD(int a, int b){ //The GCD method uses a simple algorithm to find the GCD of two numbers. It subtracts the smaller number from the larger number repeatedly until one of them becomes zero. The remaining non-zero number is the GCD of the original two numbers.
        while(b!=0)
        {
            if(a>b)
                a=a-b;
            else
                b=b-a;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("GCD of the numbers is "+GCD(x,y));
    }
}
