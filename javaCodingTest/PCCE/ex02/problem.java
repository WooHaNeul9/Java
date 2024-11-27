package PCCE.ex02;

import java.util.Scanner;

// 정수 a와 b가 주어진다.
// 각 수를 입력받아 입출력 예와 같은 형식으로 출력하는 코드
// 입력 예 : 4 5
// 출력 예 : a = 4 \n b = 5
public class problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("a = " + a + "\nb = " + b);
        sc.close();
    }
}
