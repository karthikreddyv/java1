import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int x1,x2,x3;
	int large;
	Scanner s = new Scanner(System.in);
	x1=s.nextInt();
	Scanner s = new Scanner(System.in);
	x2=s.nextInt();
	Scanner s = new Scanner(System.in);
	x3=s.nextInt();
	large=x1;
	if (x2>large)
	x2=large;
	if (x3>large)
	x3=large;
	System.out.println(large);
	}
}