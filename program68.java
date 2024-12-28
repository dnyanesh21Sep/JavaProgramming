public class program68 {

    public static void main(String[] args) {
        
        String str="I Am MOHIT MORE";
        String ans="";
        StringBuilder sb=new StringBuilder("");


        for(int i=0;i<str.length();i++){
          
            char ch=str.charAt(i);

            if(ch !=' '){

                sb.append(ch);

            }
            else{//ch==' ';


                sb.reverse();

                ans=ans+sb;
                ans=ans+" ";
                sb.delete(0, sb.length());


            }

        }
        sb.reverse();
        ans=ans+sb;

        System.out.println(ans);
    }
    
}
