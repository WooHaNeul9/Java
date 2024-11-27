package PCCE.ex10;

// 문자열 my_string, overwrite_string과 정수 s가 주어진다.
// 문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을
// 문자열 overwrite_string으로 바꾼 문자열을 return하는 solution 함수를 작성
// my_string : He11oWor1d, overwrite_string : lloWorl, s : 2
public class problem {
    public String solution(String my_string, String overwrite_string, int s) {
        // my_string을 0번째부터 s번재(2번째) 앞까지 자른 문자열 = "He"
        String before = my_string.substring(0, s);
        // s값(2) + overwrite_string 길이(7) = 9 --> my_string을 9번째 글자부터 자른 문자열 ="ld"
        // 글자 인덱스할 때 0부터 세야함
        String after = my_string.substring(s + overwrite_string.length());
        // He + lloworl + d = Hellowrold
        return before + overwrite_string + after;
    }
}
