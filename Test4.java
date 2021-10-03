import java.util.Scanner;
 class Test4
 {
 	public static void main(String[] args)
 	{
 		Scanner sc1=new Scanner(System.in);

 		System.out.println("Entr no");
 		double no=sc1.nextDouble();
 		if(no>0)
 		{
 			if(no%2==0)
 			{
 				System.out.println("Given no is postive and even");
 				no++;
 				System.out.println(no);
 			}
 			else
 			{
 				System.out.println("Given no is positive or odd");
 			}
 		}
 		else
 		{
 			System.out.println("You Enter negative number");

 		}
 	}

 }