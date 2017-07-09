import java.util.*;
import java.lang.*;
import java.io.*;
class alphabet_or_number
{
	public static void main (String[] args)
	{
		char alphabet;
		Scanner s = new Scanner(System.in);
		alphabet = s.next().charAt(0);
		if 
		(Character.isLetter(alphabet))
		System.out.println("It is an alphabet");
		else
		System.out.println("It is a number");
	}
}
