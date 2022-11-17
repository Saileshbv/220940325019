import java.util.*;
import java.lang.*;
import java.io.*;
class Bankacc
{
	int accno;
	static double bal;
	
	Bankacc(int accno,double bal)
	{
	this.accno=accno;
	this.bal=bal;
	}
	 double withdraw(double amt)
	{
		bal=bal-amt;
		 return bal;
	}
	double deposit(double amt)
	{	
		bal=bal+amt;
		return bal;
	}
	void show()
	{
		System.out.println("Account Number: "+accno+"Balance : "+bal);

	}
	public static void main(String args[])
	{
		Bankacc b=new Bankacc(123456,10000);
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter the Amount:");
		double a=sc.nextDouble();
		try
		{
		if(a>b.bal)
		{
		throw new ArithmeticException("Enter amount is more than balance amount");
		}
		else{
		System.out.println("The New balance after withdrawl: "+b.withdraw(a));
		b.show();
		System.out.println("The New balance after deposit: "+b.deposit(a));
		b.show();
		}
		}
		catch(ArithmeticException e)
		{
		System.out.println("The Arithemetic Exception"+e);
		}	
		finally
		{
		System.out.println("Program End here.");	
		}
	}	
	

}