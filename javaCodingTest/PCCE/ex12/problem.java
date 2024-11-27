package PCCE.ex12;

// 문자들이 담겨있는 배열 arr이 주어진다.
// arr의 원소들을 순서대로 이어 붙인 문자열을 return하는 코드
// 입출력 예 : ["a", "b", "c"] -> abc
public class problem {
    public String solution(String[] arr) {
        String answer = "";

        // 배열 arr 길이만큼 반복
        // 배열은 length 뒤에 괄호를 붙이지 않음
        for (int i = 0; i < arr.length; i++) {
            // 비어져있는 answer을 시작으로 arr=["a", "b", "c"] 반복해서 출력
            answer += answer + arr[i];
        }

        return answer;
    }
}
