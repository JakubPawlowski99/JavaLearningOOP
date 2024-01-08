import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JOptionPane.showMessageDialog(null, "This appears in dialog","Title", JOptionPane.PLAIN_MESSAGE);
		//JOptionPane.showMessageDialog(null, "This appears in dialog","Title", JOptionPane.INFORMATION_MESSAGE);
		//JOptionPane.showMessageDialog(null, "Question", "Title", JOptionPane.QUESTION_MESSAGE);
		
//		while(true) {
//			JOptionPane.showMessageDialog(null, "Your computer has a virus! ","Title", JOptionPane.WARNING_MESSAGE);
//		}
		//JOptionPane.showMessageDialog(null, "ERROR","Title", JOptionPane.ERROR_MESSAGE);
		
	//------------------------	
	//	int answer = JOptionPane.showConfirmDialog(null, "This appears in dialog","Title", JOptionPane.YES_NO_CANCEL_OPTION);
	//----------------------------------------	
//		String name = JOptionPane.showInputDialog("ENTER YOUR NAME");
//		
//		System.out.println("Hello " + name);
	//-------------------------------------------
		String[] responses = {"no","yes","cancel"};
		
		JOptionPane.showInternalOptionDialog(null, 
				"Message", 
				"Title", 
				JOptionPane.YES_NO_CANCEL_OPTION,  
				JOptionPane.INFORMATION_MESSAGE, 
				null,
				responses, 
				0);
		
	}

}
