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
			if(no%15==0)
			{
			System.out.println("NO IS DIVISIBLE BY FIVE and THREE");
			}
			else if(no%5==0)
			{
			System.out.println("NO IS DIVISIBLE BY FIVE");
			}
			else if(no%3==0)
			{
			System.out.println("NO IS DIVISIBLE BY THREE");
			}

			else
			{
			System.out.println("NOT DIVISIBLE BY FIVE AND THREE");
			}

	
		}
	}
}