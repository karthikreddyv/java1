import java.util.*;
import java.lang.*;
import java.io.*;
class largest_among_three
{
	public static void main (String[] args)
	{
		int n1,n2,n3;
		int large;
		Scanner s = new Scanner(System.in);
		n1=s.nextInt();
		Scanner s = new Scanner(System.in);
		n2=s.nextInt();
		Scanner s = new Scanner(System.in);
		n3=s.nextInt();
		large=n1;
		if (n2>large)
		n2=large;
		if (n3>large)
		n3=large;
		System.out.println(large);
	}
}
