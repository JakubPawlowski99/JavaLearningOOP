import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.*;
public class Main {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		File file = new File("Archers.wav");
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(audioStream);
		
		
		String response = "";
		
		while(!response.equals("Q")) {
			
			System.out.println("P = play, S=Stop, R=Reset, Q=Quit");
			System.out.print("Enter response");
			
			response = scanner.next();
			response = response.toUpperCase();
			
			switch(response) {
				case ("P"): clip.start();
				break;
				
				case ("S"): clip.stop();
				break;
				
				case ("R"): clip.setMicrosecondPosition(0);
				break;
				
				case ("Q"): clip.close();
				break;
				
				default: System.out.println("Invalid response");
			}
		}
		
		System.out.println("Player is closed");
		
	}

}
