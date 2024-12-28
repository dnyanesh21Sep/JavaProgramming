public class program60 {
    

    public static void main(String[] args) {
        
        String str="Mohit";

        // String gtr=str.substring(1, 4);
       
        // String gtr=str.substring(3);
        // System.out.println(gtr);
        

        for(int i=0;i<str.length();i++){

            for(int j=i+1;j<=str.length();j++){
              
                System.out.print(" "+str.substring(i, j));
              
            }
        }

    }


}
