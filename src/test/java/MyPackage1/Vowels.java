package MyPackage1;
//Vowels count and replacing them with special characters
import java.util.Scanner;

public class Vowels 
{
	public static void main(String[] args) 
	{
	Scanner sct = new Scanner(System.in);
	System.out.println("Enter any string");
	String str= sct.nextLine();
	char ch[]=str.toCharArray();
	int count=0;
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]=='a'||ch[i]=='i'||ch[i]=='e'||ch[i]=='o'||ch[i]=='u')
		{
			ch[i]='$';
			count++;
		}
	}
	for(int i=0;i<ch.length;i++)
	{
	System.out.print(ch[i]);
	}
	System.out.println("  The number of vowels is "+count);
	}

}
