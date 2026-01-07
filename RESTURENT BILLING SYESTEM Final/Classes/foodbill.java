package Classes;
import java.util.Scanner;

public class foodbill extends custoinfo{
	
		public static Scanner Input=new Scanner(System.in);
		public int choose;
		public String size;
		public String again;
		public double total;
		
		public foodbill()
		{
			
		}
		
		public foodbill(int choose, String size, String again, double total, String name, int phonenumber)
		{
			super(name,phonenumber);
			this.choose=choose;
			this.size=size;
			this.again=again;
			this.total=total;
		}
		
		public void setChoose(int choose)
		{
			this.choose=choose;
		}
		
		public void setSize(String size)
		{
			this.size=size;
		}
		
		public void setAgain(String again)
		{
			this.again=again;
		}
		
		public void setTotal(double total)
		{
			this.total=total;
		}
		
		public int getChoose()
		{
			return choose;
		}
		
		public String getSize()
		{
			return size;
		}
		
		public String getAgain()
		{
			return again;
		}
		
		public double getTotal()
		{
			return total;
		}
		
		public static void menu()
		{
			System.out.println("********FOOD---MENU********");
			System.out.println("NO. FOOD NAME       PRICE  ");
			System.out.println("                           ");
			System.out.println("1.  PIZZA             500  ");
			System.out.println("2.  BURGER            350  ");
			System.out.println("3.  PASTA             200  ");
			System.out.println("4.  FRIED RICE        150  ");
			System.out.println("5.  DRINKS            100  ");
	
			
		}
		
		public void order()
		
		{
			System.out.println("CHOOSE FOOD NUMBER");
			choose=Input.nextInt();
			
			if (choose==1)
			{
				System.out.println("You ordered pizza");
				total=total+500;
				
				System.out.println("Do you want to order again?");
				System.out.println("Press Y for YES OR Press N for NO");
				again=Input.next();
				
				if(again.equalsIgnoreCase("Y"))
				{
					order();
				}
				else
				{
					System.out.println("Total price is:"+total);
				}
			}
			
				if (choose==2)
			{
				System.out.println("You ordered Burger");
				total=total+350;
				
				System.out.println("Do you want to order again?");
				System.out.println("Press Y for YES OR Press N for NO");
				again=Input.next();
				
				if(again.equalsIgnoreCase("Y"))
				{
					order();
				}
				else
				{
					System.out.println("Total price is:"+total);
				}
			}
				
				if (choose==3)
			{
				System.out.println("You ordered pasta");
				total=total+200;
				
				System.out.println("Do you want to order again?");
				System.out.println("Press Y for YES OR Press N for NO");
				again=Input.next();
				
				if(again.equalsIgnoreCase("Y"))
				{
					order();
				}
				else
				{
					System.out.println("Total price is:"+total);
				}
			}
				if (choose==4)
			{
				System.out.println("You ordered Fried rice");
				total=total+150;
				
				System.out.println("Do you want to order again?");
				System.out.println("Press Y for YES OR Press N for NO");
				again=Input.next();
				
				if(again.equalsIgnoreCase("Y"))
				{
					order();
				}
				else
				{
				System.out.println("Total price is:"+total);
				}
			}
			
			if (choose==5)
			{
				System.out.println("You ordered Drinks");
				total=total+100;
				
				System.out.println("Do you want to order again?");
				System.out.println("Press Y for YES OR Press N for NO");
				again=Input.next();
				
				if(again.equalsIgnoreCase("Y"))
				{
					order();
				}
				else
				{
					System.out.println("Total price is:"+total);
				}
			}
			
	
		}
}
		