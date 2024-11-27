package PCCE.ex06;

import java.util.Scanner;

// 두 정수 a,b가 주어질 때 다음과 같은 형태의 계산식을 출력하는 코드
// a + b = c
// 입력 예 : 4 5
// 출력 예 : 4 + 5 = 9
public class problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + " + " + b + " = " + (a + b));
        sc.close();
    }
}
