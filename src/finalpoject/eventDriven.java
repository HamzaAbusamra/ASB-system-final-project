package finalpoject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class eventDriven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 JFrame frame = new JFrame("Event-Driven Example");
		    JButton button = new JButton("Click Me");

		    button.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		        System.out.println("Button was clicked!");
		      }
		    });

		    frame.add(button);
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    frame.pack();
		    frame.setVisible(true);
	}
}