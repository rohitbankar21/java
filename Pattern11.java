public class Pattern11 {
    public static void main(String[] args) {

        int lines=5;
        int star=1;
        int mid=(lines+1)/2;

        for(int row=1;row<=lines;row++){
            for(int col=1;col<=lines;col++){
                if(row==mid || col==mid)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}