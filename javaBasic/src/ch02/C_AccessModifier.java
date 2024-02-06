package ch02;

// 접근 제어자 : 클래스, 필드, 메서드에 대해서 외부 접근에 대한 제어를 하는 것

// private : 같은 클래스 내부에서만 접근 가능함, 오버라이드 안됨
// default : 같은 패키지 내부에서만 접근 가능함
// protected : 같은 패키지 내부 혹은 외부 패키지의 자손 클래스에서만 접근 가능함
// public : 모든 패키지에서 접근 가능함, 하나의 패키지 안에 두개를 작성할 수 없음

class AccessModifier { // 접근 제어자 : default
	
	void method() {
		C_AccessModifier instance = new C_AccessModifier();
		
		// C_AccessModifier 클래스의 privateVariable 필드는 접근 제어자가 private이기 때문에 외부 클래스에서 접근이 불가능함
		//instance.privateVariable = 0;
	}	
}

// ch02_sub에 C_AccessModifierSub 클래스와 같이 참조
public class C_AccessModifier {
	private int privateVariable; // 접근 제어자 : private 내부 클래스에서만 사용 가능, 외부 클래스에서는 사용 불가
	int defaultVariable; // 접근 제어자 : default
	protected int protectedVariable; // 접근 제어자 : protected
	public int publicVariable; // 접근 제어자 : public
	
	void method() {
		// C_AccessModifier 클래스의 privateVariable 필드는 접근 제어자가 private이기 때문에 클래스 내부에서만 사용 가능
		this.privateVariable = 0;
	}
}
