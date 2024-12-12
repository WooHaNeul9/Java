package PCCE.ex18;

public class example {
    public static void main(String[] args) {

        String a = "Java is learn";
        // ! split -- 따옴표(" ") 안의 공백 기준으로 나뉘어서 배열 생성
        String[] aa = a.split(" ");

        System.out.println("문자열: " + a);
        System.out.println("단어 배열:");

        for (String word : aa) {
            System.out.println(word);
        }

        // ======================================================//

        String b = "Java,isl,earn";
        // ! split -- 따옴표(" ") 안의 쉼표 기준으로 나뉘어서 배열 생성
        String[] bb = b.split(",");

        System.out.println("문자열: " + b);
        System.out.println("단어 배열:");

        for (String word : bb) {
            System.out.println(word);
        }

        // ======================================================//

        String c = "Java is learn";
        // ! split -- 따옴표(" ") 안의 공백 기준으로 나뉘어서 2개의 배열 생성
        String[] cc = c.split(" ", 2);

        System.out.println("문자열: " + c);
        System.out.println("단어 배열:");

        for (String word : cc) {
            System.out.println(word);
        }

        // ======================================================//

        String d = "Ja va is learn";
        // ! split -- 따옴표(" ") 안의 공백 기준으로 나뉘어서 2개의 배열 생성
        String[] dd = d.split(" ", 2);

        System.out.println("문자열: " + d);
        System.out.println("단어 배열:");

        for (String word : dd) {
            System.out.println(word);
        }
    }
}
