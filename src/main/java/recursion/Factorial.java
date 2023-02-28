package recursion;

public class Factorial {


    public static int factorialTailRecursion(int n, int a){

        if (n <= 0) return a;
        return factorialTailRecursion( n-1, n * a);
    }

    public static int factTR(int n){
        return factorialTailRecursion(n, 1);
    }

    public static int factorial(int n){
        if (n == 0) return 1;
        return n * factorial(n-1);
    }

    public static void main(String[] args) {

        int f = factTR(5);
        System.out.println(f);
        int f2 = factorial(5);
        System.out.println(f2);
    }
}
