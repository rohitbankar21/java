public class Pattern12 {
    public static void main(String[] args) {

        int lines=5;
        int star=5;

        for(int row=1;row<=lines;row++){
            for (int col=1;col<=lines;col++){
                if(row==1 || row==lines || col==1 || col==star){
                    System.out.print("*  ");
                }
                else{
                    System.out.print("   ");

                }

            }
            System.out.println();

        }
    }
}