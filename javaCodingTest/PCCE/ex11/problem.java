package PCCE.ex11;

// 길이가 같은 두 문자열 str1, str2가 주어진다.
// 두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 
// 한 번씩 등장하는 문자열을 만들어서 return하는 코드
// 입출력 예 : aaaa bbbb -> abababab
public class problem {
    public String solution(String str1, String str2) {
        String answer = "";

        for (int i = 0; i < str1.length(); i++) {
            answer += str1.charAt(i); // 첫번째 a // 두번째 a ...
            answer += str2.charAt(i); // 첫번째 b // 두번째 b ...
        }

        return answer;
    }
}
