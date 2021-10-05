
public class Pattern7 {
    public static void main(String[] args) {
        int lines=4;
        int star=1;

        for(int row=1;row<=lines;row++){
            for(int col=1;col<=star;col++){
                if(col==1 || col==star){
                    System.out.print('A');
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
            star++;
        }

    }
    }