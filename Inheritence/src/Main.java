
public class Main {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.go();
		System.out.println(car.speed);
		System.out.println(car.doors);
		
		
		Bike bike = new Bike();
		bike.stop();
		System.out.println(bike.speed);
		System.out.println(bike.peddals);
	}

}
