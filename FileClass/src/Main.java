import java.io.File;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("Test.txt");
		
		if(file.exists()) {
			System.out.println(file.getPath());
			System.out.println("File exists at" + file.getAbsolutePath());
			System.out.println(file.isFile());
			//file.delete();
		}
		else {
			System.out.println("File not found");
		}

	}

}
