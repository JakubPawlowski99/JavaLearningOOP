
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("Chervolet", "Camaro", 2005);
		Car car2 = new Car("Dodge","Charger",2019);
		
//		System.out.println(car1.getMake());
//		System.out.println(car1.getYear());
//		car1.setYear(2022);	
//		System.out.println(car1.getYear());
		
		car2.copy(car1);
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println();
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
		System.out.println();
		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());
	}

}
