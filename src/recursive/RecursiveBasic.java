package recursive;

public class RecursiveBasic {

    // 재귀 함수는 항상 종료 조건이 필요하다.
    // 마지막 호출 먼저 실행
    public static void recursive(int n) {
        if (n == 0) return;
        recursive(n-1);
        System.out.print(n + " ");
    }

    public static int factorial(int n) {
        if(n ==1 ) return 1;
        int result = n * factorial(n-1);
        return result;

    }
    public static void main(String[] args) {
        int fac = factorial(5);

        System.out.println(fac);
    }
}

