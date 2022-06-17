package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class algrorithms_1_prime_or_not {
public static void main(String[] args) {
	String num = JOptionPane.showInputDialog(null, "Write a number");
	int num2 = Integer.parseInt(num);
	if(num2 == 2) {
		JOptionPane.showMessageDialog(null, "Your number is prime");
	}
	if(num2 == 1) {
		JOptionPane.showMessageDialog(null, "Your number is not prime");
	}
	if(num2 == 0) {
		JOptionPane.showMessageDialog(null, "Your number is not prime");
	}
	for(int i = 2; i < num2; i++) {
	if(num2 % i == 0) {
		JOptionPane.showMessageDialog(null, "Your number is not prime");
		break;
	}else {
		JOptionPane.showMessageDialog(null, "Your number is prime");
		break;
	}
	}
}
}

