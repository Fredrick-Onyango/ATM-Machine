
//Simple ATM Machine
/**
 * @author Fredrick
 *
 */

package atm;
//import scanner class
import java.util.Scanner;

public class ATM{
//private static final String String = null;
//Declare scanner 	 
  private static Scanner in; 
// initial balance is set to 0
  private static float balance=150000; 
  private static float totalwithdraw=0; 
//Declare another transaction
  private static int anotherTransaction;
  //private static String anotherTransaction1;
  private static int maxdepositfrequency=4;
  private static int maxwithdrawfrequency=3;
  private static int depositfrequency=0;
  private static int withdrawfrequency=0;
  //private static int totaldepositfrequency=0;
  private static int maxdepositpertransaction=40000;
  private static int maxwithdrawpertransaction=20000;
  private static int maxdepositperday=150000;
  private static int maxwithdrawperday=50000;
  public static void main(String args[]){
      in = new Scanner(System.in);

      // call our transaction method here 
      transaction();
  }

  private static void transaction(){
      // here is where the transactions take place

      int choice; 

      System.out.println("Enter Menu option");
      System.out.println("1. Balance");
      System.out.println("2. Deposit");
      System.out.println("3. Withdraw");
      System.out.println("4. Quit");
      

      choice = in.nextInt();

      switch(choice){
        // Option 1 is used to check balance 
          case 1:
             
              System.out.println("BALANCE "+balance+"\n");

              //Option to go back to menu
              System.out.println("Type “8” and press enter to go back to main menu or “9” to quit\n");
              anotherTransaction = in.nextInt();
		
			if(anotherTransaction == 8){
                  transaction(); // call transaction method
              } else if(anotherTransaction == 9){
                  System.out.println("Thanks for using our bank. Good Bye!");
              } else {
                  System.out.println("Invalid choice\n\n");
                 anotherTransaction();
              }
              
             //anotherTransaction(); 
          break;
              
         // option 2 is used to deposit
          case 2:
              
              float deposit; 
              System.out.println("Please enter amount you would wish to deposit: ");
              deposit = in.nextFloat();
              //validate maximum deposit per transaction 
			  if(deposit > maxdepositpertransaction){
				 System.out.println("You have exceeded maximum deposit of 40,000 per transaction.\n\n");
				  deposit = in.nextFloat();
	              //Option to go back to menu
	              System.out.println("Type “8” and press enter to go back to main menu or “9” to quit\n");
	              anotherTransaction = in.nextInt();
			
				if(anotherTransaction == 8){
	                  transaction(); // call transaction method
	              } else if(anotherTransaction == 9){
	                  System.out.println("Thanks for using our bank. Good Bye!");
	              } else {
	                  System.out.println("Invalid choice\n\n");
	                 anotherTransaction();
	              }
	              
	             //anotherTransaction(); 
	          break; 
			  }
			  // update balance 
			  //validate maximum deposit per day
			  balance = deposit + balance;
			  if(balance > maxdepositperday){
				 System.out.println("You have exceeded maximum deposit per day\n\n");
				   balance = balance-deposit;
				   deposit = in.nextFloat();
		              //Option to go back to menu
		              System.out.println("Type “8” and press enter to go back to main menu or “9” to quit\n");
		              anotherTransaction = in.nextInt();
				
					if(anotherTransaction == 8){
		                  transaction(); // call transaction method
		              } else if(anotherTransaction == 9){
		                  System.out.println("Thanks for using our bank. Good Bye!");
		              } else {
		                  System.out.println("Invalid choice\n\n");
		                 anotherTransaction();
		              }
		              
		             //anotherTransaction(); 
		          break;
			  }
			  //validate maximum deposit frequency
			  depositfrequency=depositfrequency + 1;
			  if(depositfrequency > maxdepositfrequency )
				  {
				   System.out.println("You have exceeded maximum deposit frequency of 4\n\n");
		              //Option to go back to menu
		              System.out.println("Type “8” and press enter to go back to main menu or “9” to quit\n");
		              anotherTransaction = in.nextInt();
				
					if(anotherTransaction == 8){
		                  transaction(); // call transaction method
		              } else if(anotherTransaction == 9){
		                  System.out.println("Thanks for using our bank. Good Bye!");
		              } else {
		                  System.out.println("Invalid choice\n\n");
		                 anotherTransaction();
		              }
		              
		             //anotherTransaction(); 
		          break;
				   
				  }
              System.out.println("You have deposited "+deposit+" new balance is "+balance+"\n");
              
              //Option to go back to menu
              System.out.println("Type “8” and press enter to go back to main menu or “9” to quit\n");
              anotherTransaction = in.nextInt();
		
			if(anotherTransaction == 8){
                  transaction(); // call transaction method
              } else if(anotherTransaction == 9){
                  System.out.println("Thanks for using our bank. Good Bye!");
              } else {
                  System.out.println("Invalid choice\n\n");
                 anotherTransaction();
              }
              
             //anotherTransaction(); 
  
          break; 
          //Option to Withdrawal
          case 3:
          	float amount; 
              System.out.println("Please enter amount to withdraw: "); 
              amount = in.nextFloat();
              //validate maximum amount withdrawal against balance 
              if(amount > balance || amount == 0){
                  System.out.println("You have insufficient funds\n\n"); 
				  
                  
                //Option to go back to menu
               // ask if they want another transaction
                  System.out.println("Type “8” and press enter to go back to main menu or “9” to quit\n");
                  anotherTransaction = in.nextInt();
    		
    			if(anotherTransaction == 1){
                      transaction(); // call transaction method
                  } else if(anotherTransaction == 2){
                      System.out.println("Thanks for using our bank. Good Bye!");
                  } else {
                      System.out.println("Invalid choice\n\n");
                     anotherTransaction();
                  }
                  
                 //anotherTransaction(); 
              break;
              } else {
                  // they have some cash
                  // update balance 
            	  //validate maximum withdrawal per transaction
				  if(amount > maxwithdrawpertransaction){
					 System.out.println("You have exceeded maximum withdraw of 20,000 per transaction.\n\n");
					 amount = in.nextFloat();
		                //Option to go back to menu
		               // ask if they want another transaction
		                  System.out.println("Type “8” and press enter to go back to main menu or “9” to quit\n");
		                  anotherTransaction = in.nextInt();
		    		
		    			if(anotherTransaction == 8){
		                      transaction(); // call transaction method
		                  } else if(anotherTransaction == 9){
		                      System.out.println("Thanks for using our bank. Good Bye!");
		                  } else {
		                      System.out.println("Invalid choice\n\n");
		                     anotherTransaction();
		                  }
		                  
		                 //anotherTransaction(); 
		              break; 
			      }
				//validate maximum withdrawal per day
				  totalwithdraw=totalwithdraw + amount;
				  if(totalwithdraw > maxwithdrawperday){
					  System.out.println("You have exceeded maximum withdraw per day\n\n");
					  totalwithdraw=totalwithdraw - amount;
					  amount = in.nextFloat();
		                //Option to go back to menu
		               // ask if they want another transaction
		                  System.out.println("Type “8” and press enter to go back to main menu or “9” to quit\n");
		                  anotherTransaction = in.nextInt();
		    		
		    			if(anotherTransaction == 8){
		                      transaction(); // call transaction method
		                  } else if(anotherTransaction == 9){
		                      System.out.println("Thanks for using our bank. Good Bye!");
		                  } else {
		                      System.out.println("Invalid choice\n\n");
		                     anotherTransaction();
		                  }
		                  
		                 //anotherTransaction(); 
		              break;
			      } 
				//validate maximum frequency
                   withdrawfrequency=withdrawfrequency + 1;
			       if(withdrawfrequency > maxwithdrawfrequency )
					  {
					   System.out.println("You have exceeded maximum withdraw frequency of 3\n\n");
		                //Option to go back to menu
		               // ask if they want another transaction
		                  System.out.println("Type “8” and press enter to go back to main menu or “9” to quit\n");
		                  anotherTransaction = in.nextInt();
		    		
		    			if(anotherTransaction == 8){
		                      transaction(); // call transaction method
		                  } else if(anotherTransaction == 9){
		                      System.out.println("Thanks for using our bank. Good Bye!");
		                  } else {
		                      System.out.println("Invalid choice\n\n");
		                     anotherTransaction();
		                  }
		                  
		                 //anotherTransaction(); 
		              break;
					  }				  
                  balance = balance - amount; 
                  System.out.println("You have withdrawn "+amount+" and your new balance is "+balance+"\n");
                  
                  //Option to go back to menu
                  System.out.println("Type “8” and press enter to go back to main menu or “9” to quit\n");
                  anotherTransaction = in.nextInt();
    		
    			if(anotherTransaction == 8){
                      transaction(); // call transaction method
                  } else if(anotherTransaction == 9){
                      System.out.println("Thanks for using our bank. Good Bye!");
                  } else {
                      System.out.println("Invalid choice\n\n");
                     anotherTransaction();
                  }
                  
                 //anotherTransaction(); 
              break;
              }
          //Option to quit the application
          case 4:
              System.out.print("\nThanks for using our bank. Good-Bye!");
              System.exit(0);
              break;

      }

  }

  private static void anotherTransaction(){
      System.out.println("Do you want to quit?\n\nPress 8 for NO\n Press 9 for YES");
      anotherTransaction = in.nextInt();
      if(anotherTransaction == 8){
          transaction(); // call transaction method
      } else if(anotherTransaction == 9){
          System.out.println("Thanks for using our bank. Good Bye!");
      } else {
          System.out.println("Invalid choice\n\n");
          anotherTransaction();
      }
  }
}

