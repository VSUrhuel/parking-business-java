import java.util.*;
public class ParkingRecord
{
	private ArrayList<ParkingSpot> spots;
	private ArrayList<Rent> rents;
	private double totalRevenue;

	public ParkingRecord()
	{
		this.spots = new ArrayList<>();
		this.rents = new ArrayList<>();
		this.totalRevenue = 0;
	}
	public void addParkingSpot(ParkingSpot p)
	{
		spots.add(p);
	}
	public void removeParkingSpot(ParkingSpot p)
	{
		spots.remove(p);
	}
	public boolean addRent(Rent a)
	{
		for(ParkingSpot spot : spots)
		{
			if(spot.equals(a.getParkingSpot()) && spot.getIsAvailable() && a.getPerson().getMoney() > spot.getPrice())
			{
				rents.add(a);
				a.getPerson().subtractAmount(spot.getPrice());
				spot.setIsAvailable(false);
				return true;
			}
		}
		return false;
	}
	public boolean removeRent(Rent a)
	{
		for(ParkingSpot spot : spots)
		{
			if(spot.equals(a.getParkingSpot()))
			{
				rents.remove(a);
				spot.setIsAvailable(true);
				return true;
			}
		}
		return false;
	}
	public double businessRevenue()
	{
		for(Rent r : rents){
			this.totalRevenue += r.getParkingSpot().getPrice();
		}
		return totalRevenue;
	}
	public ArrayList<Rent> getListOfRents(){
		return this.rents;
	}
	public void setListOfRents(ArrayList<Rent> rents){
		this.rents = rents;
	}
	@Override
	public String toString(){
		String s = "List of Rentals\n\n";
		for(Rent r : rents){
			s += r.toString();
			s += "\n";
		  }
		s += "\nTotal Revenue: " + this.businessRevenue() + "\n";
		return s;
	}
}