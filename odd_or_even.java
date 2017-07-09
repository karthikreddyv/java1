
import java.util.Scanner;
class even_or_odd
{
	public static void main (String[] args) 
	{
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter value of a");
	   int	a = s.nextInt();
		if(a%2 == 0)
		{
		System.out.println("number is even");
		}
		else if(a%2 == 1)
		{
		System.out.println("number is odd");
		}
		else
		{
		System.out.println("number is neither even nor odd");
		}
	}
}