package javaPlusStudy;

// class : 공통적인 성질을 가진 대상들을 정의, 현실 세계 주체의 정보를 표현하는 방법
// 선언방법 : 접근제어자 일반제어자 class 클래스명 {...}
class ClassName {
	// 속성 : 현실 세계의 주체가 가질 수 있는 정보나 상태 => 변수 형태로 표현	
	// 기능 : 현실 세계의 주체가 행할 수 있는 동작,행동 => 메서드 형태로 표현
	
	// 생성자 : 인스턴스를 생성할 때 실행될 작업을 정의한 특별한 메서드
	// 인스턴스를 초기화하는 용도로 작성
	// 클래스명과 동일한 이름으로 작성, 반환타입이 없음
	// 생성자를 개발자가 작성하지 않으면 자바 컴파일러가 자동으로 기본 생성자를 생성함
	// 개발자가 생성자를 작성하면 자동으로 기본 생성자를 만드는 행위를 컴파일러가 하지않음
	ClassName () {
		
	}
	
	// 오버로딩 : 같은 이름의 메서드를 매개변수의 조합만 다르게 하여 여러개 정의하는 것
}

// 이력서 표현 (Resume)
class Resume {
	String koreaName;
	String englishName;
	String contact;
	String email;
	String address;
	String profileImage;
	
	String writeDate;
	String writer;
	
//	// 학력사항
//	String period;
//	String schoolName;
//	String major;
//	double credit;
//	double totalCredit;
//	boolean isGraduation;
//	
//	// 위에 작성된 여러개의 속성들로 선언되어있던 코드를 밑의 코드처럼 관리하기 편하도록 작성하여 표현
//	EducationHistory EducationHistory1;
//	EducationHistory EducationHistory2;
//	EducationHistory EducationHistory3;
//	EducationHistory EducationHistory4;
//	EducationHistory EducationHistory5;
	
	//위에 작성된 여러개의 클래스들을 배열로 표현하여 쉽게 관리
	EducationHistory[] EducationHistorys;
	ExperienceHistory[] ExperienceHistorys;
	Certificate[] Certificates;
	
	// 구현부에 여러개의 코드를 작성했을 시 발생하는 문제를 해결하기 위해 생성자를 이용하여 코드 작성
	// 무조건 매개변수에 입력된 값들을 작성하도록 생성
	Resume (String koreaName, String englishName,String contact, String email, String profileImage) {
		this.koreaName = koreaName;
		this.englishName = englishName;
		this.contact = contact;
		this.email = email;
		this.profileImage = profileImage; 
	}
								
}								

// 학력사항								
class EducationHistory { 
	String period;
	String schoolName;
	String major;
	double credit;
	double totalCredit;
	boolean isGraduation;

	// 무조건 매개변수에 입력된 값들을 작성하도록 생성
	EducationHistory(String period, String schoolName, String major, double credit, double totalCredit, boolean isGraduation) {		
		this.period = period;
		this.schoolName = schoolName;
		this.major = major;
		this.credit = credit;
		this.totalCredit = totalCredit;
		this.isGraduation = isGraduation;
	}
}

// 경력사항
class ExperienceHistory {
	String period;
	String workPlace;
	String position;
	String busimnessDetail;
	
	// 무조건 매개변수에 입력된 값들을 작성하도록 생성
	ExperienceHistory(String period, String workPlace, String position, String busimnessDetail) {		
		this.period = period;
		this.workPlace = workPlace;
		this.position = position;
		this.busimnessDetail = busimnessDetail;
	}
}

// 자격증
class Certificate {
	String acquistitionDate;
	String name;
	String level;
	String issuePlace;
}

class User {
	String id;
	String password;
	String name;
}

// class : 회원관리
class UserManagement {
	// 회원등록
	void userRegist(String id, String password, String name) {
		// 회원 등록 작업
	}
	
	// 회원 정보보기
	User getUser(String id) {
		return new User();
	}
	
	// 회원 정보수정
	void userUpdate(String id, String password, String name) {
		// 회원 수정 작업
	}
	
	// 회원 정보삭제
	void userDelete(String id) {
		// 회원 삭제 작업
	}
}

public class A_Class {

	public static void main(String[] args) {
		
		Resume sky = new Resume("우하늘", "WooHaNeul", "010-0000-0000", "부산", "이미지 주소");
		
//		sky.koreaName = "우하늘";
//		sky.englishName = "WooHaNeul";
//		sky.contact = "010-0000-0000";
//		sky.address = "부산";
//		sky.profileImage = "이미지 주소";
		
		Resume sky2 = new Resume("우하늘2", "WooHaNeul2", "010-0000-0002", "부산2", "이미지 주소2");
		
	}
}