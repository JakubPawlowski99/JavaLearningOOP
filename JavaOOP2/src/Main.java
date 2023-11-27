
public class Main {

	public static void main(String[] args) {
		
		Human human = new Human("Bob",44,73.0);
		Human human2 = new Human("Joe",23,73.0);
		
		
		System.out.println(human2.name + " is " + human2.age +" years old");
		
		System.out.println(human.name + " is " + human.age +" years old");
		System.out.println();
		human2.eat();
		human.drink();
	}

}
