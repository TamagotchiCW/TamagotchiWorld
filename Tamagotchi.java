package CW2;

import java.util.*;



public class Tamagotchi {

	public void nameCreation(String name) {
		this.name = name;
	}
	

 static Scanner console = new Scanner(System.in); //Declare console for input

 
/* Varaibles controlling the tamagotchi's health */

public String name;
 
static double happiness = 100;

static double hunger = 0;
	
static double anger = 0;

static double tiredness = 0;

static double age = 0;
	
static String done = "done";

/* End of tamagotchi health */
 

 private String state;


 
 private void sleepMenu() {

	 int action;

	 System.out.println(name + " is sleeping. ZzzzzzZzzzzzZ....");

	 System.out.println("What would you like to do?");

	 System.out.println(" 1) Wake up " + name);

	 System.out.println(" 2) Leave " + name + " alone.");

	 System.out.println(" 3) Quit program.");

	 action = console.nextInt();

	 

	 if(action == 1) {

		 System.out.println(name + " wakes up when you call him.");

	 } else if (action == 2) {

		 System.out.println(name + " slept peacefully");

		 tiredness =- 20;

	 } else if (action == 3) {

		 state = done;

	 }

 }

 

  private void happyMenu() {

	  int action;

	  System.out.println(name + " is happy and looking at you.");

	  System.out.println("What would you like to do?");

	  System.out.println(" 1) Walk " + name);

	  System.out.println(" 2) Play ball with " + name);

	  System.out.println(" 3) Quite program.");

	  action = console.nextInt();

	  

	  if (action == 1) {

		  System.out.println(name + " runs around as you take them for a walk");

		  happiness =+ 40;
		  tiredness =+ 20;
		  hunger =+ 20;

	  } else if (action == 2) {

		  System.out.println("You played ball with " + name + " and the Tamagotchi got tired....");

		  happiness =+ 50;
		  tiredness =+ 40;
		  hunger =+ 20;

	  } else if(action == 3) {

		  state =  done;

	  } //end of else if statement

  } 

   private void hungryMenu() {
	   int action;
	   System.out.println(name + " is now beginning to start feeling hungry and needs feeding.");
	
           System.out.println("What would you like to do?");
	   System.out.println(" 1) Feed " + name + " pet food/water.");
	   System.out.println(" 2) Let " + name + " starve.");
	   System.out.println(" 3) Quit program.");
	   
	   if (action ==1) {
		   System.out.println(name + " is now feeling happy being fed pet food/water.");
		   state = happy;
	   } else if (action == 2) {
		   System.out.println(name + " is now feeling malnourished after not being fed pet food/water.");
	           state = sick;
	   } else if(action == 3) {
		   state = done;
	   } //end of else if statement (hungry) state for Tamagotchi
   }
		

   private void tiredMenu() {

	   int action;

	   System.out.println(name + " is looking tired and trying to keep its eyes open");

	   

	   System.out.println("What would you like to do?");

	   System.out.println(" 1) Poke " + name + ".");

	   System.out.println(" 2) Let " + name + " rest");

	   System.out.println(" 3) Quit program");

	   action = console.nextInt();

	   

	   if (action == 1) {

		   System.out.println(name + " growls at you");

		   anger =+ 25;

	   } else if (action == 2) {

		   System.out.println(name + " slowly falls asleep");

		   tiredness =+ 100;

	   } else if (action == 3) {

		   state = done;

	   }
	   
	   
}
	Private void runAway() {
		System.out.println ("Your pet got too angry and has run away!");
		System.out.println ("Theres nothing you can do, try look after your pet better next time.");
	}

	Private void deathMenu() {
		int action;
	
		System.out.println ("The tamagotchi is dying. :( *cry* *sob *sob*");
		System.out.println ("What would you like to do?");
		System.out.println (" 1) give the pet its last meal before it dies")
        	System.out.println (" 2) let it die all alone")
		System.out.println (" 3) just leave it there")
		System.out.println (" 4) wait for it to die then burry it")
	   }

	   

  }

	  /* Code to change later */
	
	  public void mainLoop() {
		  
		  if (age == 0) {
			sleepMenu();
			age += 1;
		  }		  
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
			  } else {
				  state = "tired";
			  }
			  // End of value calibration
			  
			  // Start of state change
			  if (happiness >= 60 & anger < 50) {
				  state = "happy";
			  } else if (tiredness >= 70) {
				  state = "tired";
			  } else if (tiredness == 100) {
				  state = "asleep";
			  } else if (hunger >= 25) {
				  deathMenu();  
			  } else if (anger = 100) {
				  runAway();  
			  } else {
				  state = "asleep";
			  }
			  // End of state change
			  
		  	while (state!="done") {

			  	switch(state) {

			  

			  	case "asleep":
			  		
				  	age =+ 1;
				  	sleepMenu();
				  	break;

				  

			  	case "happy":
			  		
				  	age =+ 1;
				  	happyMenu();
				  	break;
			  
			  	case "hungry":
			  		
				  	age =+ 1;
					hungryMenu();
					break;

			  	case "tired":
			  		
				  	age =+ 1;
				  	tiredMenu();
				  	break;

				  	default:

					  	System.out.println("Illegal state! This should never occur. state is: " + state);

					  	break;

			  	} //end switch statement.

		  	}  //end of while loop

		  	System.out.println("Deactivating the Tamagotchi");
		  }

}
