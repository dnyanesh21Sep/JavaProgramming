import java.util.Scanner;

public class program35 {
    
    public static void Pattern(int iRow, int iCol) {
        for (int i = 1; i <= iRow; i++) {
            for (int j = 1; j <= i-1; j++) {

               System.out.print(" "+" ");
            }

            for(int j=1;j<=i;j++){

                System.out.print(i);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int iRow = 0, iCol = 0;

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter the Number of Rows: ");
        iRow = Sobj.nextInt();

        System.out.println("Enter the Number of Columns: ");
        iCol = Sobj.nextInt();

        Pattern(iRow, iCol);
    }
}
