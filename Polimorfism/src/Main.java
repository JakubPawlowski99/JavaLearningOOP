
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car();
		Bicycle bicycle = new Bicycle();
		Boat boat = new Boat();
		
		Vehicle[] racers = {car,bicycle,boat};
		
		for(Vehicle x : racers) {
			x.go();
		}
	}

}
