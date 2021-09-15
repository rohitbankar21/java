import java.util.Scanner;

class Circle
{
	static double pi=3.14;
	void area(double rad)
	{
		double result=pi*rad*rad;
		System.out.println("AREA OF CIRCLE IS "+result);
	}
	void circumference(double rad)
	{
		double result=2*pi*rad;
		System.out.println("CIRCUMFERENCE OF CIRCLE IS "+result);
	}
}

class MainApp3
{
	public static void main(String[] args)
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter Radius");
		double rad=sc1.nextDouble();
		System.out.println("1.AREA OF CIRCLE");
		System.out.println("2.CIRCUMFERENCE OF CIRCLE");
		int choice=sc1.nextInt();

		if(choice==1)
		{
			new Circle().area(rad);
		}
		else if(choice==2)
		{
			new Circle().circumference(rad);
		}
		else
		{
			System.out.println("INVALID CHOICE");
		}
	}
}