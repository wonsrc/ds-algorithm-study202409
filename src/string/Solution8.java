package string;

import java.util.Scanner;

public class Solution8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int len = str.length();

        for (int i = 0; i < len; i++) {
            int idx = 7 * i;
            String newStr = str.substring(idx, idx + 7)
                    .replace("#","1")
                    .replace("*","0");
            int decNum = Integer.parseInt(newStr,2);

            System.out.print((char) decNum);
        }

    }
}
