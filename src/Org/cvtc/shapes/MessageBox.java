package Org.cvtc.shapes;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MessageBox implements Dialog {
	private JFrame frame;
	
	
	@Override
	public int show(String message, String title) {
		JOptionPane.showMessageDialog(frame,
				message,
				title,
				JOptionPane.PLAIN_MESSAGE);
		return JOptionPane.OK_OPTION;
	}
	
}
