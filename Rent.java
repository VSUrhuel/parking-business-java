public class Rent
{
	private Person person;
	private Car car;
	private ParkingSpot spot;

	public Rent(Person person, ParkingSpot spot, Car car)
	{
		this.person = person;
		this.spot = spot;
		this.car = car;
	}
	public Person getPerson()
	{
		return this.person;
	}
	public ParkingSpot getParkingSpot()
	{
		return this.spot;
	}
	@Override
	public String toString()
	{
		return this.person + "Spot " + this.spot;
	}
}