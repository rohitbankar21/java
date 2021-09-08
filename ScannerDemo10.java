import java.util.Scanner;

class ScannerDemo10
{
	public static void main(String[] args)
	{
	Scanner sc1=new Scanner(System.in);

	System.out.println("Enter number");
	int no=sc1.nextInt();

	if(no%5==0)
	{
	  if(no%3==0)
	  {
	  	System.out.println("Divisible by 5 And 3");
	  }
	  else
	  {
	  	System.out.println("Divisible by 5");
	  }
	}
	else
	 {
		System.out.println("Not Divisible by 5");
	 }
	}
}

	