//write a functon which takes in 2 numbers and returns the greatest of the two
import java.util.*;
public class greatest{
    public static int greatest(int a,int b) {
        if(a>b)
            return a;
        else
            return b;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int Greatest=greatest(x,y);
        System.out.println("the greatest of the two numbers is "+Greatest);
    }
    
}