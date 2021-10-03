import java.util.Scanner;
class TernaryDemo
{
	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);

		System.out.println("ENTER NUMBER");
		int no=sc1.nextInt();

		String result=(no%2==0)?"EVEN":"ODD";
		System.out.println("NO IS \n" +result);
		
	}
}