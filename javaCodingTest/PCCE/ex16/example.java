package PCCE.ex16;

public class example {
    public static void main(String[] args) {

        String a = "123";
        // ! Integer.parseInt(변환할 변수) ---- 123
        int aa = Integer.parseInt(a);

        System.out.println("문자열 :" + aa);

        // ======================================================//

        String b = "123";
        // ! Integer.valuOf(변환할 변수) ---- 123
        int bb = Integer.valueOf(b);

        System.out.println("문자열 :" + bb);

        // ======================================================//

        String c = "123";
        // ! Double.valueOf(변환할 변수) ---- 123.0
        double cc = Double.valueOf(c);

        System.out.println("문자열 :" + cc);

        // ======================================================//

        String d = "123";
        // ! Float.valueOf(변환할 변수) ---- 123.0
        float dd = Float.valueOf(d);

        System.out.println("문자열 :" + dd);

        // ======================================================//

        String e = "123";
        // ! Short.valueOf(변환할 변수) ---- 123
        short ee = Short.valueOf(e);

        System.out.println("문자열 :" + ee);
    }
}