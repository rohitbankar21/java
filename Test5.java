import java.util.Scanner;
class Test5
{
	public static void main(String[] args)
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("ENTER AMOUNT");
		double amt=sc1.nextDouble();
		Test5 t=new Test5();
		double result=t.si(amt);
		System.out.println("Simple interest is"+result);

	}
	double si(double pr)
	{
		double result=(pr*5*3)/100;
		return result;
	}
}