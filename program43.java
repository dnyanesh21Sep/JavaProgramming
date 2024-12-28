
import java.util.Scanner;

public class program43{

    public static int DisplayEven(int Arr[]){

        int iSum=0,iCnt=0;

        for(int i=0;i<Arr.length;i++){

           if(Arr[i]%2==0){
            
            System.out.println("Even Number is "+Arr[i]);
            iCnt++;
            
           }

        }

        return iCnt;

    }
    public static void main(String[] args) {
        
        int iCount=0,i=0,iRet=0;
        System.out.println("Enter the Number of Elements that you want to store : \n");

        Scanner sobj=new Scanner(System.in);
        iCount=sobj.nextInt();

        int Arr[]=new int[iCount];


        System.out.println("Enter the elements : ");
        for(i=0;i<iCount;i++){
            
        Arr[i]=sobj.nextInt();

        }

        System.out.println("Entered Numbers are : ");
        for(i=0;i<Arr.length;i++){
            
           System.out.println(""+Arr[i]);
    
       }

      iRet=DisplayEven(Arr);

      System.out.println("No of even Elements are :  "+iRet);

    }
}

/*

Step 1 :    Accept number of elements from user

Step 2 :    Allocate dynamic memory for that number of elements

Step 3 :    Accept the values from user and store into that memory

Step 4 :    Pass the address of that memory to the function (Any)

Step 5 :    After using that memory free it explicitely

*/