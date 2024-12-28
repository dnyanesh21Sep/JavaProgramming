public class program69 {
    public static void main(String[] args) {


        String str="aaabbbbcddee";

        String ans=""+str.charAt(0);

        int iCount=1;

        for(int i=1;i<str.length();i++){

            char current=str.charAt(i);

            char previous=str.charAt(i-1);

            if(current==previous){

                iCount++;

            }
            else{

                if(iCount>1){

                    ans=ans+iCount;

                }
                iCount=1;
                ans=ans+current;

            }
        }

        if(iCount>1){

            ans=ans+iCount;

        }
        System.out.println(ans);


        
    }
    
}
