package PCCE.ex04;

import java.util.Scanner;

// 영어 알파벳으로 이루어진 문자열 str이 주어진다.
// 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드
public class problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        // 주어진 문자열을 담을 변수 answer 선언 (초기값은 빈 문자열)
        String answer = "";

        // 문자열 a를 문자 배열로 변환하여 각 문자에 대해 반복문 실행
        // Character는 문자를 저장할 수 있는 데이터 타입
        // c는 반복문이 실행될 때마다 문자 배열에서 하나씩 추출되는 값
        for (Character c : a.toCharArray()) {
            // 현재 문자가 대문자인지 확인
            if (Character.isUpperCase(c)) {
                // 대문자라면, 그 문자를 소문자로 변환하여 answer에 추가
                answer += Character.toLowerCase(c);
            }
            // 현재 문자가 소문자인지 확인
            else if (Character.isLowerCase(c)) {
                // 소문자라면, 그 문자를 대문자로 변환하여 answer에 추가
                answer += Character.toUpperCase(c);
            }
        }

        System.out.print(answer);
        sc.close();
    }
}
