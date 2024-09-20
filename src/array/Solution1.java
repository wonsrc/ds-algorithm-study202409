package array;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.print(arr[0] + " ");
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[i-1]){
                System.out.print(arr[i] + " ");
            }

        }

        br.close();
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//
//        int[] arr = new int[num];
//
//        for (int i = 0; i < num; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        StringBuilder answer = new StringBuilder();
//        answer.append(arr[0] + " ");
//        for (int i = 1; i < num; i++) {
//            if (arr[i] >= num) {
//                answer.append(arr[i] + " ");
//            }
//
//        }
//
//        System.out.println(answer);
//

    }
}
