package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution8 {
    public static void main(String[] args) throws IOException {

        // #****###**#####**#####**##**

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String msg = br.readLine();

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < n; i++) {
//            int idx = i * 7;
//            String temp = msg.substring(idx,idx + 7);
            String temp = msg.substring(0,7)
                    .replace("#", "1")
                    .replace("*", "0");

            int num = Integer.parseInt(temp, 2);
            answer.append((char)num);
            msg = msg.substring(7);

        }

        System.out.println(answer);
        br.close();;

//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//
//        int len = str.length();
//
//        for (int i = 0; i < len; i++) {
//            int idx = 7 * i;
//            String newStr = str.substring(idx, idx + 7)
//                    .replace("#","1")
//                    .replace("*","0");
//            int decNum = Integer.parseInt(newStr,2);
//
//            System.out.print((char) decNum);
//        }

    }
}
