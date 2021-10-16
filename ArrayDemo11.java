import java.util.Scanner;
public class ArrayDemo11 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("ENTER TOTAL NO OF ITEMS");
        int count=sc1.nextInt();
        double[] amounts=new double[count];
        System.out.println("ENTER UNIT PRICE");
        for (int a=0;a<count;a++){
            amounts[a]=sc1.nextDouble();
        }
        finalCalculation(amounts);
    }
    static double[] gstCalculation(double[] amounts) {

        double[] gstArray = new double[amounts.length];

        for (int a = 0; a < amounts.length; a++) {
            if (amounts[a] < 500) {
                gstArray[a] = amounts[a] * 0.05;
            } else {
                gstArray[a] = amounts[a] * 0.01;
            }
        }
        return gstArray;

    }
    static void finalCalculation(double[] amounts){

        double[] gstAmounts=gstCalculation(amounts);

        double[] finalAmounts=new double[amounts.length];

        for(int a=0;a<amounts.length;a++){
            finalAmounts[a]=amounts[a]+gstAmounts[a];
        }

        double sumOfOriginalAmounts=0.0;
        double sumOfGstAmounts=0.0;
        double sumOfFinalAmounts=0.0;
        for (int a=0;a<amounts.length;a++){
            sumOfFinalAmounts+=amounts[a];
            sumOfGstAmounts+=gstAmounts[a];
            sumOfOriginalAmounts+=finalAmounts[a];
        }
        System.out.println("ORG.AMT\tGST.AMT\tFINAL.AMT");
        System.out.println("===================================================");
        for (int a=0;a<amounts.length;a++){
            System.out.println(amounts[a]+"\t" +gstAmounts[a]+"\t"  +finalAmounts[a]);
        }
        System.out.println("=============================================");
        System.out.println(sumOfOriginalAmounts+"\t" +sumOfGstAmounts+ "\t"  +sumOfFinalAmounts);

    }
}
