package _03_method_writing._4_calculator;

import javax.swing.JOptionPane;

public class Calculator {
	static int number;
	//GOAL: MAKE A CALCULATOR
	public static void main(String[] args) {
		String input1 = JOptionPane.showInputDialog("Enter a number");
		String input2 = JOptionPane.showInputDialog("Enter another number");
		
		int number1 = Integer.parseInt(input1);
		int number2 = Integer.parseInt(input2);
		int task = JOptionPane.showOptionDialog(null, "What do you choose?", "Calculator", 0,
			JOptionPane.INFORMATION_MESSAGE, null, new String[] { "divide", "multiply", "subtract", "add" }, null);

		// 3) Call the correct method depending on what option the user chooses
		if(task == 0) {
			divide(number1, number2);
		}
		if(task == 1) {
			multiply(number1, number2);
		}
		if(task == 2) {
			subtract(number1, number2);
		}
		if(task == 3) {
			add(number1, number2);
		}
		// 4) Call the result() method and put the answer in a pop-up
	JOptionPane.showMessageDialog(null, result(number));
	}
	// 1) Make 4 static methods (add, subtract, multiply, divide)
	//		They should each take 2 numbers as parameters
	//		and return the answer.		
	public static int add(int num1, int num2) {	
		return number = num1 + num2;
	}
	public static int subtract(int num1, int num2) {	
		return number = num1 - num2;
	}
	public static int multiply(int num1, int num2) {	
		return number = num1 * num2;
	}
	public static int divide(int num1, int num2) {
		return number = num1 / num2;
	}
	// 2) Make a static method called " result" that takes a number
	//		as a parameter and returns the number in a string
	//		EX: "Your answer is " + number;
	public static String result(int number) {	
		return "Your answer is " + number;
	} 

}
