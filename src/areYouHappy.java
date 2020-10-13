import javax.swing.JOptionPane;

public class areYouHappy {
public static void main(String[] args) {
	


	String input = JOptionPane.showInputDialog("Are you happy?");
	
	if (input.equals("yes")) {
	JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing!");
		
	}
	if (input.equals("no")) {
		String OwO = JOptionPane.showInputDialog("Do you want to be happy?");
		if (OwO.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Change something.");
				
			}
			if (OwO.equals("no")) {
			JOptionPane.showMessageDialog(null, "Keep doing what you're doing.");
				
			}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}}