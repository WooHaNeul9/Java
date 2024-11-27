package PCCE.ex14;

// 연산 + 는 두 정수에 대한 연산
// 두 정수를 붙여서 쓴 값을 반환
// 예) 12 + 3 = 123, 3 + 12 = 312
// 양의 정수 a와 b가 주어졌을 때, a + b와 b + a 중 더 큰 값을 return하는 코드
public class problem {
    public int solution(int a, int b) {
        int answer = 0;
        // a 숫자랑 b 숫자랑 합침
        String result1 = a + "" + b;
        // b 숫자랑 a 숫자랑 합침
        String result2 = b + "" + a;

        // result1(문자)의 값을 숫자로 나타낸 값 > result2(문자)의 값을 숫자로 나타낸 값
        if (Integer.parseInt(result1) > Integer.parseInt(result2)) {
            // answer = result1의 값을 숫자로 나타낸 값
            answer = Integer.parseInt(result1);
        } else {
            // answer = result2의 값을 숫자로 나타낸 값
            answer = Integer.parseInt(result2);
        }

        return answer;
    }
}
