
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero hero1 = new Hero("Batman", 42, "$$");
		Hero hero2 = new Hero("Superman", 44, "whatever");
		
		System.out.println(hero1.name);
		System.out.println(hero2.name);
		
		System.out.println(hero2.toString());
	}

}
