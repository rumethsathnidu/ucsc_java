public class factorial {
    public static void main(String[] args) {
     int x=code(5);
     int y=code2(5);
     System.out.println(x);
     System.out.println(y);
    }

    public static int code(int n) {
        if(n!=1)
        return n*code(n-1);
        else
        return 1;
        
    }
    
    public static int code2(int n) {
        if(n==1)
        return 1;
        else
        return n*code(n-1);
        
    }
}
