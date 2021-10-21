
import java.util.Scanner;
public class StringDemo8 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter Name");
        String name=sc1.nextLine();
        String username=name.trim();
        if(!username.isEmpty()){
            System.out.println("Enter Email");
            String email=sc1.next();
            if(email.contains("@") && email.contains(".")){
                System.out.println("Enter Password");
                String password=sc1.next();
                if(password.length()>=6){
                    System.out.println("Confirm Password");
                    String confirm=sc1.next();
                    if(password.equals(confirm)){
                        System.out.println("Welcome "+username);
                    }else {
                        System.out.println("PASSWORD NOT MATCHED");
                    }
                }else{
                    System.out.println("MINIMUM 6 CHARS ARE REQUIRED");
                }
            }else{
                System.out.println("INVALID EMAIL");
            }

        }else{
            System.out.println("INVALID NAME");
        }
    }
}
