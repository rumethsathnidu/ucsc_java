public class fib {

    public static void main(String[] args) {
        int x =fibo(50);
        System.out.println(x);
    }
    public static int fibo(int n){
         if (n<=1)
            return 1;
            return fibo(n - 1) + fibo(n - 2);
 }


    }

    
    
