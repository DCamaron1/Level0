
//public class BananaQuiz {

//}
//Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String youLikeBanana=JOptionPane.showInputDialog("Do you like bananas?");
		//2. if they say no, 
			//tell them they are crazy 
			//and end quiz
		if (youLikeBanana.equalsIgnoreCase("no")) {
			String otherFruit=JOptionPane.showInputDialog(null, "Well, what fruit do you like?");
			String favoriteHobby=JOptionPane.showInputDialog("What is your favorite hobby?");
			JOptionPane.showMessageDialog(null,favoriteHobby + " is much better with " + otherFruit);
		}
		//3. if they say yes
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"
		else if(youLikeBanana.equalsIgnoreCase("yes")){
			String favHobby=JOptionPane.showInputDialog("What is your favorite hobby?");
			JOptionPane.showMessageDialog(null,favHobby + " is much better with bananas!");
		}
		//4. OPTIONAL: if they say something other than “yes” or “no”
		//	show a pop up that says “You are bananas!”
		else
		{
			JOptionPane.showMessageDialog(null, "You are bananas!");
		}
	}

}
