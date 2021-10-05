
public class Pattern6 {
    public static void main(String[] args) {
        int lines=4;
        int star=4;

        for(int row=1;row<=lines;row++){
            for(int col=1;col<=star;col++){
                System.out.print(col);

            }
            System.out.println();
            star--;
        }
    }
}