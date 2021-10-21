public class Pattern10 {
    public static void main(String[] args) {

        int lines=5;
        int star=5;
        int mid=(lines+1)/2;

        for(int row=1;row<=lines;row++){
            for(int col=1;col<=lines;col++){
                if(row==col){
                    System.out.print(col);
                }
                else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}