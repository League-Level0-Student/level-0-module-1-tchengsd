import javax.swing.JOptionPane;

public class MyAges {
public static void main(String[] args) {
	String age = JOptionPane.showInputDialog("What is your age?");
	int ageNum = Integer.parseInt(age);
	for(int i=0;i<=ageNum;i++) {
		System.out.println(i);
}
}
}