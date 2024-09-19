package string;

import java.util.Scanner;

public class Solution3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean flag = true;

        char[] arr = str.toLowerCase().toCharArray();
        int left = 0, right = arr.length - 1;

        while (left < right) {
            if (!Character.isAlphabetic(arr[left])) left++;
            else if (!Character.isAlphabetic(arr[right])) right--;
            else if (arr[left] != arr[right]) {
                flag = false;
                break;
            } else {
                left++;
                right--;
            }
        }
        if (flag == false) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
        sc.close();

    }
}