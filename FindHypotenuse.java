import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JOptionPane;


public class FindHypotenuse {
	public static void main(String[] args) {
		JTextField xField = new JTextField(20);
		JTextField yField = new JTextField(20);
		
		JPanel panel = new JPanel();
		
		panel.add(new JLabel("Enter first side:"));
		panel.add(xField);
		
		panel.add(new JLabel("Enter second side:"));
		panel.add(yField);
		
		int result = JOptionPane.showConfirmDialog(null, panel);
		
		if (result == JOptionPane.OK_OPTION) {
			double xVal = Double.parseDouble(xField.getText());
			double yVal = Double.parseDouble(yField.getText());
			
			double hypotenuse = Math.sqrt(Math.pow(xVal, 2) + Math.pow(yVal, 2));
			
			JOptionPane.showMessageDialog(null, "Hypotenuse = " + hypotenuse);
		}
	}
}
