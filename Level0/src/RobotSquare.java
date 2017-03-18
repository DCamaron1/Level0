import org.jointheleague.graphical.robot.Robot;

public class RobotSquare {
	public static void main(String[] args) {
		Robot rob = new Robot();
		rob.setSpeed(20);
		rob.penDown();
		rob.setPenWidth(5);
		for (int x = 1; x <= 6; x = x + 1) {
			rob.setPenColor(100,50,150);
			rob.move(100);
			rob.turn(60);
		}
		rob.turn(60);
		rob.penUp();	
		rob.move(100);
		rob.penDown();
		rob.setPenColor(100,0,0);
		rob.move(100);
		rob.turn(-120);
		rob.move(100);
		rob.turn(-60);
		rob.move(100);
		//rob.setRandomPenColor();
		rob.turn(-120);
		rob.move(100);
		rob.setPenColor(100,50,150);
		rob.turn(60);
		rob.move(100);
		rob.turn(-120);
		rob.move(100);
		rob.turn(-120);
		rob.move(100);
		rob.setPenColor(100,0,0);
		rob.turn(60);
		rob.move(100);
	}
}
