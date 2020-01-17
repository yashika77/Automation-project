package MyPackage1;

abstract class Abst
{
	abstract void Bike();
	abstract void Car();

}
class Motor extends Abst
{
	void Bike()
	{
		System.out.print("Yamaha");
	}
	void Car()
	{
		System.out.println("Honda");
	}
}
public class Abstraction
{

	public static void main(String args[])
	{
		Motor m = new Motor();
		m.Car();
		m.Bike();
	}
}	
