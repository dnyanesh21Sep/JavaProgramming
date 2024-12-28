
import java.util.Scanner;

public class program40 {

    
    public static int Addition(int Arr[]){

        int i=0,iSum=0;

        for(i=0;i<Arr.length;i++){

           iSum=iSum+Arr[i];

        }
        return iSum;

    }
    public static void main(String[] args) {
        int iRet=0;
        
        
        int Arr[]=new int[5];
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the Number : ");

        for(int i=0;i<Arr.length;i++){

            Arr[i]=sobj.nextInt();

        }
      iRet= Addition(Arr);

      System.out.println("Sum of Array element is "+iRet);
    
}
}
