package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		addNumbers.addActionListener((e)->{
			String val1= JOptionPane.showInputDialog("type an integer value");
			String val2= JOptionPane.showInputDialog("type another integer value");
			int firstVal=Integer.parseInt(val1);
			int secondVal=Integer.parseInt(val2);
			
			int ans= firstVal+secondVal;
			JOptionPane.showMessageDialog(null, "The sum of your two numbers is "+ ans);
		});
		randNumber.addActionListener((e)->{
			Random rand= new Random();
			JOptionPane.showMessageDialog(null, "Here's a random number: "+ rand.nextInt());
		});
		tellAJoke.addActionListener((e)->{
			JOptionPane.showMessageDialog(null, "Why did the banana go to the hospital?");
			JOptionPane.showMessageDialog(null, "Because he wasn't peeling well!");
		});
		
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}
	
	
}
