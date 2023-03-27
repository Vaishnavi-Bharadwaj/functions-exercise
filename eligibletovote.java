//Write a function that takes in age as input and returns if that person is eligible to vote or not
import java.util.*;
public class eligibletovote {
    public static boolean eligible(int a){
        if(a>=18)
            return true;
        else
            return false;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age");
        int age=sc.nextInt();
        boolean Eligible=eligible(age);
        System.out.println(Eligible);
    }
}