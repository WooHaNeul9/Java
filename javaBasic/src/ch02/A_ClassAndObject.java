package ch02;

// 클래스 : 공통된 속성과 기능을 하나로 정의해둔 것
// 구조체 + 기능, 행동
// 사람의 설명과 사람이 할 수 있는 기능 등을 설명, 사용자 지정 타입
// 선언 방법 : [접근 제어자] class 클래스명 { 속성, 기능 }
// 클래스를 선언할 때는 클래스 외부에서 선언
class ExampleClass1 {
	
	// number; => 변수
	// number(); => 메서드
	// Number(); => 생성자
	
	// 속성 : 클래스가 가질 수 있는 정보나 상태
	// 일반적으로 변수로 표현
	
	// 인스턴스 변수 : 각 인스턴스마다 독립적으로 값을 가지는 변수
	// 구조체 : 다른 타입의 변수를 하나로 묶은 것
	int attribute1;
	double attribute2;
	
	// 클래스 변수(static 변수, 정적 변수) : 해당 클래스로 생성된 모든 인스턴스가 공유하는 변수
	// 속성 앞에 static 키워드를 사용하여 지정할 수 있음
	// 인스턴스 변수 사용 불가능 => 인스턴스 변수는 인스턴스가 생성되어야만 사용 가능
	static int staticAttribute;
	
	// 기능 : 클래스가 가질 수 있는 행동이나 작업 (= 메서드)
	// 클래스로 생성된 객체를 통해서 호출 가능
	// 생성 방법 : [접근 제어자, 일반 제어자] 반환타입 메서드명 (매개변수 타입 매개 변수명[, ....]) => 선언부
	// { 메서드 기능 구현 } => 구현부
	// void가 없는 것 : 반환값이 필요할 때 사용, void가 있는 것 : 반환값이 필요하지 않을 때 사용
	
	// 매개변수 : O, 반환값 : O
	int method1(int arg1, int arg2) {
		// 기능 구현
		// 반환타입이 void가 아니면 반드시 return으로 결과를 반환해야함		
		return 0; // 타입이 다르면 반환하지 않음 => return 0.0 (X)
	}
	
	// 매개변수 : X, 반환값 : O
	int method2() {
		return 0; 
	}
	
	// 매개변수 : O, 반환값 : X
	void method3(int arg1) {
		// void에서의 return은 강제로 메서드를 종료하기 위해 사용
		return;
	}
	
	// 매개변수 : X, 반환값 : X
	void method4() {
		System.out.println(attribute1);
		System.out.println(staticAttribute);
		
		method2();
		staticMethod();		
	}
	
	// 클래스 메서드(static 메서드, 정적 메서드)
	// 모든 인스턴스를 공유하는 메서드
	// 반환타입 앞에 static 키워드를 붙여서 사용
	static void staticMethod() {
		// static 메서드에서는 instance 변수 접근 및 instance 메서드 호출이 불가능
		// System.out.println(attribute1); // non-static으로 지정된 것을 static으로 사용할 수 없음
		System.out.println(staticAttribute);
		
		// method2(); // non-static으로 지정된 것을 static으로 사용할 수 없음
		//staticMethod();
	}
	
	// 생성자 : 클래스의 인스턴스를 생성하는 순간에 호출되는 메서드
	// 클래스와 같은 이름을 가지고 있고 반환 타입이 존재하지 않음
	// 생성자는 무조건 인스턴스 타입이 반환됨
	// 선언 방법 : 클래스명 ([매개변수, ...]) { 인스턴스가 생성될 때 할 작업 }
	// 객체의 속성들을 초기화해놓은 것
	ExampleClass1(int attribute1, double attribute2) { //생성자에서 초기화 작업을 할 때 매개변수를 생성하여 사용함 => 의존성을 외부에서 주입한 것
		System.out.println("ExampleClass1 인스턴스 생성!!");
		
		// 의존성이 내부에서 주입하는 형태
		// 속성 값이 생성 이전에 결정이 되었기 때문에 코드의 안정성이 저하
		//attribute1 = 99;
		//attribute2 = -99.99;
		
		// 의존성을 외부에서 주입하는 형태
		// 속성의 값이 생성 당시에 결정됙 때문에 코드의 안정성을 향상
		// this 키워드 : 클래스 내부의 자기 인스턴스를 지칭
		this.attribute1 = attribute1; 
		this.attribute2 = attribute2;
	}
	
	// 오버로딩 : 같은 클래스 내에서 같은 이름의 메서드를 여러개 작성할 수 있도록 하는 방법
	// 오버로딩 조건
	// 1. 메서드 이름을 중복해서 작성하지만 매개변수의 타입 및 갯수를 다르게 작성
	// 2. 메서드의 반환타입과 메서드의 매개변수의 이름은 오버로딩에 영향을 미치지 않음
	void overloadMethod() { 
		
	}
	
