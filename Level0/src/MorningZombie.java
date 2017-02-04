import javax.swing.JOptionPane;

public class MorningZombie {
	public static void main(String[] args) {
		String whatDay = JOptionPane.showInputDialog("What day is it?");
		if (whatDay.equalsIgnoreCase("monday")||whatDay.equalsIgnoreCase("tuesday")||whatDay.equalsIgnoreCase("wednesday")) {
			dayPrint();
		}
		/*else if(whatDay.equalsIgnoreCase("tuesday")){
			dayPrint();
		}
		else if (whatDay.equalsIgnoreCase("wednesday")) {
			dayPrint();
		}
		else if (whatDay.equalsIgnoreCase("thursday")) {
			dayPrint();
		}
		else if (whatDay.equalsIgnoreCase("friday")) {
			dayPrint();
		}*/
		else{
			JOptionPane.showMessageDialog(null, "OH yeah, it's "+whatDay);
		
		}
	}
	static void dayPrint(){
		JOptionPane.showMessageDialog(null, "It's late! WAKE UP!!");
		JOptionPane.showMessageDialog(null, "Wait you answered my question so you are awake");
		JOptionPane.showMessageDialog(null, "Go eat something. Bon appetite");
	}
}
