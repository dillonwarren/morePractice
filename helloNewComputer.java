package helloWorld;

import java.awt.GridLayout;
import java.lang.reflect.Array;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class helloNewComputer {

	public static void main(String[] args) {
		
		//1. Create the frame.
		JFrame frame = new JFrame("FrameDemo");

		//2. Optional: What happens when the frame closes?
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//3. Create components and put them in the frame.
		//...create emptyLabel...
		frame.setBounds(30, 30, 300, 300);

		//4. Size the frame.
		frame.pack();
		
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		//5. Show it.
		frame.setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setBounds(30, 30, 300, 300);
		frame.add(panel);
		
		JButton button = new JButton("Search");
		
		button.setLocation(100,100);
		panel.add(button);
		button.setVisible(true);
		
		
		
		
		

	}

}

        