	void overloadMethod(int arg) { 
				
	}
	
	void overloadMethod(double arg) { 
		
	}
	
	void overloadMethod(int arg1, double arg2) { 
		
	}
	
	void overloadMethod(double arg1, int arg2) {
		
	}
	
	// 오버로드 적용안되는 에
//	int overloadMethod(double arg1, int arg2){
//		return 0;
//	}
	
//	void overloadMethod(double double1, int int1) {
//		
//	}
	
	// 생성자도 메서드의 일종이기 때문에 오버로딩이 가능함
	ExampleClass1() {
		this.attribute1 = 99;
		this.attribute2 = -99.99;
	}
	
	ExampleClass1(int attribute1){
//		this(); // 생성자 => 매개변수를 괄호 안에 넣지 않으면 위에 적혀져 있는 attribute 값들이 들어감
//		this.attribute1 = attribute1;
//		this.attribute2 = -99.99;
		
		this(attribute1, -99.99); // 생성자 내부에서만 호출가능
	}
}

// 축구선수	(FootballPlayerA)
// 이름 		(name : String)
// 포지션 	(position : String)
// 생년월일 	(birth : String)
// 키		(height : double) 
// 몸무게		(weight : double)
// 국적		(country : String)
// 주발		(mainFoot : String)
// 팀		(team : String)
// 골		(goal : int)
// 어시스트	(assist : int)
// 경고수		(foul : int)

// 잠자기 		(sleep) - 작업 : "(취침시간) ~ (기상시간)까지 취침" 출력
// 밥먹기			(eat) - 작업 : "(음식) 먹음" 출력
// 훈련하기		(train) - 작업 : "훈련!!" 출력
// 경기결과내기		(setGameResult) - 작업 : 골, 어시스트, 경고수 속성 변경
// 이적하기		(moveTeam) - 작업 : 팀 변경

class FootballPlayerA {
	String name;
	String position;
	String birth;
	double height;
	double weight;
	String country;
	String mainFoot;
	String team;
	int goal;
	int assist;
	int foul;
	
	void sleep(String bedTime, String wakeUpTime) {
		System.out.println(bedTime + " ~ " + wakeUpTime + "까지 취침");
	}
	
	void eat(String food) {
		System.out.println(food + "먹음");
	}
	
	void train() {
		System.out.println("훈련!!");
	}
	
	void setGameResult(int goalResult, int assistResult, int foulResult) {
		goal += goalResult; // goal에 goalResult를 누적
		assist += assistResult; // assist에 assistResult를 누적
		foul += foulResult; // foul에 foulResult를 누적
	}
	
	void moveTeam(String destinationTeam) {
		team = destinationTeam; // team을 destinationTeam으로 바꾸겠다
	}
	
	void printInfomation() {
		System.out.println("====================================");
		System.out.println(name + "의 정보");
		System.out.println("포지션 : " + position);
		System.out.println("생년원일 : " + birth);
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + weight);
		System.out.println("국적 : " + country);
		System.out.println("주발 : " + mainFoot);
		System.out.println("소속팀 : " + team);
		System.out.println("득점 : " + goal);
		System.out.println("도움 : " + assist);
		System.out.println("파울 : " + foul);		
	}
}

public class A_ClassAndObject {

	// 전역 필드 (전역 변수)
	// String name;
	
