package PCCE.ex20;

public class example {
    public static void main(String[] args) {

        String a = "Hello, World!";
        // ! substring(시작 인덱스) : 시작 인덱스부터 끝까지 반환
        String b = a.substring(7);
        // ! substring(시작 인덱스, 마지막 인덱스) : 시작 인덱스부터 마지막 -1 인덱스까지 반환
        String c = a.substring(2, 5);

        // ! 인덱스는 항상 0번째부터 세야함
        System.out.println("7번째부터 : " + b);
        System.out.println("2번째부터 4번째까지 : " + c);
    }
}
