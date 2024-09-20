package array;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());

        }

        int count = 1;  // 첫번째 학생은 무조건 보임.
        int max = arr[0]; // 최대값도 일단 첫번째 학생임.
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
                count++;
            }
        }

        // bufferedWriter 객체로 출력할 때는 문자열로 값을 주세요.
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();;
        br.close();;

//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//
//        int[] arr = new int[num];
//
//        for (int i = 0; i < num; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        int max = -1;
//        int cnt = 0;
//
//        for (int i = 0; i <num; i++) {
//            if(arr[i]> max) {
//                cnt++;
//                max = arr[i];
//            }
//        }
//
//        System.out.println(cnt);

    }
}
