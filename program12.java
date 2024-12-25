import java.util.Scanner;

public class program12 {

    public static int Factorial(int No){

        int iCnt=0,iFact=1;

        for(iCnt=No;iCnt>=1;iCnt--){

            iFact=iFact*iCnt;

        }

      return  iFact;
    }

    public static void main(String[] args) {
        
        int iValue=0,iRet=0;

        Scanner Sobj=new Scanner(System.in);

        System.out.println("Enter The Number  ");
        iValue=Sobj.nextInt();

        iRet=Factorial(iValue);

        System.out.println("Factorial of "+ iValue +"Number is "+iRet);


    }    
}
