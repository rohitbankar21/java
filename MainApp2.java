class Demo1
{
	int p=10;
	void display()
	{
		System.out.println("DISPLAY METHOD");
	}
}

class MainApp2
{
	public static void main(String[] args)
	{
		System.out.println("P VALUE IS"+new Demo1().p);
		new Demo1().display();
	}
}