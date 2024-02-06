package ch03;

import java.util.ArrayList;
import java.util.List;

// 제너릭 : 클래스나 메서드에서 사용할 데이터 타입을 외부에서 받아오는 기법

// Test1, Test2 형태로 클래스를 사용하게 되면 코드의 중복이 발생함
class Test1 {
	String subject;
	int score;
}

class Test2 {
	String subject;
	String score;
}

// Test3 형태로 클래스를 사용하게 되면 타입의 안전성이 떨어짐 (Object 타입)
class Test3 {
	String subject;
	Object score;
}

// 제너릭 클래스 : 클래스 내부에 있는 데이터 타입을 외부에서 받아오려고 할 때 사용하는 방법
// 선언방법 : class 클래스명 <매개타입> { 매개타입 변수명; .... }
class Test4<T> { // T : 매개타입, 외부에서 받아오는 값
	String subject;
	T score;
}

//	class Test5 {
//	static <T> void method(List<Object> arg) {
//		System.out.println(arg);
//	}
//} => Object로 선언 시 에러 발생

class Test5 {

	// 제너릭 메서드 : 해당 메서드의 매개변수의 타입이나 반환 타입에서 사용할 타입을 외부에서 받아오려고 할 때 사용
	// 선언방법 : <매개타입> 반환타입 메서드명 (<매개타입> 매개변수) { ... }
	static <T> void method(List<T> arg) { // 제너릭을 받는 타입 중에 모든 타입을 사용하고 싶을 경우 T로 선언하여 사용
		System.out.println(arg);
	}
	
	// ? : 와일드 카드로 제너릭에 대해서 모든 타입을 받을 수 있도록 함
	static void wildCardMethod(List<?> arg) {
		System.out.println(arg);
	}
	
	// ? extends 클래스명 : 특정 클래스 혹은 특정 클래스를 확장한 클래스만 제너릭으로 받을 수 있도록 제한함
	// (본인 클래스 또는 자손 클래스)
	static void extendMethod(List<? extends MyClass> arg) { 
		System.out.println(arg);
	}
	
	// ? super 클래스명 : 특정 클래스 혹은 특정 클래스가 확장한 클래스만 제너릭으로 받을 수 있도록 제한함
	// (본인 클래스 또는 조상 클래스)
	static void superMethod(List<? super MyClass> arg) {
		System.out.println(arg);
	}
}

class SuperClass {
	
}

class MyClass extends SuperClass {
	
}

class SubClass extends MyClass {
	
}

public class C_Generic {

	public static void main(String[] args) {
		
		Test3 myTest = new Test3();
		myTest.subject = "국어";
		myTest.score = 95; // int 타입이 아닌 Integer 타입으로 들어가있음
		
		Test3 yourTest = new Test3();
		yourTest.subject = "경영학원론";
		yourTest.score = "A+";
		
		Test4<Integer> hisTest = new Test4<>();
		hisTest.subject = "";
		hisTest.score = 95;
		hisTest.score++;
//		hisTest.score = "A"; => 제너릭 타입 Integer로 선언했기 때문에 에러 발생
		
		Test4<String> herTest = new Test4<>();
		herTest.score = "A+";
//		herTest.score = 95; => 제너릭 타입 String을 선언했기 때문에 에러 발생
//		herTest.score++; => 제너릭 타입 String을 선언했기 때문에 에러 발생
		
//		Test5.method("object"); // 결과값 : object
//		Test5.method(10); // 결과값 : 10
		
		List<String> arrayList1 = new ArrayList<>();
		arrayList1.add("A");
		arrayList1.add("B");
		arrayList1.add("C");
		
		List<Boolean> arrayList2 = new ArrayList<>();
		arrayList2.add(true);
		arrayList2.add(false);
		arrayList2.add(true);
		
		Test5.method(arrayList1); // 결과값 : [A, B, C]
		Test5.method(arrayList2); // 결과값 : [true, false, true]
		Test5.wildCardMethod(arrayList1); // 결과값 : [A, B, C]
		Test5.wildCardMethod(arrayList2); // 결과값 : [true, false, true]
		
		SuperClass superClass = new SuperClass();
		MyClass myClass = new MyClass();
		SubClass subClass = new SubClass();
		
		List<SuperClass> superList = new ArrayList<>();
		superList.add(superClass);
		
		List<MyClass> myList = new ArrayList<>();
		myList.add(myClass);
		
		List<SubClass> subList = new ArrayList<>();
		subList.add(subClass);
		
		Test5.wildCardMethod(superList);
		Test5.wildCardMethod(myList);
		Test5.wildCardMethod(subList);

//		Test5.extendMethod(superList); => MyClass를 포함한 그의 자식 클래스
		Test5.extendMethod(myList);
		Test5.extendMethod(subList);
		
		Test5.superMethod(superList);
		Test5.superMethod(myList);
//		Test5.superMethod(subList); => MyClass를 포함한 그의 부모 클래스		
				
	}
}