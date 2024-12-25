import java.util.Scanner;

public class program18 {

     public static int  SumofDigit(int iNo){

        int iCnt=0;
        int iDigit=0,iSum=0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo>0){
          
        iDigit=iNo%10;
        iSum=iSum+iDigit;
        iNo=iNo/10;   
        }

        return iSum;

    }
    public static void main(String[] args) {
        
        int iValue=0,iRet=0;

        Scanner Sobj=new Scanner(System.in);

        System.out.println("Enter The Number  ");
        iValue=Sobj.nextInt();

      iRet=SumofDigit(iValue);

      System.out.println("Sum of digits  are "+iRet);
}
}