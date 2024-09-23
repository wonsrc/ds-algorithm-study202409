package twopointer;

public class TwoPointer {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int targetSum = 5;
        int start = 0, end = 0, sum = 0, count = 0;

        while(end < arr.length) {
            if(sum == targetSum) {
                count++;
                sum += arr[end++];
            } else if (sum > targetSum) {   // 합이 목표값보다 크다면
                sum -= arr[start++];
            } else {    // 합이 목표값보다 작다면
                sum += arr[++end];
            }

            System.out.println("start = " + start);
            System.out.println("end = " + end);
            System.out.println("count = " + count);
            System.out.println("sum = " + sum);
            System.out.println("=======================================");
        }


    }


}
