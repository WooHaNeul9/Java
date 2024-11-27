package PCCE.ex09;

import java.util.Scanner;

// 자연수 n이 입력으로 주어졌을 때,
// 만약 n이 짝수이면 "n is even"을 출력하고
// 만약 n이 홀수이면 "n is odd"를 출력하는 코드
public class problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        /* if문 사용 */
        // if (n % 2 == 0) {
        // System.out.println(n + " is even");
        // } else {
        // System.out.println(n + " is odd");
        // }

        /* 삼항 연산자 사용 */
        System.out.println(n + " is " + (n % 2 == 0 ? "even" : "odd"));

        sc.close();
    }
}
