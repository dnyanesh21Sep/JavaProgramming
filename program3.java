import java.util.Scanner;

public class program3 {

     public static void display(int No1){

        for(int i=1;i<=No1/2;i++){

            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        int iValue=0;

        System.out.println("Enter the number: ");
        Scanner sobj=new Scanner(System.in);
        iValue=sobj.nextInt();

        display(iValue);
    
}
}