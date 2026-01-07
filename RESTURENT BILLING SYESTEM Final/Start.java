import java.util.Scanner;
import Classes.*;

public class Start{ 
    
	 public static void main(String[] args){
         
		Scanner input = new Scanner(System.in);
		String Username;
		String Password;

		Username = "JAVA";
		Password = "1111";
		
		Scanner input1 = new Scanner(System.in);
		System.out.println("");
		System.out.println("******WELCOME TO FOOD BILLING SYSTEM******");
		System.out.print(" Please Enter Your Username : ");
		String username = input1.next();

		Scanner input2 = new Scanner(System.in);
		System.out.print("Please Enter Your Password : ");
		String password = input2.next();


		if (username.equals(Username) && password.equals(Password)) 
		{
			System.out.println("# Your Access Granted! Welcome To The System ! #");
			System.out.println();
		
		foodbill of1=new foodbill();
		boolean check=true;
		while (check){
			System.out.println("please choose a option");
			System.out.println("1. FoodBill");
		    System.out.println("2. Exit");
			
			System.out.print("Your Chosen Option: ");
				int option = input.nextInt();
				
				switch(option){
					case 1:
					
						System.out.println("You have choosen FoodBill");
						{
		  
		                  foodbill Of1=new foodbill();
         
                          foodbill.menu();
                          Of1.showCustoinfo();
                          Of1.order();
  
	                    }
		
						
						
						
					case 2:

						System.out.println("*****You have choosen to exit*****");
						check = false;
						System.exit(0);
						break;

					default:

						System.out.println("*****Invalid Option*****");
						break;
				}
			}

		
	
	
		}else if (username.equals(Username)) {
			System.out.println("*****Invalid Password!*****");
			System.out.println("");
			System.out.println("     YOU CAN NOT ACCESS THIS SYSTEM");
		} else if (password.equals(Password)) {
			System.out.println("*****Invalid Username!*****");
			System.out.println("");
			System.out.println("     YOU CAN NOT ACCESS THIS SYSTEM");
		} else {
			System.out.println("*****Invalid Username & Password!*****");
			System.out.println("");
			System.out.println("     YOU CAN NOT ACCESS THIS SYSTEM");
		}
	 }
}