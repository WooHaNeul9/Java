package PCCE.ex13;

// 문자열 my_string과 정수 k가 주어질 때,
// my_string을 k번 반복한 문자열을 return하는 코드
// 입출력 예 : my_string = string, k = 3, result = stringstringstring
public class problem {
    public String solution(String my_string, int k) {
        // 첫번째 방법
        String answer = "";

        for (int i = 0; i < k; i++) {
            answer = answer + my_string;
        }

        return answer;

        // 두번째 방법
        // A.repeat(B) => A(변수)를 B(숫자)만큼 반복함
        // return my_string.repeat(k);
    }
}
