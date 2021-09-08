import java.util.Scanner;
class ScannerDemo9
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radius of circle");
		double rad=sc.nextDouble();
		
		double result1=areaOfCircle(rad);
		double result2=CercumferenceOfCircle(rad);

		System.out.println("Area of cicle is"+result1);
		System.out.println("Area of cicle is"+result2);
		System.out.println("Enter your choice");
		double choice=sc.nextDouble();
		if(choice==1)
		{
			areaOfCircle(rad);
		}
		else if(choice==2)
		{
			CercumferenceOfCircle(rad);
		}
		else
		{
			System.out.println("Please select valid mode");
		}

	}	
	static double areaOfCircle(double rad)
	{

		double area=(3.14*rad*rad);
		return area;
	}
	static double CercumferenceOfCircle(double rad)
	{

		double cOfC=(2*3.14*rad);
		return cOfC;
	}
}
	
	