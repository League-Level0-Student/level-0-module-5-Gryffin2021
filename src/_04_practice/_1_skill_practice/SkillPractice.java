package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
		public static void main(String[] args) {

		SkillPractice skills = new SkillPractice();
		           skills.skill1();
		           skills.skill2();
		           skills.skill3();
		           skills.skill4();
		           skills.skill5();
		}

		void skill1() {
		// Use pop-ups for the following.
		// Ask the user how many dimes they have
			String dimes = JOptionPane.showInputDialog(null, "How many dimes do you have?");
			int dimes2 = Integer.parseInt(dimes);
		// Tell them how many cents they have (hint multiply by 10)
			dimes2 *= 10;
			JOptionPane.showMessageDialog(null, "You have " + dimes2 + " cents.");
		// Ask the user how tall they are (inches)
			String height = JOptionPane.showInputDialog(null, "How tall are you?");
			int height2 = Integer.parseInt(height);
		// If they are shorter than 36 inches, tell them to eat their Wheaties
			if(height2 < 36) {
				JOptionPane.showMessageDialog(null, "Eat your Wheaties!");
			}
		}

		void skill2() { // Write a loop to print every third number between 1 and 30 to the console
			for(int i = 3; i <= 30; i += 3) {
				System.out.println(i);
			}
		}

		void skill3() { // Get a random number that is less than 20 and print it to the console
			Random ran = new Random();
			int v = ran.nextInt(20);
			System.out.println(v);
		// Get another random number that is less than 10 and print it to the console
			Random ran2 = new Random();
			int v2 = ran2.nextInt(10);
			System.out.println(v2);
		// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction
			JOptionPane.showMessageDialog(null, v + " - " + v2 + " = " + (v - v2));
		}

		void skill4() { // In a pop-up, ask the user for the city they live in
			String city = JOptionPane.showInputDialog(null, "What city do you live in?");
		// If they answered "San Diego", tell them they live in America's Finest City
			if(city.equals("San Diego")) {
				JOptionPane.showMessageDialog(null, "You live in America's Finest City!");
			}
		// Otherwise, tell them to move to San Diego
			else{
				JOptionPane.showMessageDialog(null, "Move to San Diego!");
			}
		// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation."
			int cars = 3;
			if(cars == 0) {
					JOptionPane.showMessageDialog(null, "I bet you use public transportation.");
			}
		// If there is 1 car, use a pop-up to display the make/model of the car
			else if(cars == 1) {
				JOptionPane.showMessageDialog(null, "Your car is a car.");
		}
		// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them.
			else if(cars > 1) {
				JOptionPane.showMessageDialog(null, "I have 12 wheels between my cars.");
		}
		}

		void skill5() { // In a pop-up, ask the user for the name of their school
			String school = JOptionPane.showInputDialog(null, "What school do you go to?");
		// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message.
			JOptionPane.showMessageDialog(null, school + " is a fantastic school!");
		}
		}

