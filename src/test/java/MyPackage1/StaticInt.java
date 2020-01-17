package MyPackage1;

public class StaticInt 
{
	static int i=0;
	StaticInt()
	{
		i++;
		System.out.println(i);
	}
	public static void main(String[] args) 
	{
		StaticInt s1=new StaticInt();
		StaticInt s2=new StaticInt();
		StaticInt s3=new StaticInt();
		StaticInt s4=new StaticInt();

	}

}
