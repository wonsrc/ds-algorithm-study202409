package string;

import java.util.Scanner;

public class Solution1 {

    public static void main(String[] args) {

        // Computercooler c
        // 2

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);

        str = str.toLowerCase();
        c = Character.toLowerCase(c);

        int count = 0;
        for (char x : str.toCharArray()) {
            if ( x==c ) count++;
        }
//        for (int i = 0; i < str.length(); i++) {
//            if(str.charAt(i) == c) count++;
//        }

        System.out.println(count);

        sc.close();
    }
}
