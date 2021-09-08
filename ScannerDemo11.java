import java.util.Scanner;

class ScannerDemo11
{
	public static void main(String[] args)
	{
		Scanner sc1=new Scanner(System.in);

		System.out.println("Enter Number");
		int no=sc1.nextInt();
		if(no>0)
		{
			System.out.println("NO IS POSITIVE AS WELL AS EVEN");
		}
		else
		{
			System.out.println("NO IS POSITIVE AS WELL AS ODD");
		}
		else 
		{
			System.out.println("GIVEN NO IS NEGATIVE");
		}
	}
}
