class BlockDemo2
{
	 static int k=20;
	 static int p=20;

	static 
	{
		k=40;
		p=25;
		System.out.println(p+k);
	}

	static
	{
		k=30;
		System.out.println(k+p);
	}

	public static void main(String[] args)
	{
		System.out.println("MAIN METHOD");
	}
}