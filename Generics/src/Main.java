
public class Main {

	public static void main(String[] args) {
		
//		MyIntegerClass myInt = new MyIntegerClass(2);
//		MyDoubleCass myDouble = new MyDoubleCass(3.14);
//		MyCharacterClass mychar = new MyCharacterClass('@');
//		MyStringClass myString = new MyStringClass("bonjour");
//		
		
		MyGenericClass<Integer> myIntGeneric = new MyGenericClass<>(2);
		MyGenericClass<Double> myDoubleGeneric = new MyGenericClass<>(3.14);
		MyGenericClass<Character> mycharGeneric = new MyGenericClass<>('@');
		MyGenericClass<String> myStringGeneric = new MyGenericClass<>("bonjour");
		
//		System.out.println(myInt.getValue());
//		System.out.println(myDouble.getValue());
//		System.out.println(mychar.getValue());
//		System.out.println(myString.getValue());
		
		
		System.out.println(myIntGeneric.getValue());
		System.out.println(myDoubleGeneric.getValue());
		System.out.println(mycharGeneric.getValue());
		System.out.println(myStringGeneric.getValue());
		
		
		Integer[] intArray = {1,2,3,4,5};
		Double[] dobuleArray = {2.2,3.3,4.4,5.5};
		Character[] charArray = {'a','b','c','d','e'};
		String[] stringArray = {"uu", "ii", "oo"};
		
		displayArray(stringArray);
		System.out.println(getFirst(charArray));
		
	}
	public static <T> void displayArray(T[] array) {
		for(T x: array) {
			System.out.print(x+" ");
		}
		System.out.println();
	}
	
	
	public static <T> T getFirst(T[] array) {
		return array[0];
	}
	
//	public static void displayArray(Double[] array) {
//		for(Double x: array) {
//			System.out.print(x+" ");
//		}
//		System.out.println();
//	}
//	public static void displayArray(Character[] array) {
//		for(Character x: array) {
//			System.out.print(x+" ");
//		}
//		System.out.println();
//	}
//	public static void displayArray(String[] array) {
//		for(String x: array) {
//			System.out.print(x+" ");
//		}
//		System.out.println();
//	}
	
	
}
