package PCCE.ex07;

import java.util.Scanner;

// 두 개의 문자열 str1, str2가 공백으로 구분되어 입력으로 주어진다.
// 입출력 예와 같이 str1과 str2를 이어서 출력하는 코드
// 입력 예 : apple pen
// 출력 예 : applepen
public class problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        System.out.println(a + b);
        sc.close();
    }
}
