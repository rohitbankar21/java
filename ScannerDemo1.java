import java.util.Scanner;

class ScannerDemo1
{
	public static void main(String[] args)
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter your Name");
		String name=sc1.next();
		System.out.println("Welcome "+name);
	}
}