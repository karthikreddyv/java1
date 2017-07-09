import java.util.Scanner;
class vowels_or_consonants
{
	public static void main (String[] args) throws java.lang.Exception
	{
		char ch;
	   	Scanner s=new scanner(System.in);
	   	System.out.println("ch:");
	  	ch=s.next().charAt(0);
		if(ch=='a'||'A'||'e'||'E'||'i'||'I'||'o'||'O'||'u'||'U')
		{
			System.out.println("The given character is a vowel.");
		}
		else
		{
			System.out.println("The given character is a consonant ");
		}
	}
}
