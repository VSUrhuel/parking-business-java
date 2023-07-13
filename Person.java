public class Person
{
	private String name;
	private double money;
	private Car car;

	public Person(String name, double money, Car car)
	{
		this.name = name;
		this.money = money;
		this.car = car;
	} 
	public double getMoney()
	{
		return this.money;
	}
	public void subtractAmount(double b)
	{
		this.money -= b;
	}
	@Override
	public String toString()
	{
		return "Name: " + this.name + " - Car " +this.car;
	}
}