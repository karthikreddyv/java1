import java.util.Scanner;
class sumofNnumbers
{
	public static void main (String[] args)
	{
	 int n1,i;
	 int s1=0;
	 Scanner s= new Scanner(System.in);
	 n1=s.nextInt();
	 for(i=1;i<=n1;i++)
	 s1=s1+i;
	 System.out.println("sum:"+s1);
  	}
}
