package CW2;
import java.util.*;

public class TamagotchiWorld {
	
	//--main method needed in all programs
	public static void main(String[] args) {
		String name;
		final Scanner console = new Scanner(System.in);
		System.out.println("What name do you want for your Tamagotchi?");
		name = console.nextLine();
		Tamagotchi buggie = new Tamagotchi();
		buggie.nameCreation(name);
		buggie.mainLoop();
	}
	/*
	This code runs the code for naming the tamagotchi and running the tamagotchi class, which has all the code for the tamagotchi
	stored within it.
	*/

}
