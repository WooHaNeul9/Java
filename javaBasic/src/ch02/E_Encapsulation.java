package ch02;

// 캡슐화 : 멤버 변수(속성)와 메서드를 묶어서 변수에 대한 조작을 메서드를 통해서만 할 수 있도록 하는 것
// 정보은닉과 데이터 보호, 데이터 무결성을 보장할 수 있음

class FootballPlayerB {
	
	private String name;
	private String team;
	private int goal;
	private String birth;
	
	FootballPlayerB(String name, String team, int goal, String birth) {
		this.name = name;
		this.team = team;
		this.goal = goal;
		this.birth = birth;
	}
	
	// getter
	String getName() {		
		return this.name; // = return name 
	}
	
	String getTeam() {		
		return team; // = return this.team 
	}
	
	int getGoal() {		
		return goal; // = return this.goal 
	}
	
	String getBirth() {
		return birth; // = return this.birth 
	}
	
	// setter : 선언된 코드를 변경하려고 할 때 하는 작업
	// 바꾸고자하는 매개변수를 가져오면됨
	// setter 메서드는 반환타입이 void
	void setName(String name) {
		this.name = name; 
	}
	
	void setTeam(String team) {
		this.team = team; 
	}
	
	void setGoal(int goal) {
		if(goal < 0) {
			return; // if문 선언하지 않을 시 무결성이 보장되지 않음
		}
		this.goal =  goal; 
	}
	
//	void setBirth(String birth) { => 절대 바뀌지 않는 것은 setter 선언하지 않음
//		
//		this.birth = birth; 
//	
//	}
	
}

class FootballPlayerC {
	
	private String name;
	private String team;
	private int goal;
	private String birth;	
	
	FootballPlayerC(String name, String team, int goal, String birth) {
		//super(); // Object 생성자 상위 클래스 상속받은 것 => 지워도 되고 안 지워도 됨
		this.name = name;
		this.team = team;
		this.goal = goal;
		this.birth = birth;
	}
	
	String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	String getTeam() {
		return team;
	}
	
	void setTeam(String team) {
		this.team = team;
	}
	
	int getGoal() {
		return goal;
	}
	
	void setGoal(int goal) {
		this.goal = goal;
	}
	
}

public class E_Encapsulation {

	public static void main(String[] args) {
		
		FootballPlayerB son = new FootballPlayerB("손흥민", "토트넘 홋스퍼", 0, "8888");
		
//		son.name = "손흥민";
//		son.team = "토트넘 홋스퍼";
//		son.goal = 0;
		
		son.setGoal(-1); // 값이 반환되지 않음
		
		System.out.println(son.getName()); // 결과값 : 손흥민
		System.out.println(son.getTeam()); // 결과값 : 토트넘 홋스퍼
		System.out.println(son.getGoal()); // 결과값 : 0
	
	}
}