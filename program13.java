import java.util.Scanner;

public class program13 {


    public static void  DisplayDigit(int iNo){

        int iCnt=0;
        int iDigit=0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo>0){
          
            iDigit=iNo%10;
            System.out.println(iDigit);
            iNo=iNo/10;   
        }
    }
    public static void main(String[] args) {
        
        int iValue=0,iRet=0;

        Scanner Sobj=new Scanner(System.in);

        System.out.println("Enter The Number  ");
        iValue=Sobj.nextInt();

        DisplayDigit(iValue);
    }
    
}
