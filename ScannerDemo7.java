import java.util.Scanner;

class ScannerDemo7
{
	public static void main(String[] args)
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter total no of wins");
		double win=sc1.nextDouble();
		System.out.println("Enter total no of losses");
		double losses=sc1.nextDouble();
		System.out.println("Enter total no of draw");
		double draw=sc1.nextDouble();

		double reward=calRewards(win,losses,draw);
		System.out.println("Your reward is"+reward);
	}
	static double calRewards(double win,double lose,double draw)
	{
		double reward1=25*win;
		double reward2=25*lose;
		double reward3=25*draw;
		double total=reward1+reward2+reward3;
		return(total);

	}
}