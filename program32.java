import java.util.Scanner;

public class program32 {

    public static void Pattern(int iRow,int iCol){

        int middle=0;
        middle=iRow/2+1;

        int i=0,j=0,a=1;
        for(i=1;i<=iRow;i++){

            for(j=1;j<=iCol;j++){
              
                if(i==middle || j==middle){
                    System.out.print(" * ");
                }
                else{
                 
                    System.out.print(" ");

                }
               
            }
        
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        int iRow=0,iCol=0;

        Scanner Sobj=new Scanner(System.in);

        System.out.println("Enter the Number of Rows : ");

        iRow=Sobj.nextInt();

        System.out.println("Enter the Number of Col : ");
        iCol=Sobj.nextInt();

        Pattern(iRow, iCol);
    
}
}