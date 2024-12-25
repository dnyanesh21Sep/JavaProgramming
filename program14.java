import java.util.Scanner;

public class program14 {
    

     public static int  CountDigit(int iNo){

        int iCnt=0;
        int iDigit=0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo>0){
          
            iDigit=iNo%10;
            iCnt++;

            iNo=iNo/10;   
        }

        return iCnt;

    }
    public static void main(String[] args) {
        
        int iValue=0,iRet=0;

        Scanner Sobj=new Scanner(System.in);

        System.out.println("Enter The Number  ");
        iValue=Sobj.nextInt();

      iRet=CountDigit(iValue);

      System.out.println("Number of digits are "+iRet);

    }
}
