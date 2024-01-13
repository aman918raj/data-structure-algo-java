package dynamicProgramming;

public class FibonacciDynamicProgramming {

    public static int fib2(int n){
        /*
        using lastValue and lastSecValue to store last two result.
         */

        int currValue = -1;
        int lastValue = -1;
        int lastSecValue = -1;
        if (n >= 0){
            lastSecValue = 0;
        }

        if(n >= 1){
            lastValue = 1;
        }

        for(int i = 2; i <= n; i++){
            currValue = lastValue + lastSecValue;
            lastSecValue = lastValue;
            lastValue = currValue;
        }

        return currValue;
    }

    public static int fib(int n){
        /*
        using array to store result
         */
        int[] arr = new int[n+1];

        int cnt = 0;
        if (n > 1){
            arr[0] = 0;
            cnt++;
        }

        if(n > 2){
            arr[1] = 1;
            cnt++;
        }

        for(int i = 2; i <= n; i++){
            arr[i] = arr[i-1] + arr[i-2];
            cnt++;
        }

        return arr[cnt-1];
    }

    public static void main(String[] args) {

        int n = 15;
       // System.out.println(fib(n));
        System.out.println(fib2(n));

    }
}
