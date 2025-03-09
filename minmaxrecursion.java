public class minmaxrecursion {
    public static void main(String[] args) {
        int a[]={31,4,5,6,7,8,9,12,87,10};
        int x=code(a,a.length);
        int y=code2(a,a.length);
        System.out.println("Min is "+x);
        System.out.println("Max is "+y);
        

    }
    public static int code(int a[],int n) {
        if(n==1){
            return a[0];
        }
            return Math.min(a[n-1], code(a,n-1));
        
    }
    public static int code2(int a[],int n) {
        if(n==1){
            return a[0];
        }
            return Math.max(a[n-1], code2(a,n-1));
        
    }
}