	public static void main(String[] args) { // main : 기능
		
		// 지역 변수
		// String name;		
		
		// 인스턴스 : 특정 클래스로 정의된 것을 실체화한 것 (객체라고도 함), 클래스 안에 정의된 객체
		// 생성 방법 : 클래스명 참조변수명 = new 클래스명();
		ExampleClass1 instance1 = new ExampleClass1(0,0); // 위에 선언해놓은 속성과 메서드를 다 가지고 있음 // ()안에 값이 없을 때 발생 => The constructor ExampleClass1() is undefined : 매개변수를 넣지 않았기 때문에 에러 발생
		ExampleClass1 instance2 = new ExampleClass1(0,0); 
		
		System.out.println(instance1); // 결과값 : ch02.ExampleClass1@6f2b958e
		System.out.println(instance2); // 결과값 : ch02.ExampleClass1@5e91993f
		
		// 인스턴스가 가지고 있는 속성에 접근하는 방법
		// 인스턴스.속성명;
		instance1.attribute1 = 10;
		instance1.attribute2 = 3.14;
		System.out.println(instance1.attribute1); // 결과값 : 10
		System.out.println(instance1.attribute2); // 결과값 : 3.14
		System.out.println(instance2.attribute1); // 결과값 : 0
		System.out.println(instance2.attribute2); // 결과값 : 0.0
				
		
		// 인스턴스가 가지고 있는 메서드 호출하는 방법
		// 인스턴스.메서드();
		instance1.method1(1,2); // 메서드에 매개변수 선언되어있으면 매개변수 가져와야함 => int arg1, int arg2
		instance1.method2();
		instance1.method3(1);
		instance1.method4();
		 
		FootballPlayerA son = new FootballPlayerA();
		FootballPlayerA lee = new FootballPlayerA();
		
		son.name = "손흥민";
		son.position = "공격수";
		son.birth = "920708";
		son.height = 183.0;
		son.weight = 77;
		son.country = "대한민국";
		son.mainFoot = "오른발";
		son.team = "토트넘 홋스퍼 FC";
		son.goal = 0;
		son.assist = 0;
		son.foul = 0;
		
		lee.name = "이강인";
		lee.position = "미드필더";
		lee.birth = "010219";
		lee.height = 174.0;
		lee.weight = 71;
		lee.country = "대한민국";
		lee.mainFoot = "왼발";
		lee.team = "파리 생제르맹 FC";
		lee.goal = 0;
		lee.assist = 0;
		lee.foul = 0;
		
		System.out.println(son.name);
		son.sleep("21:00", "06:00");
		son.eat("컵라면");
		son.train();
		
		son.setGameResult(1, 1, 0);
		son.moveTeam("아스날 FC");
		
		System.out.println(son.name + "의 정보");
		System.out.println("포지션 : " + son.position);
		System.out.println("생년원일 : " + son.birth);
		System.out.println("키 : " + son.height);
		System.out.println("몸무게 : " + son.weight);
		System.out.println("국적 : " + son.country);
		System.out.println("주발 : " + son.mainFoot);
		System.out.println("소속팀 : " + son.team);
		System.out.println("득점 : " + son.goal);
		System.out.println("도움 : " + son.assist);
		System.out.println("파울 : " + son.foul);
		
		lee.setGameResult(0, 1, 2);
		
		System.out.println(lee.name + "의 정보");
		System.out.println("포지션 : " + lee.position);
		System.out.println("생년원일 : " + lee.birth);
		System.out.println("키 : " + lee.height);
		System.out.println("몸무게 : " + lee.weight);
		System.out.println("국적 : " + lee.country);
		System.out.println("주발 : " + lee.mainFoot);
		System.out.println("소속팀 : " + lee.team);
		System.out.println("득점 : " + lee.goal);
		System.out.println("도움 : " + lee.assist);
		System.out.println("파울 : " + lee.foul);
		
		lee.moveTeam("수원 삼성");
		
		lee.printInfomation();
		son.printInfomation();
		
		// static 변수는 클래스로 직접 접근이 가능
		ExampleClass1.staticAttribute = 99;
		
		// instance 변수와 메서드는 '반드시' 인스턴스를 생성하여 인스턴스로 접근 및 호출
		//ExampleClass1.attribute1 = 10;
		//ExampleClass1.method1(0,0);
		
		instance1.staticAttribute = 99;
		System.out.println(instance1.staticAttribute); // 결과값 : 99  // The static field ExampleClass1.staticAttribute should be accessed in a static way : static 방법으로 접근하는 것이 좋음 => 클래스로 직접 접근
		System.out.println(instance2.staticAttribute); // 결과값 : 99
		
		ExampleClass1.staticMethod(); // 결과값 : 99
		instance1.staticMethod(); // 결과값 : 99
		instance2.staticMethod(); // 결과값 : 99
		
		// 파란색 ExampleClass1 => 전체 클래스를 가르침, 연두색 ExamplaClass1 => 생성자를 가르침
		// instance3 안에 전체 클래스와 생성자의 데이터가 들어있는 것
		// 그 결과 : println 찍었을 시 attribute1에는 99, attribute에는 -99.99가 보이는 것
		ExampleClass1 instance3 = new ExampleClass1(99, -99.99); // 결과값 : ExampleClass1 인스턴스 생성!! 
		System.out.println(instance3.attribute1); // 결과값 : 99
		System.out.println(instance3.attribute2); // 결과값 : -99.99
		
		ExampleClass1 instance4 = new ExampleClass1(999, 99.99); // 결과값 : ExampleClass1 인스턴스 생성!!
		System.out.println(instance4.attribute1); // 결과값 : 99
		System.out.println(instance4.attribute2); // 결과값 : -99.99
//		instance4.attribute1 = 999;
//		instance4.attribute2 = 99.99;
		
		
		ExampleClass1 instance5 = new ExampleClass1();
		System.out.println(instance5.attribute1); // 결과값 : 99
		System.out.println(instance5.attribute2); // 결과값 : -99.99
		ExampleClass1 instance6 = new ExampleClass1(100);
		System.out.println(instance6.attribute1); // 결과값 : 100
		System.out.println(instance6.attribute2); // 결과값 : -99.99
		
	}
}