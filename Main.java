public class Main
{
	public static void main(String[] args) 
	{
		ParkingSpot[] spots = new ParkingSpot[5];
		spots[0] = new ParkingSpot(new Dimension(5, 5), 100, 5678);
		spots[1] = new ParkingSpot(new Dimension(10, 10), 200, 5679);
		spots[2] = new ParkingSpot(new Dimension(7, 7), 150, 5681);
		spots[3] = new ParkingSpot(new Dimension(6, 6), 130, 5682);
		spots[4] = new ParkingSpot(new Dimension(8, 8), 170, 5683);

		ParkingRecord rec = new ParkingRecord();
		rec.addParkingSpot(spots[0]);
		rec.addParkingSpot(spots[1]);
		rec.addParkingSpot(spots[2]);
		rec.addParkingSpot(spots[3]);
		rec.addParkingSpot(spots[4]);

		Person rhuel = new Person("Rhuel", 5000, new Car("Mistsubishi", "ABC 234"));
		Person hannah = new Person("Hannah", 2000, new Car("Honda", "DEf 531"));
		Person aleth = new Person("Aleth", 3000, new Car("Hanabishi", "IKL 312"));
		Person peter = new Person("Peter", 3000, new Car("Ford", "HES 290"));
		Person swisha = new Person("Swisha", 4000, new Car("Ranger", "UYI 462"));

		rec.addRent(new Rent(rhuel, spots[0], new Car("Mistsubishi", "ABC 234")));
		rec.addRent(new Rent(hannah, spots[1], new Car("Honda", "DEf 531")));
		rec.addRent(new Rent(aleth, spots[0], new Car("Hanabishi", "IKL 312")));
		rec.addRent(new Rent(peter, spots[3], new Car("Ford", "HES 290")));
		rec.addRent(new Rent(swisha, spots[4], new Car("Ranger", "UYI 462")));

		System.out.println(rec);
	}
}