package CW2;

import java.util.*;



public class Tamagotchi {

	

 static Scanner console = new Scanner(System.in); //Declare console for input

 




/* Varaibles controlling the tamagotchi's health */

static double happiness = 100;

static double hunger = 0;
	
static double anger = 0;

static double tiredness = 0;

static double age = 0;
	
static String done = "done";

/* End of tamagotchi health */

 

 private String state;
Private void runAway() {
	System.out.println ("Your pet got too angry and has run away!");
	System.out.println ("Theres nothing you can do, try look after your pet better next time.");

private void deathMenu() {
	int action;
	
	System.out.println ("The tamagotchi is dying. :( *cry* *sob *sob*");
	System.out.println ("What would you like to do?");
	System.out.println (" 1) give the pet its last meal before it dies")
        System.out.println (" 2) let it die all alone")
	System.out.println (" 3) just leave it there")
	System.out.println (" 4) wait for it to die then burry it")
}
 
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

		  happiness =+ 40;
		  tiredness =+ 20;
		  hunger =+ 20;

	  } else if (action == 2) {

		  System.out.println("You played ball with Tamagotchi and the Tamagotchi got tired....");

		  happiness =+ 50;
		  tiredness =+ 40;
		  hunger =+ 20;

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

		   tiredness =+ 100;

	   } else if (action == 3) {

		   state = done;

	   }

	   

  }

	  /* Code to change later */
	
	  public void mainLoop() {
		  
		  // Start of value calibration
		  if (happiness > 100) {
			  happiness = 100;
		  } else if (happiness < 0) {
			  happiness = 0;
		  }
		  if (hunger > 100) {
			  hunger = 100;
		  } else if (hunger < 0) {
			  hunger = 0;
		  }
		  if (anger > 100) {
			  anger = 100;
		  } else if (anger < 0) {
			  anger = 0;
		  }
		  if (tiredness > 100) {
			  tiredness = 100;
		  } else if (tiredness < 0) {
			  tiredness = 0;
		  }
		  // End of value calibration
		  
		  // Start of state change
		  if (happiness >= 60 & anger < 50) {
			  state = "happy";
		  } else if (tiredness >= 70) {
			  state = "tired";
		  } else if (tiredness == 100) {
			  state = "asleep";
		  } else {
			  state = "asleep";
		  }
		  else if (hunger >=25) {
			   deathMenu();
		  }
		  else if (anger>=100) {
			  runAway();
		  }
		
		  // End of state change

		  

		  while (state!=done) {

			  switch(state) {

			  

			  case "asleep":

				  sleepMenu();
				  age =+ 1;

				  break;

				  

			  case "happy":

				  happyMenu();
				  age =+ 1;

				  break;


			  case "tired":

				  tiredMenu();
				  age =+ 1;

				  break;

				  default:

					  System.out.println("Illegal state! This should never occur. state is: " +state);

					  break;

			  } //end switch statement.

		  }  //end of while loop

		  System.out.println("Deactivating the Tamagotchi");

	  }

  

 

}
