import java.util.Scanner;


public class ForLoopDemo3 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);

        System.out.println("Enter FIRST NUMBER");
        int lower= sc1.nextInt();

        System.out.println("ENTER SECOND NUMBER");
        int higher= sc1.nextInt();

        for (int a=lower;a<=higher;a++)
        {
            if(a%2==0)
            {
                System.out.println(a);
            }
        }

    }
}
