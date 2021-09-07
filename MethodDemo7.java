class MethodDemo7
{
	public static void main(String[] args)
	{
		areaofcircle();
	}
	static double addition(double a,double b)
	{
		double result;
		result=a+b;
		System.out.println("ADDITION IS="+result);
		return result;
	}
	static double areaofcircle()
	{
		double rad=addition(5,2);
		double area=3.14*rad*rad;
		System.out.println("AREA OF CIRCLE="+area);
		return area;
	}
	
}