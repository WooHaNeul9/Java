package ch02_sub;

public interface G_Message {
	
	public static final String GREETING_MESSAGE = "반갑습니다.";
	public static final String GOODBYE_MESSAGE = "수고하셨습니다.";
	
//  선언했을 시 G_InterfaceSub에 컴파일 에러 발생 => 인터페이스 분리 원칙이 지켜지지 않았기 때문		
//	public abstract void method1 ();
//	public abstract void method2 ();
	
}