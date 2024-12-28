
import java.util.Scanner;

public class program49{

    public static void  ReverseArray(int Arr[],int iSize){
            
        int Brr[]=new int [iSize];

        int Size=iSize;

        for(int i=0;i<iSize;i++){

            Brr[Size-1]=Arr[i];
            Size=Size-1;

        }
        System.out.println("Reverse elements are : ");

        for(int i=0;i<iSize;i++){

            System.out.println(Brr[i]);

        }        
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
        System.out.println("Entered   elements are : ");
        for(i=0;i<iCount;i++){
            
          System.out.println(" "+Arr[i]);


          }


          ReverseArray(Arr,Arr.length);
}
}
/*

Step 1 :    Accept number of elements from user

Step 2 :    Allocate dynamic memory for that number of elements

Step 3 :    Accept the values from user and store into that memory

Step 4 :    Pass the address of that memory to the function (Any)

Step 5 :    After using that memory free it explicitely

*/