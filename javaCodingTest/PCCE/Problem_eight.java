package PCCE;

import java.util.Scanner;

// 문자열 str이 주어진다.
// 가로로 되어있는 문자열을 세로로 돌려서 출력하는 코드
public class Problem_eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        for (int i = 0; i < a.length(); i++) {
            // a.charAt(i)는 문자열 a의 i번째 인덱스에 해당하는 문자를 가져오는 메서드
            System.out.println(a.charAt(i));
        }

        sc.close();
    }
}