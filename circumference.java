//Write a function which takes in radius as the input and returns the circumference of the circle
import java.util.*;
public class circumference {
    public static double circum(int r) {
        return 2*3.14*r;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius");
        int a=sc.nextInt();
        double circumference=circum(a);
        System.out.println("the circumference of the circle is "+circumference);
    }
}