import javax.swing.JOptionPane;

public class Poteto {
	public static void main(String[] args) {
		int num = 1;
		String answer = JOptionPane.showInputDialog(null, "Do you want to read a poem?");
		if (answer.equals("yes")) {
			String answer2 = JOptionPane.showInputDialog(null,"What's your favorite animal?");
			//int times=Integer.parseInt(answer2);
			while (num < 8) {
				if (num == 4) {
					System.out.print(num+", ");
					num = num + 1;
				} else {
					System.out.print(num  + " "+answer2+", ");
					num = num + 1;
				}
			}
			System.out.print("more");
		} else {
			JOptionPane.showMessageDialog(null, "Ok :(");
		}
	}
}
