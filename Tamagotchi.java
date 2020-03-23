package CW2;

import java.util.*;

/*
The code we used as a base for the menu's and the mainLoop were inspired off this video one of our team members had found
'https://www.youtube.com/watch?v=wUo3HrziWiM&feature=youtu.be'
This video gave us the outline for the overall structure of this program and helped us a lot in developing it.
After learning from the video how the code worked and how everything tied together, we started adding our own states and menu's along with
our own features. This in the end led to this program.
*/

public class Tamagotchi {
	/* Code for name implementation */
	public void nameCreation(String name) {
		this.name = name;
	}
	/* End of name implementation code */

 static Scanner console = new Scanner(System.in); //Declare console for input

 
/* Varaibles controlling the tamagotchi's health */

public String name;
 
static double happiness = 100;

static double hunger = 0;

static double tiredness = 0;

static double age = 0;

static int chances = 0;
	
static String done = "done";

/* End of tamagotchi health */
 

 private String state;


 /*
 Start of sleepMenu code
1 	= happiness + 20
 	= tiredness - 20
2
	= tiredness - 40
3
	= happiness - 20
	= tiredness - 40
 */
 private void sleepMenu() {

	 int action;

	 System.out.println("        ZzzzZzzzZzzz/\\__/\\");
	 System.out.println(name + " is sleeping.  ( '= '  )S ");
	 System.out.println("                     Vv  Vv    ");
	

	 System.out.println("What would you like to do?");

	 System.out.println(" 1) Wake up " + name);

	 System.out.println(" 2) Leave " + name + " alone.");
	 
	 System.out.println(" 3) Shake " + name + " awake");

	 System.out.println(" 4) Quit program.");

	 action = console.nextInt();

	 

	 if(action == 1) {

		 System.out.println(name + " wakes up when you call him.");
		 
		 happiness += 20;
		 tiredness -= 20;

	 } else if (action == 2) {

		 System.out.println(name + " slept peacefully");

		 tiredness -= 40;

	 } else if (action == 3) {
		 
		 System.out.println(name + " glares at you with half asleep eyes");
		 
		 happiness -= 20;
		 tiredness -= 40;
		 
	 } else if (action == 4) {

		 state = done;

	 }

 }
/* End of sleepMenu code */

 
/*
Start of happyMenu code
1
	= happiness + 20
	= tiredness + 20
	= hunger + 20
2
	= happiness + 40
	= tiredness + 40
	= hunger + 20
3
	= hunger - 40
4
	= happiness - 20
	= hunger + 20
*/
  private void happyMenu() {

	  int action;

	  System.out.println(name + " is happy and looking at you.");

	  System.out.println("What would you like to do?");

	  System.out.println(" 1) Walk " + name);

	  System.out.println(" 2) Play ball with " + name);
	  
	  System.out.println(" 3) Feed " + name);
	  
	  System.out.println(" 4) Refuse to play");

	  System.out.println(" 5) Quit program.");

	  action = console.nextInt();

	  

	  if (action == 1) {

		  System.out.println(name + " runs around as you take them for a walk");

		  happiness += 20;
		  tiredness += 20;
		  hunger += 20;

	  } else if (action == 2) {

		  System.out.println("You played ball with " + name + " and the Tamagotchi got tired....");

		  happiness += 40;
		  tiredness += 40;
		  hunger += 20;

	  } else if (action == 3) {
		  
		  System.out.println("You fed " + name + ". he looked to be enjoying it");
		  
		  hunger -= 40;
		  
	  } else if (action == 4) {
		  
		  System.out.println(name + " stared up at you with sad eyes");
		  
		  happiness -= 20;
		  hunger += 20;
		  
	  } else if (action == 5) {

		  state =  done;
		  
	  }

}
/* End of happyMenu code */


/* 
Start hungryMenu code
1
	= hunger - 40
	= happiness + 20
2
	= hunger + 20
	= happiness - 20
*/
   private void hungryMenu() {
	   int action;
	   System.out.println(name + " is now starting to feeling hungry and needs feeding.");
	
           System.out.println("What would you like to do?");
	   
	   System.out.println(" 1) Feed " + name + " pet food/water.");
	   
	   System.out.println(" 2) Leave " + name + " alone as their tummy rumbles.");
	   
	   System.out.println(" 3) Quit program.");
	   
	   action = console.nextInt();
	   
	   if (action ==1) {
		   
		   System.out.println(name + " is feeling happier and less hungry after being fed pet food/water.");
		   
		   hunger -= 40;
		   happiness += 20;
		   
	   } else if (action == 2) {
		   
		   System.out.println(name + " is feeling more hungry after not being fed pet food/water.");
		   
	           hunger += 20;
	           happiness -= 20;
		   
	   } else if(action == 3) {
		   
		   state = done;
	   } //end of else if statement (hungry) state for Tamagotchi
   }
/* End of hungryMenu code */
		

/*
Start of tiredMenu code
1
	= happiness - 20
	= tiredness - 20
	= hunger + 20
2
	= tiredness + 100
	= hunger + 20
3
	= happiness + 20
	= tiredness + 20
	= hunger - 20
*/
   private void tiredMenu() {

	   int action;

	   System.out.println(name + " is looking tired and trying to keep its eyes open");

	   

	   System.out.println("What would you like to do?");

	   System.out.println(" 1) Poke " + name + ".");

	   System.out.println(" 2) Let " + name + " rest.");
	   
	   System.out.println(" 3) Give " + name + " something to eat.");

	   System.out.println(" 4) Quit program.");

	   action = console.nextInt();

	   

	   if (action == 1) {

		   System.out.println(name + " growls at you");

		   happiness -= 20;
		   tiredness -= 20;
		   hunger += 20;

	   } else if (action == 2) {

		   System.out.println(name + " slowly falls asleep");

		   tiredness += 100;
		   hunger += 20;

	   } else if (action == 3) {
		   
		   System.out.println(name + " quietly eats the food");
		   
		   happiness += 20;
		   hunger -= 20;
		   tiredness += 20;
		   
	   } else if (action == 4) {

		   state = done;

	   }
	   
	   
}
/* End of tiredMenu code */
	
	
/*
Start of angerMenu code
1
	= happiness + 40
	= hunger + 20
2
	= happiness - 40
	= hunger + 20
3
	= happiness + 40
	= hunger - 20
*/
	private void angerMenu() {
		
		int action;
		
		System.out.println(name + " is looking annoyed at you");
		
		
		System.out.println("What would you like to do?");
		
		System.out.println("1 ) Make up with " + name);
		
		System.out.println("2 ) Ignore " + name + ".");
		
		System.out.println("3 ) Give " + name + " a treat");
		
		System.out.println("4 ) Quit program");
		
		action = console.nextInt();
		
	if (action == 1) {
			
			System.out.println ("You made up with " + name + " and is happier");
			
			happiness += 40;
			hunger += 20;
			
		} else if (action == 2) {
			
			System.out.println ("You've ignored " + name + " and is annoyed");
			
			happiness -= 40;
			hunger += 20;
			
		} else if (action == 3) {
			
			System.out.println ("You gave " + name + " a treat and is now happier and less hungry");
			
			hunger -= 20;
			happiness += 40;
			
		}else if (action == 4) {
		
			state = done;
		}
	}
/* End of angerMenu code */
	
	
/*
Start of runAway code

Once this menu is reached isntead of changing the tamagotchi's health, instead the tamagotchi just runs away causing you to have to restart.
*/
	private void runAway() {
		
		System.out.println ("Your pet got too angry and has run away!");
		
		System.out.println ("Theres nothing you can do, try look after your pet better next time.");
		
		state = done;
	}
/* End of runAway code */
	

/*
Start of deathMenu code, should be changed, as the tamagotchi doesn't actually die anymore.
1
	= Your tamagotchi ends up running away
2
	= Your tamagotchi ends up running away
3
	= Your tamagotchi ends up running away
4
	= Your tamagotchi gives you another chance if you haven't been given one already
	= hunger - 40
	= happiness = 40
4 second time
	= Your tamagotchi ends up running away
*/
	private void deathMenu() {
		
		int action;
	
		System.out.println (name + " is really hungry");
		
		System.out.println ("What would you like to do?");
		
		System.out.println (" 1) Give it some food");
		
        	System.out.println (" 2) Ignore " + name);
		
		System.out.println (" 3) Just leave it there");
		
		System.out.println (" 4) Give it some food and apologise for not feeding it in so long");
			
			action = console.nextInt();
		
		if (action == 1) {
			
			System.out.println ("you feed " + name + ", before it quickly takes the food and runs off, leaving you all alone.");
			
			state = done;
			
		} else if (action == 2) {
			
			System.out.println ("you ignore " + name + " and turn your back on them. When you turn around " + name + " is no where to be seen.");
			
			state = done;
			
		} else if (action == 3) {
			
			System.out.println ("You leave " + name + " and you never see it again.");
			
			state = done;
			
		}else if (action == 4) {
			
			if (chances == 0) {
			
				System.out.println ( "You sit down and apologise to " + name + " while feeding it some food. It decides to give you one last chance.");
			
				hunger -= 40;
				happiness = 40;
			
			} else {
				
				System.out.println ( "Knowing that you failed to feed it even with your last chance, " + name + " leaves and is never seen again." );
			
				state = done;
			
			}
		}
			
		
		
			
	   }
/* End of deathMenu code */

	  
/*
Start if mainLoop code

This code contains code to calibrate the health of the tamagotchi, make the first menu always be the sleep menu,
show the current health of the tamagotchi, decide what state the tamagotchi is going to enter, increase the age.
*/
	
