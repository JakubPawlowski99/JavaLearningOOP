
public class Main {

	public static void main(String[] args) {
		
		//To overload constuctor remove one of ingridients
		Pizza pizza = new Pizza("thick crust", "tomato", "cheddar", "salami");
		
		System.out.println("Your ingridients: ");
		System.out.println(pizza.bread);
		System.out.println(pizza.souce);
		System.out.println(pizza.cheese);
		System.out.println(pizza.topping);

	}

}
