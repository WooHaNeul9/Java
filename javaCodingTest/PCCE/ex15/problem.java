package PCCE.ex15;

// 연산 + 는 두 정수에 대한 연산
// 두 정수를 붙여서 쓴 값을 반환 (숫자를 더한게 아니라 글자처럼 합침을 의미)
// 예) 12 + 3 = 123, 3 + 12 = 312
// 양의 정수 a와 b가 주어졌을 때, a + b와 2 * a * b 중 더 큰 값을 return하는 코드
public class problem {
    public int solution(int a, int b) {
        // 문자열로 바꾼 a와 b를 합치고 숫자로 형변환
        int result1 = Integer.valueOf((String.valueOf(a) + String.valueOf(b)));
        int result2 = 2 * a * b;

        // result1이 result2보다 크면 result1 반환, 거짓이면 result2 반환
        return result1 > result2 ? result1 : result2;
    }

}
