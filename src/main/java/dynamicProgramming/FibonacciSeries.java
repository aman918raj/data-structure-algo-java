package dynamicProgramming;

public class FibonacciSeries {

    public static int fib2(int n){
        if (n < 0) {
            return -1;
        }
        if (n <= 1) {
            return n;
        }
        return fib2(n-1) + fib2(n-2);
    }
    public static int fib(int n, int a, int b){
        if(n == 0){
            return a;
        }
        if(n == 1){
            return b;
        }

        return fib(n-1, b,a+b);
    }

    public static void main(String[] args) {
        //System.out.println(fib(5,0,1));
        System.out.println(fib2(100));
    }
}
