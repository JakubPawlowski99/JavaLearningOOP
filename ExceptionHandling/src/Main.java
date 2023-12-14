import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		try {
			
			
			System.out.println("Enter a whole number to divide");
			int x = scanner.nextInt();
			
			System.out.println("Enter a whole number to divide by");
			int y = scanner.nextInt();
			
			int z = x/y;
			
			System.out.println("Result: " + z);	
		}
		catch(ArithmeticException e) {
			System.out.println("Devision by zero");
		}
		catch(InputMismatchException e) {
			System.out.println("Type in number");
		}
		catch(Exception e) {
			System.out.println("Error " + e );
		}
		finally{
			System.out.println("End(This will always print)");
			scanner.close();
		}

	}

}
