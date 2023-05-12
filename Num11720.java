import java.util.Scanner;

/**
 * 숫자의 합 (백준 온라인 저지 11720번)
 * https://www.acmicpc.net/problem/11720
 */

public class Num11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += cNum[i] - '0';
        }

        System.out.println(sum);
    }
}
