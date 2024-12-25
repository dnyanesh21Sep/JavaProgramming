import java.util.Scanner;

public class program21 {
    
     public static int AddDigitSumandReverse(int iNo){

        int iCnt=iNo,iRev=0;
        int iDigit=0,iSum=0;
        int TotaSum=0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo>0){

            iDigit=iNo%10;
            iRev=(iRev*10)+iDigit;
        
            iNo=iNo/10;
        }
        TotaSum=iCnt+iRev;

        return TotaSum;
    }
    public static void main(String[] args) {
        
        int iValue=0,iRet=0;

        Scanner Sobj=new Scanner(System.in);

        System.out.println("Enter The Number  ");
        iValue=Sobj.nextInt();

       iRet=AddDigitSumandReverse(iValue);

       System.out.println("Tota Sum  is "+iRet);

    }
}
