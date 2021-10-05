public class Pattern4 {
    public static void main(String[] args) {
        int lines=3;
        int star=1;
        char ch='A';

        for(int row=1;row<=lines;row++){
            for(int col=1;col<=star;col++){
                System.out.print(ch);
            }
            System.out.println();
            star++;
            ch++;
        }
    }
}