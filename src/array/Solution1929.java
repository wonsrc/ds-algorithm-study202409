package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution1929 {

    public static void isPrime2(int m, int n) {
        boolean[] arr = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            arr[i] = true;
        }

        for (int i = 2; i <= n; i++) {
            // 만약 배수를 증가시키는데, 이미 0으로 지워졌다면 건너뛰겠다.
            if (!arr[i]) continue;

            // 자기 자신을 제외한 나머지 배수의 값을 전부 0으로 만들기
            // j는  i만큼 계속 증가합니다.
            for (int j = i + i; j <= n; j += i) {
                arr[j] = false;
            }
        }
    }

    public static int[] isPrime(int m, int n) {
        int[] arr = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            arr[i] = i;
        }

        for (int i = 2; i <= n; i++) {
            // 만약 배수를 증가시키는데, 이미 0으로 지워졌다면 건너뛰겠다.
            if(arr[i] == 0) continue;

            // 자기 자신을 제외한 나머지 배수의 값을 전부 0으로 만들기
            // j는  i만큼 계속 증가합니다.
            for (int j = i + i; j <= n; j+=i) {
                arr[j] = 0;
            }

        }

        return arr;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] prime = isPrime(M, N);

        for (int i = M; i <= N; i++) {
            // 소수가 아닌 애들은 isPrime 에서 0으로 지워졌으니까
            // 0이 아닌 애들만 출력하기.
            if (prime[i] != 0) System.out.println(prime[i]);
        }


    }
}
