       import java.util.Scanner;

public class ForLoopDemo2 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("ENTER HIGHER LIMIT");
        int higher=sc1.nextInt();

        System.out.println("ENTER LOWER LIMIT");
        int lower= sc1.nextInt();

         for (int a=higher;a>=lower;a--)
         {
             System.out.println(a);
         }




    }
}