import java.util.Scanner;

/**
 * @author Doğan Seyfi Şen - 2022
 */

public class Driver {
	
	public static void main(String[] args) {
		String userName, pass;
		Scanner inp = new Scanner(System.in);
		int right = 5;
		int balance = 5000;
		int select;
		
		while(right > 0) {
			System.out.print("Please enter your username: ");
			userName = inp.nextLine();
			System.out.print("Please enter your password: ");
			pass = inp.nextLine();
			
			if(userName.equals("Rick Sanchez") && pass.equals("morty14")) {
				System.out.println("\nWelcome to your bank account.");
				
				do {
					System.out.println("\nWhat would you like to do?");
					System.out.println(
							"1-Deposit money.\n"+ 
						    "2-Withdraw money.\n"+
							"3-Check balance.\n"+
						    "4-Exit.");
					System.out.print("\nPlease enter your choice: ");
					select = inp.nextInt();
				
				switch(select) {
					case 1:
						System.out.print("\nPlease enter amount of deposit: ");
						int amount = inp.nextInt();
						balance += amount;
						break;
					
					case 2:
						System.out.print("\nPlease enter amount of withdraw: ");
						amount = inp.nextInt();
							if(amount > balance) {
								System.out.println("\nAmount of withdraw is bigger than balance.");
							} else 
								balance -= amount;
						break;
					
					case 3:
						System.out.print("\nYour total balance: " + balance+ "$" + "\n");
						break;
						
					default:
						System.out.println("\nInvalid request.");
					}
				}	while(select != 4);	 
					break;
			} else {
				right--;
					System.out.println("\nWrong username or password. Please try again.");
           	     	if (right == 0) {
                     		System.out.println("\nYour bank account has suspended. Please contact customer services.");
                	} else 
                    		System.out.println("\nYour left right : " + right + "\n");
			}
		}
	}
}
