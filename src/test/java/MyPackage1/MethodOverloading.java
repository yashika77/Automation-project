package MyPackage1;

public class MethodOverloading 
{
	public void Add(int a, int b)
	{
		System.out.println(a+b);
	}
	public void Add(double c,double d)
	{
		System.out.println(c+d);
	}
	
	public static void main(String[] args) 
	{
		MethodOverloading m1 = new MethodOverloading();
		MethodOverloading m2 = new MethodOverloading();
		m1.Add(2, 3);
		m2.Add(10.1, 11.3);
		

	}

}
