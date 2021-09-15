class Product
{
	int productId;
	String productName;

	void acceptDetails(int id,String name)
	{
		productId=id;
		productName=name;
	}

	void displayDetails()
	{
		System.out.println("PRODUCT ID IS "+productId);
		System.out.println("PRODUCT NAME IS "+productName);
	}
}
class MainApp6
{
	public static void main(String[] args)
	{
		Product p1=new Product();
		p1.acceptDetails(201,"MOBILE");
		p1.acceptDetails(201,"AC");
		p1.displayDetails();

		Product p2=new Product();
		p2.acceptDetails(202,"LAPTOP");
		p2.displayDetails();

	}
}