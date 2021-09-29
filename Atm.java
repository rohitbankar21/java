import java.util.Scanner;

class Atm
{
	static double accountBalance=5000.25;
	static int pin;
	static Scanner sc1=new Scanner(System.in);

	static
	{
		System.out.println("PLEASE SELECT LANGUAGE");
		System.out.println("\n 1:ENGLISH");
		System.out.println("\n 2:HINDI");
		System.out.println("\n 3:MARATHI");
		int language=sc1.nextInt();

		if(language==1)
		{
			System.out.println("\n Thanks for Choosing ENglish");

		}
		else if(language==2)
		{
			System.out.println("\n Hindi ke liye shukriya");
		}
		else if(language==3)
		{
			System.out.println("\n Marathi sathi Dhnyawad");
		}
		else
		{
			System.out.println("INVALID LANGUAGE");
			System.exit(0);
		}
		
	}
	static
	{
		System.out.println("ENTER YOUR PIN");
		pin=sc1.nextInt();
	}
	public static void main(String[] args)
	{
		if(pin==4569)
		{
			System.out.println("SELECT MODE OF OPERATION");
			System.out.println("1:WITHDRAW");
			System.out.println("2:CHECK BALANCE");
			int choice=sc1.nextInt();


			if(choice==1)
			{
				System.out.println("ENTER AMOUNT");
				double amt=sc1.nextDouble();
				withdraw(amt);
			}
			else if(choice==2)
			{
				checkBalance();
			}
			else
			{
				System.out.println("INVALID CHOICE");
			}
		}
		else
		{
			System.out.println("INVALID PIN");
		}

	}
	static void withdraw(double amt)
	{
		if(amt<accountBalance)
		{	
			accountBalance=accountBalance-amt;
			System.out.println(amt+"  amount debited successfully!!");
		}
		else
		{
			System.out.println(" \n PLEASE ENTER VALID AMOUNT");

		}
	}
	static void checkBalance()
	{
		System.out.println("\n AMOUNT BALANCE IS "+accountBalance);
	}	
}