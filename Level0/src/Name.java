import javax.swing.JOptionPane;

public class Name {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog(null, "What is your name child?");
	JOptionPane.showMessageDialog(null, "Hello, "+ answer);
}
}
