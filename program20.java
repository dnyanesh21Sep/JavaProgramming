import java.util.Scanner;

public class program20{

     public static int  Reverse(int iNo){

        int iCnt=0,iRev=0;
        int iDigit=0,iSum=0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }
/* 
        while(iNo>0){
          
        iDigit=iNo%10;
        System.out.print(iDigit);
        iNo=iNo/10;   
        }

        */
        while(iNo>0){

            iDigit=iNo%10;
            iRev=(iRev*10)+iDigit;
            iNo=iNo/10;

        }

        return iRev;
        

    }
    public static void main(String[] args) {
        
        int iValue=0,iRet=0;

        Scanner Sobj=new Scanner(System.in);

        System.out.println("Enter The Number  ");
        iValue=Sobj.nextInt();

       iRet= Reverse(iValue);

       System.out.println("Reverse Number is "+iRet);

}
}