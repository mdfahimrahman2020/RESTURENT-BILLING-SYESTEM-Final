package Classes;
import java.util.Scanner;

public class custoinfo {
	
	public static Scanner Input= new Scanner (System.in);
		
	public String name;
	public int phonenumber;
	
		
	public custoinfo()
	{
		
	}
	
	public custoinfo( String name, int phonenumber)
	{
		this.name=name;
		this.phonenumber=phonenumber;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setPhonenumber( int phonenumber)
	{
		this.phonenumber=phonenumber;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getPhoneNumber()
	{
		return phonenumber;
	}
	
	public void showCustoinfo()
	{
		System.out.println("Enter Customer Name:");
		name=Input.next();
		
		System.out.println("Enter Customer Phonenumber:");
		phonenumber=Input.nextInt();
	}
}