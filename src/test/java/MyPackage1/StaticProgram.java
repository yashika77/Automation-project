package MyPackage1;

public class StaticProgram 
{
	 int id=3896;
	 String name;
	 static String company="QAIT";//coz it will remain same for all the objects 
	StaticProgram(int n,String m)//Parametrized Constructor
	{
		id=n;
		name=m;
	}
	void Display()
	{
		System.out.println(id+"  "+name+"  "+company);
	}
	
	public static void main(String[] args) 
	{
		StaticProgram s1 = new StaticProgram(3896,"Yashika");
		StaticProgram s2 = new StaticProgram(3772,"Dev");
		StaticProgram s3 = new StaticProgram(3345,"Raushan");
		StaticProgram s4 = new StaticProgram(3895,"Kanika");
		s1.Display();
		s2.Display();
		s3.Display();
		s4.Display();
	}

}
