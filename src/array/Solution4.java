package array;

import java.util.Scanner;

public class Solution4 {

    public static boolean isPrime(int num) {
            if (num == 1) return false;

        for (int i = 2; i < num; i++) {
            if(num % i == 0) return false;

        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < num; i++) {
            res.setLength(0);
            res.append(sc.next());
            res.reverse();
            arr[i] = Integer.parseInt(String.valueOf(res));
        }

        //32 55 62 20 250 370 200 30 100
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < num; i++) {
            if(isPrime(arr[i])) {
                answer.append(arr[i] + " ");
            }

        }

        System.out.println(answer);

    }
}
