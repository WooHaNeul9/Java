package PCCE.ex19;

public class example {
    public static void main(String[] args) {

        String a = "Java";
        // ! charAt[i] -- 문자열의 i번째에 위치한 문자 반환
        char b = a.charAt(0);
        char c = a.charAt(1);

        System.out.println("문자열 : " + a);
        System.out.println("첫 번째 문자 : " + b);
        System.out.println("두 번째 문자 : " + c);

        // ======================================================//

        String d = "HelloWorld";

        for (int i = 0; i < d.length(); i++) {
            char e = d.charAt(i);

            // ! 문자열이 대문자이면 if문 실행
            if (Character.isUpperCase(e)) {
                System.out.println("대문자: " + e + " (Index " + i + ")");
                // ! 문자열이 소문자이면 else if문 실행
            } else if (Character.isLowerCase(e)) {
                System.out.println("소문자: " + e + " (Index " + i + ")");
            }
        }
    }
}
