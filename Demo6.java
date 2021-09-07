class Demo6
{
	public static void main(String[] args)
	{
		int x=30;
		int y=60;
		int data;
		data=x;
		x=y;
		y=data;
		System.out.println(x+"\t"+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println(x+"\t"+y);
	}
}