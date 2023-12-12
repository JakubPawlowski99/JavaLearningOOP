
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car("Chervolet", "Camaro", 2005);
		
		System.out.println(car.getMake());
		System.out.println(car.getYear());
		
		car.setYear(2022);
		
		System.out.println(car.getYear());
	}

}
