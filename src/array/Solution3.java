package array;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution3 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");

        int[] A = new int[N];
        int[] B = new int[N];

        for (int i = 0; i < A.length; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < A.length; i++) {
            B[i] = Integer.parseInt(st2.nextToken());
        }

        for (int i = 0; i < N; i++) {
            if (A[i] == B[i]) System.out.println("D");
            else if(A[i] == 1 && B[i] == 3) System.out.println("A");
            else if(A[i] == 2 && B[i] == 1) System.out.println("A");
            else if(A[i] == 3 && B[i] == 2) System.out.println("A");
            else System.out.println("B");
        }

        br.close();

//        Scanner sc = new Scanner(System.in);
//
//        int num = sc.nextInt();
//
//        int[] arrA = new int[num];
//        int[] arrB = new int[num];
//
//        for (int i = 0; i < num; i++) {
//            arrA[i] = sc.nextInt();
//        }
//
//        for (int i = 0; i < num; i++) {
//            arrB[i] = sc.nextInt();
//        }
//
//        for (int i = 0; i < num; i++) {
//            if(arrA[i] == arrB[i]) System.out.println("D");
//            else if(arrA[i] - arrB[i] == 1) {
//                System.out.println("A");
//            } else if(arrA[i] - arrB[i] == 2) {
//                System.out.println("B");
//            } else if( arrA[i] - arrB[i] < 0){
//                System.out.println("B");
//            }
//        }

    }
}
