package string;

import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        str = str.toLowerCase();

        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
                if(Character.isLetter(c)) {
                    sb.append(c);
                }
        }

        // 정리한 문자열이 역순으로 배치한 문자열과 동일하면 YES, 그렇지 않다면 NO
        if(sb.toString().equals(sb.reverse().toString())) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sb.reverse();

        sc.close();
//        Scanner sc = new Scanner(System.in);
//        boolean flag = true;
//
//        String str = sc.nextLine();
//        char[] arr = str.toLowerCase().toCharArray();
//
//        int left = 0, right = arr.length-1;
//        while(left < right) {
//            if (!Character.isAlphabetic(arr[left])) left++;
//            else if (!Character.isAlphabetic(arr[right])) right--;
//            else if (arr[left] != arr[right]) {
//                left++; right--;
//            }
//        }
    }
}
