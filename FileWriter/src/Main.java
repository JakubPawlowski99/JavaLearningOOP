import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		try {
			FileWriter writer = new FileWriter("file.txt");
			writer.write("Roses are red\nViolets are blue\n");
			writer.append("\n(A poem)");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
