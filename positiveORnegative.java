
import java.util.Scanner;
class positive_or_negative
{
	public static void main (String[] args) 
	{
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter value of a");
	   int	a = s.nextInt();
		if(a > 0)
		{
		System.out.println("number is positive");
		}
		else if(a < 0)
		{
		System.out.println("number is negative");
		}
		else
		{
		System.out.println("number is neither negative nor positive");
		}
	}
}