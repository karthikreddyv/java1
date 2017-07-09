import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  int x1,i;
	  int s1=0;
	 Scanner s= new Scanner(System.in);
	 x1=s.nextInt();
	 for(i=1;i<=x1;i++)
	 s1=s1+i;
	 System.out.println("sum:"+s1);
  	}
}