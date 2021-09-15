class Master1
{
	static int k=20;
	static void test()
	{
		System.out.println("TEST METHOD");
	}
}

class MainApp1
{
	public static void main(String[] args)
	{
		System.out.println("K VALUE IS"+Master1.k);
		Master1.test();
	}
}