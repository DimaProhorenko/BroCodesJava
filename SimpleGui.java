import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.Box;

public class SimpleGui {
	public static void main(String[] args) {
		JTextField name = new JTextField(20);
		JTextField age = new JTextField(20);
		
		JPanel panel = new JPanel();
		panel.add(new JLabel("Your name: "));
		panel.add(name);
		panel.add(Box.createHorizontalStrut(15));
		panel.add(new JLabel("Your age: "));
		panel.add(age);
		
		int result = JOptionPane.showConfirmDialog(null, panel, "Enter name and age!", JOptionPane.OK_CANCEL_OPTION);
		
		if (result == JOptionPane.OK_OPTION) {
			JOptionPane.showMessageDialog(null, String.format("%s, you are %d years old.", name.getText(), Integer.parseInt(age.getText())));
		}
		
		System.out.println(result);
	}
}