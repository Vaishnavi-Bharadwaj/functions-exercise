//Enter 3 numbers from the user and make a function to print their average
import java.util.*;
public class average
{
    public static int Avg(int a, int b, int c){
        return (a+b+c)/3;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		int average=Avg(x,y,z);
		System.out.println("the average of the numbers is "+average);
	}
}
