import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

	public static void main(String[] args) {
		// 3. ask the user what color they would like the Robot to draw

		// 4. use an if/else statement to set the pen color that the user
		// requested (minimum of 2 colors)

		// 2. set the pen width to 10

		// 1. make the Robot draw a shape
		Robot bob = new Robot();
		bob.penDown();
		bob.setSpeed(50);
		bob.setPenWidth(10);
		String color = JOptionPane.showInputDialog("What color should the triangle be?");
		if (color.equals("red")) {
			bob.setPenColor(Color.RED);
		}
		else if (color.equals("blue")) {
			bob.setPenColor(Color.BLUE);
		}
		else if (color.equals("orange")) {
			bob.setPenColor(Color.ORANGE);
		}
		else if (color.equals("white")) {
			bob.setPenColor(Color.WHITE);
		}
		else if (color.equals("green")) {
			bob.setPenColor(Color.GREEN);
		}
		else {
			bob.setPenColor(Color.BLACK);
		}
		for (int i = 0; i < 3; i++) {
			bob.turn(120);
			bob.move(100);
		}
		
	}

}
