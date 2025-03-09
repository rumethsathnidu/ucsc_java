public class minmax {
    public static void main(String[] args) {
        int mya[] ={1,3,5,7,2,3,4,6};
        int min= mya[0];
        int max= mya[0];

        for(int x=0;x<mya.length;x++){
            if(mya[x]<min){
                min=mya[x];
            }
            if(mya[x]>max){
                max=mya[x];
            }
         }

         System.out.println("Max is "+max);
         System.out.println("Min is "+min);
    }
}
