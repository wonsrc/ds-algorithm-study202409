package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {

        /* 입력 */
        Scanner sc = new Scanner(System.in);

        int prince = sc.nextInt();
        int num = sc.nextInt();

        /* 처리 */
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= prince; i++) {
            queue.add(i);
        }

        int pointer = 1;
        while(queue.size() > 1) {
            queue.offer(queue.poll());
            pointer++;

            if(pointer == num) {
                queue.poll();
                pointer = 1;
            }
        }

        System.out.println(queue.poll());

    }
}
