class MethodDemo4
{
	public static void main(String[] args)
	{
		min(30);
		sec(300);
	}
	static void min(double min)
	{
		double r;
		r=min*60;
		System.out.println(r);
	}
	static void sec(double sec)
	{
		double result;
		result=sec/60;
		System.out.println(result);
	}
}