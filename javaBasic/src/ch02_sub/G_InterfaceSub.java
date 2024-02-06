package ch02_sub;

class InterfaceSub implements G_Message {
	
	int method3(int number) {
		System.out.println(GREETING_MESSAGE);
		System.out.println(GOODBYE_MESSAGE);
		
		return 3 + number;
	}
	
}

public class G_InterfaceSub implements G_Message, G_Method {

	public void method1() {
		System.out.println(GREETING_MESSAGE);
		System.out.println(GOODBYE_MESSAGE);
	} // => 메서드가 시작하고 끝날 때 무조건 G_message가 출력
	
	public void method2() {
		System.out.println(G_Message.GREETING_MESSAGE);
		System.out.println(G_Message.GOODBYE_MESSAGE);
	} // => 해당하는 선언된 부분에만 G_message를 출력

}