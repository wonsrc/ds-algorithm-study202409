package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class patient {
    int index;  // 환자의 인덱스(M번째 환자를 파악하기 위해)
    int risk;   // 환자의 위험도

    public patient(int index, int risk) {
        this.index = index;
        this.risk = risk;
    }
}

public class Solution7 {

    public static void main(String[] args) throws IOException {

        /* 입 력 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());   // 환자수
        int M = Integer.parseInt(st.nextToken());   // M번째 환자
        Queue<patient> queue = new LinkedList<>();

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            queue.offer(new patient(i, Integer.parseInt(st.nextToken())));
        }

        /* 처 리 */
        int count = 0; // 몇번째로 진료받는지
        while (!queue.isEmpty()) {
            patient current = queue.poll();
            boolean flag = false;


            // 현재 환자보다 위험도가 높은 환자가 있는지 확인
            for (patient p : queue) {
                if (p.risk > current.risk) {
                    flag = true;
                    break;
                }
            }

            // 위험도가 높은 환자가 존재한다면
            if (flag) {
                queue.offer(current);   // 현재 환자를 맨 뒤로 보내자.
            } else { // 진료받자.
                count++;
                if (current.index == M) {    // M번째 환자니?
                    System.out.println(count);
                    return;
                }
            }
        }

        br.close();

    }
}
