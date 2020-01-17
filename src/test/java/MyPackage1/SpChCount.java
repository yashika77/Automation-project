package MyPackage1;

import java.util.Scanner;
//Program is to print count of special characters in a paragraph
public class SpChCount 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any string having special characters");
		String str = s.nextLine();
		char ch[]= str.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='!'||ch[i]=='!'||ch[i]=='@'||ch[i]=='#'||ch[i]=='$'||ch[i]=='%'||ch[i]=='^'||ch[i]=='&'||ch[i]=='*'||ch[i]=='('||ch[i]==')')
			{
				count++;
			}
		}	
		System.out.print("The number of special characters is: "+count);
	
	}
}
