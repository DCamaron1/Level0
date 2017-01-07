import org.jointheleague.graphical.robot.Robot;

public class RobotSquare {
	public static void main(String[] args) {
		Robot rob = new Robot();
		rob.setSpeed(20);
		rob.penDown();
		rob.setPenWidth(5);
		for (int x = 1; x <= 6; x = x + 1) {
			rob.setRandomPenColor();
			rob.move(100);
			rob.turn(60);
		}
		rob.turn(60);
		rob.move(200);
		rob.turn(-120);
		rob.move(100);
	}
}
