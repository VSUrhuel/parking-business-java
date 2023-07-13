public class Car
{
	private String name;
	private String plateNumber;

	public Car(String name, String plateNumber)
	{
		this.name = name;
		this.plateNumber = plateNumber;
	}
	public void setPlateNumber(String plateNumber){
		this.plateNumber = plateNumber;
	}
	public String getName(){
		return this.name;
	}
	public String getPlateNumber(){
		return this.plateNumber;
	}
	@Override
	public String toString(){
		return " Name:" + this.name + " | Plate Number: " +this.plateNumber+ ".\n";
	}

}