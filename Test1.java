class Logic
{
	static int a=10;
	int b=20;

	void display()
	{
		System.out.println("CASE CORRECT");
	}
	void function()
	{
		System.out.println("TEST METHOD");
	}
}
class Test1
{
	public static void main(String[] args)
	{
		Logic l1=new Logic();
		System.out.println("a value is "+l1.a);
		l1.display();

		Logic l2=new Logic();
		System.out.println("b value is"+l2.b);
		l2.display();

		System.out.println(l1);
		System.out.println(l2);

	}
}
