
import java.util.Scanner;

public class program2 {

    public static void display(int No1){

        for(int i=1;i<=No1;i++){

            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        int iValue=0;

        System.out.println("Enter the number: \n");
        Scanner sobj=new Scanner(System.in);
        iValue=sobj.nextInt();

        display(iValue);
        
    }
    
}