	  public void mainLoop() {
			  
		  	while (state!="done") {
		  		
				  if (age == 0) {
						sleepMenu();
						age += 1;
					  }	else {	  
						  // Start of value calibration
						  if (happiness > 100) {
							  happiness = 100;
						  } else if (happiness < 0) {
							  happiness = 0;
						  }
						  if (hunger > 100) {
							  hunger = 100;
						  } else if (hunger == 80) {
							  System.out.println(name + " is very hungry, if you don't feed him he might die.");
				  		  } else if (hunger < 0) {
							  hunger = 0;
						  }
						  if (tiredness > 100) {
							  tiredness = 100;
						  } else if (tiredness < 0) {
							  tiredness = 0;
						  } else {
							  state = "tired";
						  }
						  // End of value calibration
					  
					  	  // Start of health indicators
					  	  System.out.println("Age: " + age);
						  System.out.println(happiness + " " + "Happiness");
						  System.out.println(hunger +  " " + "Hunger");
						  System.out.println(tiredness + " " + "Tiredness");
					  	  // End of health indicators
						  
						  // Start of state change
						  if (tiredness == 100) {
							  state = "asleep";
						  } else if (tiredness >= 70) {
							  state = "tired";
						  } else if (hunger >= 100) {
							  deathMenu();
						  } else if (hunger == 80) {
							  state = "hungry";
				  		  } else if (happiness == 0) {
				  			  runAway(); 
						  } else if (happiness <= 60) {
							  state = "angry";
					  	  } else if (happiness > 60) {
							  state = "happy";  
					  	  }
						  // End of state change

			  	switch(state) {

			  

			  	case "asleep":
			  		
				  	age += 1;
				  	sleepMenu();
				  	break;

				  

			  	case "happy":
			  		
				  	age += 1;
				  	happyMenu();
				  	break;
			  
			  	case "hungry":
			  		
				  	age += 1;
					hungryMenu();
					break;

			  	case "tired":
			  		
				  	age += 1;
				  	tiredMenu();
				  	break;
				  	
			  	case "angry":
			  	
			  		age += 1;
			  		angerMenu();
			  		break;

			  	} //end switch statement.

		  	}  //end of while loop
				  
		  	}

		  	System.out.println("Deactivating the Tamagotchi");
		  }

}
