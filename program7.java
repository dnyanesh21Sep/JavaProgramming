
    /*
    Accept number as No
    Search all its factors
    Perform addition of all the factors
    If adddition is same as No
    then Display as No is perfect number
    otherwise Display as No is noyt perfect number
*/

import java.util.Scanner;

public class program7 {
    
    
     public static boolean  PerfectNumber(int No1){

        int iSum=0;
        boolean bFlag=false;


        for(int i=1;i<=No1/2;i++){

           if(No1%i==0){

          iSum=iSum+i;

           }
        }

        if(iSum==No1){

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

       bRet= PerfectNumber(iValue);

       if(bRet==true){

        System.out.println("Given Number is a perfect Number : ");
       }
       else{

        System.out.println("Given Number is Not a perfect Number : ");
       }

    

    }  
}
