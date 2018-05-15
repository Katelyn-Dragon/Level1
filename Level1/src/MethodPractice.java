import javax.swing.JOptionPane;

public class MethodPractice {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("Input A Number");
		int input = Num(answer); 
		System.out.println(input);
	}
	static int Num(String answer){
		int number = Integer.parseInt(answer);
		number *= number;
		return number;
	}
}
