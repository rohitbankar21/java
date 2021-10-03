import java.util.Scanner;

class billAmount
{
	void bill(int qty,double cost,double per)
	{
		double amount=(qty*cost);
		double totalBill=(amount+(amount*per/100));
		System.out.println("Your bill amount is "+totalBill);
	}

}
class Test2
{
	public static void main(String[] args)
	{
		billAmount b1=new billAmount();
		Scanner sc1=new Scanner(System.in);

			System.out.println("Enter Dish Qty");
			int qty=sc1.nextInt();

			System.out.println("Enter cost per dish");
			double cost=sc1.nextDouble();

			System.out.println("GST PERCENTAGE");
			double per=sc1.nextDouble();

			b1.bill(qty,cost,per);




	}
}