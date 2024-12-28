
import java.util.Scanner;

public class program48 {



    public static void main(String[] args) {
        
        int iValue1=0,iValue2=0;

        Scanner sobj=new Scanner(System.in);
        

        System.out.println("Enter the value for iValue1: ");
        iValue1=sobj.nextInt();


        System.out.println("Enter the value for iValue2: ");
        iValue2=sobj.nextInt();

        int temp=0;
        temp=iValue1;
        iValue1=iValue2;
        iValue2=temp;


        System.out.println("After swap : ");

        System.out.println("value of  iValue1: "+iValue1);

        System.out.println("value of  iValue2: "+iValue2);
        
    }
}
