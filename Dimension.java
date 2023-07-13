public class Dimension
{
	public double width;
	public double height;

	public Dimension(double width, double height)
	{
		this.width = width;
		this.height = height;
	}
	@Override
	public String toString()
	{
		return "[" + this.width + " x " + this.height + "]";
	}
}