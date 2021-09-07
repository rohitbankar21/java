import java.util.Scanner;
class ScannerDemo6
{
	public static void main(String[] args)
	{
		Scanner sc1=new Scanner(System.in);

		System.out.println("Enter name of product");
		String name=sc1.next();
		System.out.println("Enter product price");
		double price=sc1.nextDouble();
		System.out.println("Enter Discount percentage");
		int percent=sc1.nextInt();
		System.out.println("_________________________");
		double amt=calculateAmt(price,percent);
		System.out.println("Amount of product is "+amt);

		System.out.println("Product name is "+name);
		System.out.println("Prduct price is"+price);
		System.out.println("Product Discount Percentage is "+percent);
		System.out.println("=========================================");
		System.out.println("Amount of prodcut is "+amt);
	}
	static double calculateAmt(double price,int percent)
	{
		double amt=(price - (price*percent)/100);
		return amt;
	}
}