import java.util.Scanner;

public class program5 {

     public static int  displayFactors(int No1){

        int iSum=0;


        for(int i=1;i<=No1;i++){

           if(No1%i==0){

            iSum=iSum+i;

           }
        }

        return iSum;
    }

    public static void main(String[] args) {

        int iValue=0;
        int iRet=0;


        System.out.println("Enter the number: ");
        Scanner sobj=new Scanner(System.in);
        iValue=sobj.nextInt();

       iRet= displayFactors(iValue);

       System.out.println("Sum of factors are: "+iRet);

    }
    
}
