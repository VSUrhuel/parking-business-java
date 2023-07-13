public class ParkingSpot
{
	private boolean isAvailable;
	private Dimension dimension;
	private int numCode;
	private double price;

	public ParkingSpot(Dimension dimension, double price, int numCode)
	{
		this.dimension = dimension;
		this.price = price;
		this.numCode = numCode;
		this.isAvailable = true;
	}
	public void setIsAvailable(boolean s)
	{
		this.isAvailable = s;
	}
	public boolean getIsAvailable()
	{
		return this.isAvailable;
	}
	public int getNumCode()
	{
		return this.numCode;
	}
	public double getPrice()
	{
		return this.price;
	}
	@Override
	public boolean equals(Object obj)
	{
		return (obj instanceof ParkingSpot) ? ((((ParkingSpot)obj).getNumCode() == this.numCode) ? true : false) : false;
	}
	@Override
	public String toString()
	{
		return " Dimension: " + this.dimension.toString() + " Price: " +this.price + " [" +this.isAvailable + "]" + "\n";
	}
}