package string;

import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String answer = "";

        for (int i = 0; i < str.length(); i++) {
            /*
                System.out.println(str.charAt(i)
                                    + " "
                                    + i
                                    + " "
                                    + str.indexOf(str.charAt(i)));
                k 0 0
                s 1 1
                e 2 2
                k 3 0
                k 4 0
                s 5 1
                e 6 2
                t 7 7
            */
            if(str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);
        }

//        System.out.println(answer);

    }
}
