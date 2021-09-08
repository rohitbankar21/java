import java.util.Scanner;

class ScannerDemo8
{
	public static void main(String[] args)
	{
	Scanner sc1=new Scanner(System.in);

	System.out.println("Enter Number");
	int n1=sc1.nextInt();
	int n2=sc1.nextInt();
	

	if(n1>n2)
	{
			System.out.println("no1 is greater than no2");
	}
	else if(n2>n1)
	{
			System.out.println("no2 is greater than no1");
	}
	else
	{
			System.out.println("both number are equal");
	}
	}
}