package ch01;

public class B_DataType {

	public static void main(String[] args) {
		
		// 기본형 데이터 타입
		
		// 정수형 데이터 타입 (실수부가 없는 정수를 나타냄)
		
		// byte : 1byte(8bit)의 크기를 가지는 정수형 데이터 타입
		// -128 ~ 127
		byte byte1 = 127;
		//byte byte2 = 128; 범위를 벗어나므로 컴파일 에러 발생, 벗어난 값이 어딘가에 저장될 때 int 타입으로 저장됨
		
		// short : 2byte(16bit)의 크기를 가지는 정수형 데이터 타입
		// -32768 ~ 32767
		short short1 = 32767;
		//short short2 = 32768;
		
		// int : 4byte(32bit)의 크기를 가지는 정수형 데이터 타입
		// -2147483648 ~ 2147483647
		int int1 = 2_147_483_647;
		//int int2 = 2_147_483_648; 범위가 벗어난 값들은 int 타입으로 저장되는데 int 타입을 벗어나면 에러발생
		
		// long : 8byte(64bit)의 크기를 가지는 정수형 데이터 타입
		long long1 = 2_147_483_648L; // long 타입으로 저장해라는 의미
		
//---------------------------------------------------------------------------------------------//
		
		// 실수형 데이터 타입 (실수부를 가지는 데이터 타입)
		
		// float : 4byte(32bit)의 크기를 가지는 실수형 데이터 타입
		// 소수점 6-7 자리에서 오차가 발생
		float float1 = 3.1415926535F; // F: float 타입으로 저장해라는 의미
		System.out.println(float1);
		
		// double : 8byte(64bit)의 크기를 가지는 실수형 데이터 타입
		// 소수점 15-17 자리에서 오차가 발생
		double double1 = 3.1415926535;
		System.out.println(double1);

//---------------------------------------------------------------------------------------------//
		
		// 문자형 데이터 타입 (문자 하나를 저장할 수 있는 데이터 타입)
		// char : 2byte(16bit)의 크기를 가지는 문자형 데이터 타입
		// 범위 : 0 ~ 65,535
		char char1 = 'a';
		char char2 = 97; //아스키코드 값
		System.out.println(char1);
		System.out.println(char2);

//---------------------------------------------------------------------------------------------//
		
		// 논리형 데이터 타입 (참과 거짓 값을 가지는 데이터 타입)
		// boolean : 1byte(8bit)의 크기를 가지는 논리형 데이터 타입
		// true, false
		boolean boolean1 = true;
		boolean boolean2 = false;
		
//---------------------------------------------------------------------------------------------//
		
		// 형변환 : 데이터 타입이 서로 다른 변수를 옮겨 닮는 것
		
		// 자동 형변환 (묵시적 형변환) : 작은 데이터 타입의 변수를 큰 데이터 타입의 변수에 옮겨 닮을 때 발생
		int number = 10; //int : 4byte
		long longNumber = number; //long : 8byte
		
		// 강제 형변환 (명시적 형변환) : 큰 데이터 타입의 변수를 작은 데이터 타입의 변수에 옮겨 닮을 때 발생
		// 할당하고자 하는 큰 데이터 타입 변수 앞에 (작은 데이터 타입)을 붙여줌
		number = (int)longNumber; //8byte 타입의 longNubmer를 4byte 타입의 number에 값을 넣으려고 하면 에러 발생 => 그래서 강제 형변환해줘야함
		
		number = 129;
		byte byteNumber = (byte)number;
		System.out.println(byteNumber); //결과값 : 129가 아닌 -127 출력 => 데이터손실 발생
		
		short shortNumber = 97;
		char character = 97;
		//shortNumber = character; short와 char은 같은 2byte이지만 부호가 들어가고 안 들어가고의 차이때문에 에러발생
		
		int intNumber = 100;
		float floatNumber = 100;
		//intNumber = floatNumber; 같은 타입이더라도 정수부와 실수부의 차이때문에 에러발생
		
//---------------------------------------------------------------------------------------------//
		
		//******************중요중요중요중요중요******************//
		
		// 배열 : 동일한 타입의 변수를 묶어 저장하는 컨테이너
		// new 연산자를 이용해서 생성을 해야함
		// 한번 생성된 배열의 크기는 변경할 수 없음
		// 선언 방법 : 데이터타입[] 변수명(배열명);
		// 생성 방법 : 변수명 = new 데이터타입[크기];
		int[] numbers;
		numbers = new int[5]; //numbers에 5개 배열을 생성
		System.out.println(numbers); // 결과값 : [I@36aa7bc2
		System.out.println(numbers[0]); // 결과값 : 0
		
		int[] numbers2 = {1, 2, 3, 4, 5}; //초기화
		int[] numbers3 = new int[] {1, 2, 3, 4, 5}; //생성과 동시에 초기화, 변수의 주소값을 가지고감
		System.out.println(numbers2); // 결과값 : [I@76ccd017
		System.out.println(numbers3); // 결과값 : [I@182decdb
		
		// 배열의 요소에 접근할 땐 '인덱스'를 사용함
		// 인덱스는 0번부터 시작, 마지막 인덱스는 길이-1번
		int item = numbers2[0];
		System.out.println(item); // 결과값 : 1
		item = numbers[0];
		System.out.println(item); // 결과값 : 0 => numbers 안에는 값을 초기화해주지 않았음 그래서 결과값이 0으로 나옴
		numbers[0] = 99;
		System.out.println(item); // 결과값 : 0 => item 값을 99로 재할당을 하지 않았기 때문, numbers의 0번째 요소에만 99를 넣은것
		item = numbers[0]; // 재할당
		System.out.println(item); // 결과값 : 99 => item 값을 99로 재할당하였기 때문
		System.out.println(numbers[0]); // 결과값 : 99
		
		// 인덱스 번호를 초과하는 인덱스에 접근할 시 예외발생
		// System.out.println(numbers[5]);
		
		System.out.println(numbers); //numbers = {99, 0, 0, 0, 0} => 배열의 값이 아니라 , [I@36aa7bc2 이라는 주소값이 들어가 있음
		
		// numbers2 = {99, 0, 0, 0, 0} => 배열의 값이 아니라 , [I@36aa7bc2 이라는 주소값이 들어가 있음
		numbers2 = numbers; // 같은 배열을 바라보고 있음
		
		numbers[4] = -99; // numbers = {99, 0, 0, 0, -99} numbers2 = {99, 0, 0, 0, -99}
		System.out.println(numbers2[4]); // 결과값 : -99
		
		int number1 = 0;
		int number2 = number1;
		number1 = -99;
		System.out.println(number1); // 결과값 : -99 => number1을 0으로 초기화하고 다시 -99로 재할당
		System.out.println(number2); // 결과값 : 0 => number1을 0으로 초기화하고 number2도 number1과 같은 값을 가지도록 선언

//---------------------------------------------------------------------------------------------//
		
		//문자형 배열
		char[] chars1 = {'a', 'p', 'p', 'l', 'e'};
		System.out.println(chars1); // 결과값 : apple
		
		// String : 문자열을 표현하는데 사용되는 참조형 데이터 타입
		// 문자열을 다루는데 유용한 여러가지 기능을 제공해주고 있음
		String string1 = "apple"; //char[] chars1 = {'a', 'p', 'p', 'l', 'e'}; 같은 의미임
		
		// String의 주요 기능
		String statement = "  My name is ironman  ";
		
		// 1. 문자열 결합
		// + 혹은 concat(문자열)으로 두 문자열을 연결할 수 있음
		System.out.println(statement + "!!!"); // 결과값 :  My name is ironman  !!!
		System.out.println(statement.concat("???")); // 결과값 :  My name is ironman  ???
		
		// 2. 문자열 비교
		// equals(문자열) : 두 문자열이 동등한지 비교
		// compareTo(문자열) : 두 문자열이 사전순으로 비교
		// compareToIgnoreCase(문자열) : 대소문자 구분없이 사전순으로 비교
		System.out.println(statement.equals("My name is hulk")); // 결과값 : false
		System.out.println(statement.equals("My name is ironman")); // 결과값 : false
		System.out.println(statement.compareTo("Apple")); // 결과값 : -33
		System.out.println(statement.compareTo("apple")); // 결과값 : -65
		System.out.println(statement.compareToIgnoreCase("apple")); // 결과값 : -65
		
		// 3. 문자열 길이
		// length() : 문자열의 길이를 반환
		System.out.println(statement.length()); // 결과값 : 22 띄워쓰기 포함
		
		// 4. 문자엷 변환
		// toUpperCase() : 모든 문자를 대문자로 변경
		// toLowerCase() : 모든 문자를 소문자로 변경
		// trim() : 문자열의 앞,뒤 공백을 모두 제거함
		System.out.println(statement.toUpperCase()); // 결과값 :  MY NAME IS IRONMAN  
		System.out.println(statement.toLowerCase()); // 결과값 :  my name is ironman  
		System.out.println(statement.trim()); // 결과값 :My name is ironman
		
		// 5. 문자열 찾기
		// indexOf(문자열) : 찾고자하는 문자열의 처음 찾은 위치의 인덱스 번호를 반환
		// lastIndexOf(문자열) : 찾고자하는 문자열의 마지막으로 찾은 인덱스 번호를 반환
		statement = "내가 그린 기린 그림은 잘 그린 기린 그림이고 네가 그린 기린 그림은 잘못 그린 기림 그림이다.";
		System.out.println(statement.indexOf("그림")); // 결과값 : 9
		System.out.println(statement.indexOf("하마")); // 결과값 : -1
		System.out.println(statement.lastIndexOf("그림")); // 결과값 : 48
		System.out.println(statement.lastIndexOf("하마")); // 결과값 : -1
		
		// 6. 부분 문자열 
		// substring(시작 인덱스), substring(시작 인덱스, 종료 인덱스) : 문자열을 원하는 크기만큼 추출
		System.out.println(statement.substring(48)); // 결과값 : 그림이다.
		System.out.println(statement.substring(3, 10)); // 결과값 : 그린 기린 그

//---------------------------------------------------------------------------------------------//
		
		// null : 아직 어떠한 값도 지정되지 않은 상태
		String string2 = null;
		//System.out.println(string2.substring(48)); // 결과값 : 예외발생 => null로 선언해놨는데 substring을 사용했기 때문
		// 참조 변수는 주소값을 가지고 있음
	}	
}
