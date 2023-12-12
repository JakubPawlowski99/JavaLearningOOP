
public class Fish implements Predator,Prey{

	@Override
	public void flee() {
		System.out.println("Fish is fleeing");
		
	}

	@Override
	public void hunt() {
		System.out.println("Fish is hunting");
		
	}
	
}
