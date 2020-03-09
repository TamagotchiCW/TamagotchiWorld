package CW2;
import java.util.*;

public class Tamagotchi {
	
 static Scanner console = new Scanner(System.in); //Declare console for input
 
 static final int happy = 1;
 static final int asleep = 2;
 static final int hungry = 4;
 static final int done = 9;
 
 private int state;
 
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
		 state = happy;
	 } else if (action == 2) {
		 state = asleep;
	 } else if (action == 3) {
		 state = done;
	 }
 }
 
  private void happyMenu() {
	  int action;
	  System.out.println("The tamagotchi is happy and looking at you.");
	  
	  System.out.println("What would you like to do?");
	  System.out.println(" 1) Walk the Tamagotchi.");
	  System.out.println(" 2) play ball with the  Tamagotchi");
	  System.out.println(" 3) Quit program.");
	  action = console.nextInt();
	  
	  if (action == 1) {
		  state = happy;
	  } else if (action == 2) {
		  System.out.println("You played ball with Tamagotchi and the Tamagotchi got tired and went to sleep.");
		  state = asleep;
	  } else if(action == 3) {
		  state =  done;
	  } //end of else if statement
  } 
	
   private void hungryMenu() {
	   int action;
	   System.out.println("The tamagotchi is now beginning to start feeling hungry and needs feeding.");
	
           System.out.println("What would you like to do?");
	   System.out.println(" 1) Feed the Tamagotchi pet food/water.");
	   System.out.println(" 2) Let the Tamagotchi starve.");
	   System.out.println(" 3) Quit program.");
	   
	   if (action ==1) {
		   System.out.println("The Tamagotchi is now feeling happy being fed pet food/water".)
		   state = happy;
	   } else if (action == 2) {
		   System.out.println("The Tamagotchi is now feeling undernourished after not being fed pet food/water".)
	           state = sick;
	   } else if(action =- 3) {
		   state = done;
	   } //end of else if statement (hungry) state for Tamagotchi
   }
	
	
	  public void mainLoop() {
		  state = asleep;
		  
		  while (state!=done) {
			  switch(state) {
			  
			  case asleep:
				  sleepMenu();
				  break;
				  
			  case happy:
				  happyMenu();
				  break;
			  
				  case hungry:
					hungryMenu();
					break;
				
				  default:
					  System.out.println("Illegal state! This should never occur. state is: " +state);
					  break;
			  } //end switch statement.
		  }  //end of while loop
		  System.out.println("Deactivating the Tamagotchi");
	  }
  
 
}
