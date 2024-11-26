package PCCE;

import java.util.Scanner;

// 문자열 str과 정수 n이 주어진다.
// str이 n번 반복된 문자열을 만들어 출력하는 코드
public class Problem_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(str);
        }
        sc.close();
    }
}
