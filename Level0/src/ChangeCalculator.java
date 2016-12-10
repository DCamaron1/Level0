import javax.swing.JOptionPane;

public class ChangeCalculator {
	public static void main(String[] args) {
		int six = 6;
		while(six<1){
			String countChange = JOptionPane.showInputDialog("Do you want me to count your change?");
			if (countChange.equals("yes")) {
				String quarters = JOptionPane.showInputDialog("How many quarters do you have?");
				String dimes = JOptionPane.showInputDialog("How many dimes?");
				String nickels = JOptionPane.showInputDialog("How many nickels?");
				String pennies = JOptionPane.showInputDialog("How many pennies?");
				int numQuarters = Integer.parseInt(quarters);
				int numDimes = Integer.parseInt(dimes);
				int numNickels = Integer.parseInt(nickels);
				int numPennies = Integer.parseInt(pennies);
				int total = numQuarters*25 + numDimes*10 + numNickels*5 + numPennies;
				int totalDollars = total/100;
				int totalCents = total%100;
				if (totalDollars>0) {
					JOptionPane.showMessageDialog(null, "You have "+ totalDollars + " dollar and " + totalCents + " cents in total. Hooray");
				}
				else{
						JOptionPane.showMessageDialog(null, "You have "+ totalCents + " cents in total. Hooray!");
				}
			six = six-1;	
			}
		}
	}
}
