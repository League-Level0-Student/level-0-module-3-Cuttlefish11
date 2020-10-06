
package _01_else_if._2_crazy_cat_lady;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		
	
		
			String input = JOptionPane.showInputDialog("How many cats do you have?");
			
			int heightToRide = Integer.parseInt(input);
			if (heightToRide > 2) {
				JOptionPane.showMessageDialog(null, "You are a crazy cat lady.");
			}
			else if (heightToRide > 1) {
				playVideo("https://www.youtube.com/watch?v=wf_IIbT8HGk"); 
			}
			else {
				playVideo("https://www.youtube.com/watch?v=oj_yLBltPE8");
			}
				JOptionPane.showMessageDialog(null, "Thanks to https://www.youtube.com/watch?v=wf_IIbT8HGk\n and https://www.youtube.com/watch?v=oj_yLBltPE8 for videos. It was legal to use those, right?");
		// 1. Ask the user how many cats they have
		// 2. Convert their answer into an int
		// 3. If they have 3 or more cats, tell them they are a crazy cat lady
		// 4. If they have less than 3 cats AND more than 0 cats, call the method below to show them a cat video
		//    Hint: You can use the && operator 
		// 5. If they have 0 cats, show them a video of A Frog Sitting on a Bench Like a Human
		
		
		
		
		
		
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

