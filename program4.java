import java.util.Scanner;

public class program4 {

     public static void displayFactors(int No1){

        for(int i=1;i<=No1;i++){

           if(No1%i==0){

            System.out.println(i);
           }
        }
    }

    public static void main(String[] args) {

        int iValue=0;

        System.out.println("Enter the number: ");
        Scanner sobj=new Scanner(System.in);
        iValue=sobj.nextInt();

        displayFactors(iValue);

    }
}
