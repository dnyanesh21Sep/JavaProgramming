

public class program39 {

    
    public static int Dispaly(int Arr[]){

        int i=0,iSum=0;

        for(i=0;i<Arr.length;i++){

           iSum=iSum+Arr[i];

        }

        return iSum;

    }


    public static void main(String[] args) {
        
        int Arr[]={10,20,30,40,50};
        int iRet=0;


      iRet= Dispaly(Arr);

      System.out.println("Sum of Array element is "+iRet);
    
}
}
