package recursion;

public class Fibonacci {

    public static int fibTailRecursion(int n, int a, int b){

        if (n==0) return a;
        if (n==1) return b;

        return fibTailRecursion(n-1, b, a + b);
    }

    public static int fib(int n){
        return fibTailRecursion(n, 0, 1);
    }

    public static void main(String[] args) {
        System.out.println(fib(3));
    }
}
