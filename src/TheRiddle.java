import javax.swing.JOptionPane;

public class TheRiddle {
	public static void main(String[] args) {
		int score = 0;
		String one = JOptionPane.showInputDialog("What is wrong with this statement?");
		if (one.equals("It's a question")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
			JOptionPane.showMessageDialog(null, "Your score:" + score);
		} else {
			JOptionPane.showMessageDialog(null, "Wrong :(");
			JOptionPane.showMessageDialog(null, "Correct answer: It's a question");
			JOptionPane.showMessageDialog(null, "Youe score:" + score);
		}
		
		String two = JOptionPane.showInputDialog("TV or videogames?");
		if (two.equals("videogames")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
			JOptionPane.showMessageDialog(null, "Your score:" + score);
		} else {
			JOptionPane.showMessageDialog(null, "Wrong :(");
			JOptionPane.showMessageDialog(null, "Correct answer: videogames");
			JOptionPane.showMessageDialog(null, "Youe score:" + score);
		}
	}
}
//No items, Final Destination, Fox only (The year is 20XX)