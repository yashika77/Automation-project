package MyPackage1;

interface Abc
	{
		void add();
		
	}

class Intrfc implements Abc
{
	public void add()
	{
		System.out.println("Add");
	}

	public static void main(String[] args) 
	{
		Intrfc n= new Intrfc();
		n.add();

	}

}
