
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		
		Robot one = new Robot();
		for (int i = 0; i < 3; i++) {
			
		
		String oof = JOptionPane.showInputDialog("What color would you like the robot to draw with.");
		
		if (oof.equals ("yellow")) {
			one.setPenColor(Color.YELLOW);
		}
		if (oof.equals ("green")) {
			one.setPenColor(Color.green);
		}
			if (oof.equals ("blue")) {
				one.setPenColor(Color.blue);
			}
			if (oof.equals ("red")) {
				one.setPenColor(Color.red);
	}
			if (oof.equals ("black")) {
				one.setPenColor(Color.black);
	}	
			if (oof.equals ("orange")) {
				one.setPenColor(Color.MAGENTA);
	}		
			
			one.setPenWidth(10);
		one.setSpeed(300);
		one.penDown();
		for (int i1 = 0; i1 < 4; i1++) {
			one.turn(360/4);
			one.move(110);
				
		}}}
		//2. Make the robot draw a shape (this will take more than one line of code)		
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	
}
