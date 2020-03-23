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

static double tiredness = 0;

static double age = 0;

static int chances = 0;
	
static String done = "done";

/* End of tamagotchi health */
 

 private String state;


 
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

	  } //end of else if statement


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
	
	
	private void runAway() {
		
		System.out.println ("Your pet got too angry and has run away!");
		
		System.out.println ("Theres nothing you can do, try look after your pet better next time.");
		
		state = done;
	}

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

	   

	  /* Code to change later */
	
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
						  System.out.println(happiness + " " + "Happiness");
						  System.out.println(hunger +  " " + "Hunger");
						  System.out.println(tiredness + " " + "Tiredness");
						  
						  
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
