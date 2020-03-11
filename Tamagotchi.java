package CW2;

import java.util.*;



public class Tamagotchi {

	

 static Scanner console = new Scanner(System.in); //Declare console for input

 




/* Varaibles controlling the tamagotchi's health */

static final int happiness = 100;

static final int hunger = 100;
	
static final int anger = 0;

static final int tiredness = 0;

static final int age = 0;
	
static final String done = "done";

/* End of tamagotchi health */

 

 private String state;


 
 private void sleepMenu() {

	 int action;

	 System.out.println("The tamagotchi is sleeping. ZzzzzzZzzzzzZ....");

	 System.out.println("What would you like to do?");

	 System.out.println(" 1) Wake up the Tamagotchi");

	 System.out.println(" 2) Leave the tamagotchi alone.");

	 System.out.println(" 3) Quit program.");

	 action = console.nextInt();

	 

	 if(action == 1) {

		 System.out.println("The tamagotchi wakes up when you call him.");

	 } else if (action == 2) {

		 System.out.println("The tamagotchi slept peacefully");

		 tiredness =- 20;

	 } else if (action == 3) {

		 state = done;

	 }

 }

 

  private void happyMenu() {

	  int action;

	  System.out.println("The tamagotchi is happy and looking at you.");

	  

	  System.out.println("What would you like to do?");

	  System.out.println(" 1) Walk the Tamagotchi.");

	  System.out.println(" 2) Play ball with the Tamagotchi");

	  System.out.println(" 3) Quite program.");

	  action = console.nextInt();

	  

	  if (action == 1) {

		  System.out.println("The tamagotchi runs around as you take them for a walk");

		  happiness =+ 20;
		  tiredness =+ 20;
		  hunger =- 10;

	  } else if (action == 2) {

		  System.out.println("You played ball with Tamagotchi and the Tamagotchi got tired....");

		  happiness =+ 40;
		  tiredness =+ 40;
		  hunger =- 20;

	  } else if(action == 3) {

		  state =  done;

	  } //end of else if statement

  } 

	

   private void tiredMenu() {

	   int action;

	   System.out.println("The tamagotchi is looking tired and trying to keep its eyes open");

	   

	   System.out.println("What would you like to do?");

	   System.out.println(" 1) Poke the tamagotchi.");

	   System.out.println(" 2) Let the tamagotchi rest");

	   System.out.println(" 3) Quit program");

	   action = console.nextInt();

	   

	   if (action == 1) {

		   System.out.println("The tamagotchi growls at you");

		   anger =+ 25;

	   } else if (action == 2) {

		   System.out.println("The tamagotchi slowly falls asleep");

		   tiredness =- 100;

	   } else if (action == 3) {

		   state = done;

	   }

	   

  }

	  /* Code to change later */
	
	  public void mainLoop() {
		  
		  if ()

		  if (happiness => 60 && anger < 50) {
			  state = "happy";
		  } else if (tiredness => 70) {
			  state = "tired";
		  } else if ()

		  
		  
		  
		  
		/*  	static final int happiness = 100;

			static final int hunger = 100;
	
			static final int anger = 0;

			static final int tiredness = 0;

			static final int age = 0;
	
			static final int done = 9; */

		  while (state!=done) {

			  switch(state) {

			  

			  case "asleep":

				  sleepMenu();

				  break;

				  

			  case "happy":

				  happyMenu();

				  break;


			  case "tired":

				  tiredMenu();

				  break;

				  default:

					  System.out.println("Illegal state! This should never occur. state is: " +state);

					  break;

			  } //end switch statement.

		  }  //end of while loop

		  System.out.println("Deactivating the Tamagotchi");

	  }

  

 

}
