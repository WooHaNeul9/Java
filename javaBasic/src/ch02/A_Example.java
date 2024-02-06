package ch02;

// GalaxyPhone

// 제조사 : (maker : String)
// 모델명 : (modelName : String)
// 소유자 : (owner : String)
// 전화번호 : (telNumber : String)
// 전원상태 : (power : boolean)

// 전원버튼누름 : (onPower : power 상태를 부정)
// 전화걸기 : (call : power가 true일 때 "(상대 전화번호)로 전화를 겁니다." 출력)
// 긴급전화걸기 : (emergency : "112로 전화를 겁니다." 출력)
// 휴대전화정보보기 : (getInfomation : power가 true일 때
// ===== (전화번호) =====
// 제조사 : (제조사)
// 모델명 : (모델명)
// 소유자 : (소유자)
//)

class GalaxyPhone {
	static String maker;
	String modelName;
	String owner;
	String telNumber;
	boolean power;
	
	void onPower() {
		power = !power;
	}
	
	void call(String toTelNumber) {
		if(power) { // power == true라는 표현은 사용하지 않음 => power 자체가 논리표현
		System.out.println(toTelNumber + "로 전화를 겁니다.");
		}
	}
	
	static void emergency() {
		System.out.println("112로 전화를 겁니다.");
	}
	
	void getInfomation() {
		if(power) {
			System.out.println("=====" + telNumber + "=====");
			System.out.println("제조사 : " + maker);
			System.out.println("모델명 : " + modelName);
			System.out.println("소유자 : " + owner);
		}
	}
}			

//---------------------------------------------------------------------------------------------//	

// Drama

// 방송사 : (boardcastingCompany : String)
// 제목 : (title : String)
// 배우 : (actors : String[])
// 장르 : (genre : String)
// 시청률 : (viewerRating : double)
// 부작 : (series : int)

// 정보보기 : (getInfomation)
// =====(title)=====
// 방송사 : (boardcatingCompany)
// 장르 : (genre)
// 부작 : (series)부작
// 시청률 : (viewerRating)%
// 배우 : (actor), (actor), (actor) ...  [전지현, 김수현, 박해진, 유인나 ...]

class Drama {
	String boardcastingCompany;
	String title;
	String[] actors;
	String genre;
	double viewerRating;
	int series;
	
	void getInfomation() {
		System.out.println("=====" + title + "=====");
		System.out.println("방송사 : " + boardcastingCompany);
		System.out.println("장르 : " + genre);
		System.out.println("부작 : " + series + "부작");
		System.out.println("시청률 : " + viewerRating + "%");
		// System.out.println("배우 : " + actors); 정답 확인 전 내가 작성한 코드
		System.out.print("배우 : ");
		for(int index = 0; index < actors.length ; index++) { // actors.length 배열의 길이만큼 반복

// 삼항 연산자 사용 전 코드 //
//---------------------------------------------------------------------------------------------//
//			System.out.print(actors[index]); // actors에 있는 index 값들을 출력  

//			// index 번호가 마지막 번호의 앞에 번호까지 ','가 나타나도록 조건문 작성			
//			if(index < actors.length - 1) {										
//				System.out.print(", ");													
//		}				
//---------------------------------------------------------------------------------------------//				
			
			//index < actors.length -1 이 true 이면 => actors[index] + ", "
			//index < actors.length -1 이 false 이면 => actors[index]
			System.out.print(index < actors.length - 1 ? actors[index] + ", " : actors[index]);
			
			// 위에 코드 깔끔하게 정리
			//String actor = index < actors.length - 1 ? actors[index] + ", " : actors[index];
			//System.out.println(actor);
		}
	}
}

//---------------------------------------------------------------------------------------------//	

// TriangleMath

// 빗변 구하기 : getHypotenuse
// 둘레 구하기 : getCircumference 
// sin 구하기 : getSin
// cos 구하기 : getCos
// tan 구하기 : getTan

class TriangleMath {
	
	//static final double PI = 3.14;
	
	// 인스턴스 메서드	
	static double getHypotenuse(int bottom, int height) {
		if(bottom <= 0 || height <= 0) {
			return 0;
		}
		//if(!(bottom > 0 && height > 0)) {
		//	return 0;
		//}
		
		double result = Math.pow(bottom, 2) + Math.pow(height, 2); // pow(변수, 제곱값)
				
		return Math.sqrt(result); // 제곱근 반환
	}
	
	static double getCircumference(int height, int bottom, int hypotenuse) {
		if(bottom <= 0 || height <= 0 || hypotenuse <= 0) {
			return 0;
		}
		
		return height + bottom + hypotenuse;
	}
	
	static double getSin(int height, int hypotenuse) {
		if(height <= 0 || height <= 0) {
			return 0;
		}
		
		return height / hypotenuse;
	}
	
	static double getCos(int bottom, int height) {
		if(bottom <= 0 || height <= 0) {
			return 0;
		}
		
		return height / bottom;
	}
	
	static double getTan(int height, int bottom) {
		if(bottom <= 0 || height <= 0) {
			return 0;
		}
		
		return height / bottom;
	}
}

//---------------------------------------------------------------------------------------------//	

public class A_Example {

	public static void main(String[] args) {
		
		// 인스턴스 정의
		GalaxyPhone S23 = new GalaxyPhone();
		GalaxyPhone S24 = new GalaxyPhone();
		
		GalaxyPhone.maker = "LG"; // S23랑 S24를 LG로 고정, static 함수가 아닌 인스턴스 변수에는 영향을 주지않음
		
		//초기화
		//S23.maker = "삼성"; // 인스턴스 변수로 선언하면 출력 시 '삼성'으로 바껴서 출력됨
		S23.modelName = "S23";
		S23.owner = "홍길동";
		S23.telNumber = "010-0000-0000";
		S23.power = false;
		
		//S24.maker = "삼성";
		S24.modelName = "S24";
		S24.owner = "김철수";
		S24.telNumber = "010-1234-5678";
		S24.power = false;

		S23.onPower(); // 전원버튼 on
		S24.onPower();
		S24.getInfomation();
		
		GalaxyPhone.emergency();
		//S23.emergency();
		//S24.emergency();		
		
//---------------------------------------------------------------------------------------------//	
		
		//인스턴스 정의
		Drama star = new Drama();
		
		// 배열 초기화 (정답 확인 전 내가 작성한 코드)
		// String[] actors = {"전지현", "김수현", "박해진", "유인나"}; 
		
		// 초기화
		star.title = "별에서 온 그대";
		star.boardcastingCompany = "SBS";
		star.genre = "로맨스";
		star.series = 21;
		star.viewerRating = 28.1;
		
		// star.actors = actors; 정답 확인 전 내가 작성한 코드
		star.actors = new String[] {"전지현", "김수현", "박해진", "유인나"} ;
		
		// 출력
		star.getInfomation();
		System.out.println();
		
		// 변수, 메서드 차이 : ()가 있고 없고 차이
		//star.title; => 변수
		//star.getInfomation(); => 메서드
		
//---------------------------------------------------------------------------------------------//	

		// 생성자
		TriangleMath triangleMath = new TriangleMath();
		
		double bit = triangleMath.getHypotenuse(3, 4);
		System.out.println(bit); // 결과값 : 5.0
		
		//System.out.println(TriangleMath.PI);
		//triangleMath.PI = 0.0;
	}
}