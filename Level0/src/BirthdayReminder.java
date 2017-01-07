import javax.swing.JOptionPane;

public class BirthdayReminder {
	public static void main(String[] args) {
		String davidBirthday = "October 27";
		String roseBirthday = "October 23";
		String isaacBirthday = "December 25";
		String whoseBirthday = JOptionPane.showInputDialog("Whose birthday do you want to know?");
		if (whoseBirthday.equalsIgnoreCase("david")) {
			JOptionPane.showMessageDialog(null, "It's on " + davidBirthday);
		}
		else if (whoseBirthday.equalsIgnoreCase("rose")) {
			JOptionPane.showMessageDialog(null, "It's on " + roseBirthday);
		}
		else if (whoseBirthday.equalsIgnoreCase("isaac")) {
			JOptionPane.showMessageDialog(null, "It's on " + isaacBirthday);
		}
		//make it do it if its blank or not an option
		else if (whoseBirthday.isEmpty()) {
			JOptionPane.showMessageDialog(null, "404 not found");
		}
	}
}
