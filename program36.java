import java.util.Scanner;

public class program36{
    
    public static void Pattern(int iRow) {
        for (int i = 1; i <= iRow; i++) {

            for (int j = 1; j <=iRow-1; j++) {

                System.out.print(" "+" ");
             }
 
            for (int j = 1; j <= iRow; j++) {

               System.out.print("*"+" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int iRow = 0, iCol = 0;

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter the Number of Rows: ");
        iRow = Sobj.nextInt();

       
        Pattern(iRow);
    }
}
