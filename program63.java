
import java.util.Scanner;

public class program63 {
 
public static void main(String[] args) {
    
    // String str=new String("Mohit");

    Scanner sobj=new Scanner(System.in);

    System.out.println("Enter the string : ");


    StringBuilder sb=new StringBuilder(sobj.nextLine());

    System.out.println("Entered string is "+sb);

    //Toggle

    for(int i=0;i<sb.length();i++){

      boolean flag=true;

      char ch=sb.charAt(i);

      if(ch==' '){
        
        continue;
      }

      int asci=(int)ch;

      if(asci>=97){

         flag=false;

      }

      if(flag==true){
        asci=asci+32;
        char dh=(char)asci;
      sb.setCharAt(i, dh);
      }
      else{
        
        asci=asci-32;
        char dh=(char)asci;
        sb.setCharAt(i, dh);

      }
    }

    System.out.println("Entered string is "+sb);
    

}


    
}
