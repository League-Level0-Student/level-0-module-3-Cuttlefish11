import javax.swing.JOptionPane;

public class chooseYourOwnAdventure {
public static void main(String[] args) {
	
String input = JOptionPane.showInputDialog("Do you like cheese?");
if (input.equals("yes")) {
	String OwO = JOptionPane.showInputDialog("Do you like swiss or chedder more?");
	if (OwO.equals("swiss")) {
		JOptionPane.showMessageDialog(null, "Change something.");
			
		}
		if (OwO.equals("chedder")) {
		JOptionPane.showMessageDialog(null, "Keep doing what you're doing.");
			
		}
}
	
	if (input.equals("no")) {
		String portal = JOptionPane.showInputDialog("Are you Lactose intolerant?");
		if (portal.equals("yes")) {
			JOptionPane.showMessageDialog(null, "I am sorry for you.");
				
			}
			if (portal.equals("no")) {
			JOptionPane.showMessageDialog(null, "Then you are an abomanation.");
				
			}
	}

	
	
	
	
	
	
	
}}
