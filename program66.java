public class program66 {
    
    public static void main(String[] args) {
        
        String str="cold";

        StringBuilder gtr=new StringBuilder(str);

        gtr.reverse();

        String s=gtr+"";

        if(str.equals(s)){

            System.out.println("Palindrome ");
        }
        else{

            System.out.println(" not Palindrome ");
        }


        
    }
}
