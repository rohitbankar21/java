public class Pattern1 {
    public static void main(String[] args) {
        int lines=3;
        int star=3;

        for(int row=1;row<=lines;row++)
        {
            for(int col=1;col<=star;col++){
                System.out.println("*");
            }
            System.out.println();
            star--;
        }
    }
}