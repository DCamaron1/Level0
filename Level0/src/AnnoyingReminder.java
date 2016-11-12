import javax.swing.JOptionPane;

public class AnnoyingReminder {
public static void main(String[] args) {
	String num=JOptionPane.showInputDialog(null,"What is your favorite number?");
	int numT=Integer.parseInt(num);
	
	for (int hi = 1; hi <=numT; hi=hi+1) {
		JOptionPane.showMessageDialog(null, "Thats nice");
	}
}
}
