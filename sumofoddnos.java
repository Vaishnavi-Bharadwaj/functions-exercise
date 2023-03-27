//to find the sum of odd numbers from 1 to n
import java.util.*;
public class sumofoddnos
{
    public static int SumOfOddNumbers(int n)
    {
        
        int sum=0;
        for(int i=1;i<=n;i++)
    
            sum=sum+((2*i)-1);
        return sum;
    }
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the number(m)");
	   int m=sc.nextInt();
	   System.out.println(SumOfOddNumbers(m));
	   
	    
	}
}
