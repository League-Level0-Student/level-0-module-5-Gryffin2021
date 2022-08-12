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
		}else if(pet.equals("duck")) {
			JOptionPane.showMessageDialog(null, "As you try to give your duck a hug, it flaps its wings aggressively and lets out a couple annoyed quacks.");
			happinessLevel += -10;
		}else if(pet.equals("fish")) {
			JOptionPane.showMessageDialog(null, "You take your fish out of the water and it flops arround in your hand. Realizing your mistake you plop it back into its bowl. What were you thinking?!");
			happinessLevel += -15;
	}
	}
	public static void food(String pet) {
		if(pet.equals("dog")) {
			JOptionPane.showMessageDialog(null, "Your dog enjoys getting fed.");
			happinessLevel += 5;
		}else if(pet.equals("cat")) {
			JOptionPane.showMessageDialog(null, "Your cat loves getting fed!");
			happinessLevel += 10;
		}else if(pet.equals("hamster")) {
			JOptionPane.showMessageDialog(null, "Your hamster is grateful to get a bite to eat. It lets out a happy squeal!");
			happinessLevel += 5;
		}else if(pet.equals("duck")) {
			JOptionPane.showMessageDialog(null, "Your duck quacks joyfully as it gobbles up its food!");
			happinessLevel += 10;
		}else if(pet.equals("fish")) {
			JOptionPane.showMessageDialog(null, "You drop some food into the water. Your fish happily eats it up.");
			happinessLevel += 5;
	}	
	}
	public static void water(String pet) {
		if(pet.equals("dog")) {
			JOptionPane.showMessageDialog(null, "Your dog enjoys lapping up sime fresh water.");
			happinessLevel += 5;
		}else if(pet.equals("cat")) {
			JOptionPane.showMessageDialog(null, "Your cat loves getting water! It won't stop drinking. I might be addicted to water!");
			happinessLevel += 10;
		}else if(pet.equals("hamster")) {
			JOptionPane.showMessageDialog(null, "Your hamster is grateful to get some water.");
			happinessLevel += 5;
		}else if(pet.equals("duck")) {
			JOptionPane.showMessageDialog(null, "Your duck looks at the pool of water 5 feet away from it, then back at you and the water canister next to you. It seems a litte annoyed.");
			happinessLevel += -10;
		}else if(pet.equals("fish")) {
			JOptionPane.showMessageDialog(null, "Nothing happened. Have you ever stopped to think where your fish lives?");
			happinessLevel += 0;
	}
	}
	public static void takeAWalk(String pet) {
		if(pet.equals("dog")) {
			JOptionPane.showMessageDialog(null, "Your dog loves taking a walk with you!");
			happinessLevel += 10;
		}else if(pet.equals("cat")) {
			JOptionPane.showMessageDialog(null, "Your cat likes walking with you and lets out a happy meow.");
			happinessLevel += 5;
		}else if(pet.equals("hamster")) {
			JOptionPane.showMessageDialog(null, "Your hamster can barely keep up and you nearly step on it because it's so small! It's so scarred it can't even move!");
			happinessLevel += -15;
		}else if(pet.equals("duck")) {
			JOptionPane.showMessageDialog(null, "Your duck loved being able to explore your backyard with you!");
			happinessLevel += 10;
		}else if(pet.equals("fish")) {
			JOptionPane.showMessageDialog(null, "YOU IDIOT!!! You place your fish on the side walk and notice its flopping up and down! Your fish barely survives as you rush it back to water!");
			happinessLevel += 45;
	}
	}
	public static void groom(String pet) {
		if(pet.equals("dog")) {
			JOptionPane.showMessageDialog(null, "Your dog enjoys getting groomed.");
			happinessLevel += 5;
		}else if(pet.equals("cat")) {
			JOptionPane.showMessageDialog(null, "Your cat loves getting groomed! It won't purring! You and your cat both fall asleep happily with it in your lap!");
			happinessLevel += 10;
		}else if(pet.equals("hamster")) {
			JOptionPane.showMessageDialog(null, "Your hamster is happy to be groomed.");
			happinessLevel += 5;
		}else if(pet.equals("duck")) {
			JOptionPane.showMessageDialog(null, "Your duck loves getting groomed! it bites your finger softly to express its love!");
			happinessLevel += 15;
		}else if(pet.equals("fish")) {
			JOptionPane.showMessageDialog(null, "Your fish is unamused.");
			happinessLevel += -5;
	}
	}
	public static void cleanUpPoop(String pet) {	
		if(pet.equals("dog")) {
			JOptionPane.showMessageDialog(null, "Your dog is mildly grafteful that yu clened up its poop.");
			happinessLevel += 5;
		}else if(pet.equals("cat")) {
			JOptionPane.showMessageDialog(null, "Your cat is grateful that it doesn't have to go to the restroom in its own poop.");
			happinessLevel += 5;
		}else if(pet.equals("hamster")) {
			JOptionPane.showMessageDialog(null, "Your hamster is glad that you cleaned up that disgusting stench coming from its cage.");
			happinessLevel += 5;
		}else if(pet.equals("duck")) {
			JOptionPane.showMessageDialog(null, "Your duck doesn't care.");
			happinessLevel += 0;
		}else if(pet.equals("fish")) {
			JOptionPane.showMessageDialog(null, "Your fish is so thankful that it doesn't have to breathe in its own feces anymore!");
			happinessLevel += 10;
	}
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
					if(task == 1) {
						food(question1);
					}
					if(task == 2) {
						water(question1);
					}
					if(task == 3) {
						takeAWalk(question1);
					}
					if(task == 4) {
						groom(question1);
					}
					if(task == 5) {
						cleanUpPoop(question1);
					}
			// 6. Use user input to call the appropriate method created in step 5 below.

			// 7. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
		if(happinessLevel >= 100) {
			JOptionPane.showMessageDialog(null, "Wow! You really do love your pet! (" + turns + " actions done)");
			break;
		}
		if(happinessLevel <= -50) {
			JOptionPane.showMessageDialog(null, "Wow! You're a terrible owner! Your pet hates you now!!! (" + turns + " actions done)");
			break;
		}
		}
	}

	// 5. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
}