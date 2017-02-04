import org.jointheleague.graphical.robot.Robot;

public class RobotFreestyle {
	public static void main(String[] args) {
		Robot bob = new Robot();
		bob.setSpeed(20);
		bob.penDown();
		bob.setPenWidth(10);
		for (int i = 0; i <= 60; i++) {
			bob.setRandomPenColor();
			bob.turn(6);
			bob.move(10);
		}
		bob.moveTo(0,0);
		for (int i = 0; i <= 60; i++) {
			bob.setRandomPenColor();
			bob.turn(6);
			bob.move(50);
	}
}
}
