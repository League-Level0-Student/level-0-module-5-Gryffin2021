package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	public static void cuddle(String pet) {	
		if(pet.equals("dog")) {
			JOptionPane.showMessageDialog(null, "Your dog loves cuddling with you!");
			happinessLevel += 10;
		}else if(pet.equals("cat")) {
			JOptionPane.showMessageDialog(null, "Your cat enjoys cuddling with you.");
			happinessLevel += 5;
		}else if(pet.equals("hamster")) {
		JOptionPane.showMessageDialog(null, "You squeeze your hamster so hard it flys into the air and lands on a soft cushion. (It does not look happy)");
		happinessLevel += -5;
	}
	}
	public static void food() {
	}
	public static void water() {	
	}
	public static void takeAWalk() {
	}
	public static void groom() {
	}
	public static void cleanUpPoop() {	
	}
	// 1. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		// 2. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String question1 = JOptionPane.showInputDialog(null, "What kind of pet do you want? (dog, cat, hamster, duck, or fish)");
		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!
		for(int turns = 0; happinessLevel <= 100; turns ++) {
			// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What would you like to do with your " + question1 + "?", "Do something with your new pet!", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Cuddle", "Food", "Water", "Take a walk", "Groom", "Clean up poop" }, null);
					if(task == 0) {
						cuddle(question1);
					}
			// 6. Use user input to call the appropriate method created in step 5 below.

			// 7. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
		
		}
	}

	// 5. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
}