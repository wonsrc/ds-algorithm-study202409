//package array;
//
//import java.io.BufferedReader;
//import java.util.Arrays;
//import java.util.Scanner;
///*
//5
//10 13 10 12 15
//12 39 30 23 11
//11 25 50 53 15
//19 27 29 37 27
//19 13 30 13 19
//
// */
//
//public class Solution5 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = Integer.parseInt(sc.nextLine());
//
//        int[][] arr = new int[num][num];
//        for (int i = 0; i < num; i++) {
//            String[] strArr = sc.nextLine().split(" ");
//            for (int j = 0; j < num; j++) {
//                arr[i][j] = Integer.parseInt(strArr[j]);
//            }
//        }
////
//        StringBuilder allTotal = new StringBuilder();
//        int total = 0;
//
//        // 가로합
//        for (int i = 0; i < num; i++) {
//            total = 0;
//            for (int j = 0; j < num; j++) {
//                total += arr[i][j];
//            }
//            allTotal.append(total + " ");
//        }
//
//        // 세로합
//        for (int i = 0; i < num; i++) {
//            total = 0;
//            for (int j = 0; j < num; j++) {
//                total += arr[j][i];
//            }
//            allTotal.append(total + " ");
//        }
//
//        // 대각합
//        total = 0;
//        for (int i = 0; i < num; i++) {
//            for (int j = 0; j < num; j++) {
//
//                if(i == j) {
//                    total += arr[i][j];
//                    System.out.println(arr[i][j]);
//                }
//            }
//        }
//        allTotal.append(total + " ");
//
//        total = 0;
//        for (int i = 0; i < num; i++) {
//            for (int j = 0; j < num; j++) {
//                if(i+j == 4) total += arr[i][j];
//            }
//        }
//        allTotal.append(total + " ");
//
//
//
//        System.out.println(allTotal);
//
////        System.out.println(Arrays.deepToString(arr));
//
//
//    }
//}
