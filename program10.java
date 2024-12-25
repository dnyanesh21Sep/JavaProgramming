
import java.util.Scanner;

public class program10{
 
     public static boolean  CheeckprimeNumber(int No1){

        int iCount=0;
        boolean bFlag=false;
        int No=0;

        if(No1<0){               //Updator
         
            No1=-No1;

        }
        for(int i=2;i<=No1/2;i++){

           if(No1%i==0){

          iCount++;


           }
        }

        if(iCount==0){

            bFlag=true;

        }
        else{

            bFlag=false;

        }

        return bFlag;
    }

    public static void main(String[] args) {

        int iValue=0;
        boolean bRet=false;


        System.out.println("Enter the number: ");
        Scanner sobj=new Scanner(System.in);
        iValue=sobj.nextInt();

       bRet= CheeckprimeNumber(iValue);

       if(bRet==true){

        System.out.println("Given Number No a prime Number : ");
       }
       else{

        System.out.println("Given Number is Not a prime  Number : ");
       }
    }  
}