import java.util.Scanner;
class sumOFdigits
{
	public static void main (String[] args)
	{
	 int n;
	 int c=0;
	 Scanner s= new Scanner(System.in);
	 n=s.nextInt();
	 while(n>0)
	 {
	   n=n/10;
	   c++;
	 }
	 System.out.println("count:"+c);
  	}
}
