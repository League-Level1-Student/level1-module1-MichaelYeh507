package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornRunner {
	public static void main(String[] args) {
		String popcornFlavor = JOptionPane.showInputDialog("What flavor popcorn do you want?");
		String time = JOptionPane.showInputDialog("How many minutes do you want to cook the popcorn?");
		int timeToCook = Integer.parseInt(time);
		Popcorn pop = new Popcorn(popcornFlavor);
		Microwave micro = new Microwave();
		micro.putInMicrowave(pop);
		micro.setTime(timeToCook);
		micro.startMicrowave();
		
	}
}
