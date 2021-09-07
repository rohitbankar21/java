class MethodDemo8
{
	public static void main(String[] args)
	{
		double total;
		total=gstBill();
		System.out.println("GST BILL IS"+total);
	}
	static double gstBill()
	{
		double total;
		total=productBill(10,5);
		double gstBill=(0.06*total)+total;
		return gstBill;
	}
	static double productBill(int qty,double price)
	{
		double total;
		total=qty*price;
		return total;
	}
}