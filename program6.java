import java.util.Scanner;

public class program6 {

     public static int  CountFactors(int No1){

        int iCount=0;


        for(int i=1;i<=No1;i++){

           if(No1%i==0){

           iCount++;


           }
        }

        return iCount;
    }

    public static void main(String[] args) {

        int iValue=0;
        int iRet=0;


        System.out.println("Enter the number: ");
        Scanner sobj=new Scanner(System.in);
        iValue=sobj.nextInt();

       iRet= CountFactors(iValue);

       System.out.println("Tota Number of factors are: "+iRet);

    }
    
    
}
