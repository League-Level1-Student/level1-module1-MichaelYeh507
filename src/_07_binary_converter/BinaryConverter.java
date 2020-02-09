package _07_binary_converter;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	JFrame JF = new JFrame();
	JPanel JP = new JPanel();
	JTextField answer = new JTextField(20);
	JButton JB = new JButton("Convert");
	JLabel JL = new JLabel();
	
	void run() {
		JB.addActionListener(this);
		JF.setVisible(true);
		JF.add(JP);
		JP.setPreferredSize( new Dimension(600, 600));
		JP.add(answer);
		JP.add(JB);	
		JP.add(JL);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String text = answer.getText();
		JL.setText(convert(text));
		
		
	}
	String convert(String input) {
	    if(input.length() != 8){
	        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
	        return "-";
	    }
	    String binary = "[0-1]+";//must contain numbers in the given range
	    if (!input.matches(binary)) {
	        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
	        return "-";   
	    }
	    try {
	        int asciiValue = Integer.parseInt(input, 2);
	        char theLetter = (char) asciiValue;
	        return "" + theLetter;
	    } catch (Exception e) {
	        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
	        return "-";
	    }
	}
	
	public static void main(String[] args) {
		BinaryConverter BC = new BinaryConverter();
		BC.run();
	}
}
