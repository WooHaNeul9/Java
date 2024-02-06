package ch02;

// 추상 클래스 : 추상 메서드를 포함할 수 있는 클래스
// 추상 클래스 자체로 인스턴스를 생성할 수 없음, 반드시 추상 클래스를 상속한 하위 클래스로 인스턴스를 생성해야함
// 추상 클래스 선언 방법 : abstract class 추상클래스명 { }

// 추상 메서드 : 선언부만 존재하고 구현부는 존재하지 않는 메서드
// 부모 클래스에서 기능을 정의만 하고 구현은 상속 관계인 자식 클래스에서 하도록 설계한 것
// 반드시 추상 클래스를 상속받은 하위 클래스에서 오버라이딩해서 구현해야함
// 추상 메서드 선언 방법 : abstract 반환타입 추상메서드명 (매개변수);

//---------------------------------------------------------------------------------------------//

// Player

//=====속성=====//
// 이름 : 문자열
// 종족 : 문자열
// 성별 : 문자열
// 경험치 : 정수

//=====기능=====//
// 대화 => 입력 : (메세지 - 문자열) / 출력 : void
// 사냥 => 입력 : (수치 - 정수) / 출력 : (경험치 - 정수)

abstract class Player {
	
	String name;
	String species;
	String gender;
	double experience;	
	
	// 추상 클래스에서도 생성자를 만들 수는 있지만 하위 클래스에서 호출하는 용도로만 사용
	Player(String name, String species, String gender, double experience) {
		super();
		this.name = name;
		this.species = species;
		this.gender = gender;
		this.experience = experience;
	}

	final void chat(String message) {
		System.out.println(this.name + " : " + message);
	}

	// abstract 선언으로 추상화하겠다. 나중에 선언하겠다. 라는 것을 표현 
	abstract double hunt(int figure);

}

class Dealer extends Player {
			
	Dealer(String name, String species, String gender, double experience) {
		super(name, species, gender, experience);
	}

	double hunt(int figure) {
		System.out.println(figure + "만큼의 공격을 했습니다.");
		this.experience += (figure * 0.8);
		
		return experience;
	}	

}

class Tanker extends Player {

	Tanker(String name, String species, String gender, double experience) {
		super(name, species, gender, experience);
	}

	@Override
	double hunt(int figure) {
		System.out.println(figure + "만큼의 공격을 받습니다.");
		this.experience += figure;
		return this.experience;
	}

}

public class F_Abstract {

	public static void main(String[] args) {
		
		// 추상 클래스는 인스턴스를 생성할 수 없음 => static 클래스 생성
		// Player player = new Player(); // 변수의 타입으로는 쓸 수 있음
		
		// 반드시 추상 클래스를 상속하여 구현한 하위 클래스로 인스턴스를 생성
		Dealer dealer = new Dealer("이름", "인간", "남", 0);
		
	}

}