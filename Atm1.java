package atm1;

import java.util.Scanner;

import atm1.DepositException;
import atm1.WithDrawException;

public class Atm1 {

	public static int amountBalance=1000;
	public static int deposit(int a)
	{
		
		if(a>0)
		{
			amountBalance=amountBalance+a;
		  
			return a;
		}
		else
		{
			throw new  DepositException ();
		}
	}
	
	public static  int withDraw(int n)
	{
		
		if(n<=amountBalance)
		{
			amountBalance=amountBalance-n;
			return n;
			
			
		}
		else
		{
			throw new WithDrawException();
		}
	}
	public static  int showBalance()
	{
		return amountBalance;
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1 for deposit");
		System.out.println("enter 2 for withdraw");
		System.out.println("enter 3 for show balance");
		int i=sc.nextInt();
		int k=3;
		if(i==1)
		{
			System.out.println("enter the amount u want to deposit");
			i=deposit(sc.nextInt());
			System.out.println("the amount "+i+" is deposited");
			
		}
		else if(i==2)
		{
			System.out.println("enter the amount to withdrawn");
			i=withDraw(sc.nextInt());
			System.out.println("the amount is "+i+" withdrawn successfully");
		
		}
		else if(i==3)
		{
			System.out.println("the balance is : "+showBalance());
			
		}
		else
		{
		System.out.println(" Invalid Option");
		}
		
		
	}

}
