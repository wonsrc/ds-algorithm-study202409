package recursive;

import java.util.Arrays;

public class Fibonacci {

    static int[] fibo;

    public static int fibonacci(int n) {
        if (fibo[n] > 0) return fibo[n];
        if (n == 1) return fibo[n] = 1;
        else if (n == 2) return fibo[n] = 1;
        else return fibo[n] = fibonacci(n - 2) + fibonacci(n - 1);
    }

    public static void conversionToBinary(int n) {
        if( n == 0) return;
        // 2 로 나누는 행위가 반복
        // 나머지만 출력해야한다.

        conversionToBinary(n / 2);
        System.out.print(n % 2);

    }


    public static void main(String[] args) {

        int n = 45;
        fibo = new int[n + 1];
        int result = fibonacci(45);
        System.out.println(Arrays.toString(fibo));

        conversionToBinary(1000);
        System.out.println("(2)");

    }
}
