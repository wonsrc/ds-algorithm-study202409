package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution3 {
    public static void main(String[] args) throws IOException {

        /* 입력 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        char[] tmp = new char[str.length()];
        tmp = str.toCharArray();

        /* 처리 */
        // (A(BC)D)EF(G(H)(IJ)K)LM(N)
        int point = 0;
        for (int i = 0; i < str.length(); i++) {
            if(tmp[i] == '(') point++;
            else if( tmp[i] == ')') point--;

            if(point == 0 && Character.isAlphabetic(tmp[i])) {
                System.out.print(tmp[i]);
            }
        }
    }
}
