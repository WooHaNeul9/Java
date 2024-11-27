# Java

> ### 할당 연산자 
= : 값을 대입 (a = 5)

> ### 비교 연산자
== : 값을 비교 (a == b)

---

> ### 형변환
##### 1. 문자 - 숫자
- Integer.parseInt(변환할 변수) // int 타입으로 변환
- Integer.valueOf(변환할 변수)  // Integer 객체로 변환
- Double.valueOf(변환할 변수)   // Double 객체로 변환
- Float.valueOf(변환할 변수)    // Float 객체로 변환
- Long.valueOf(변환할 변수)     // Long 객체로 변환
- Short.valueOf(변환할 변수)    // Short 객체로 변환
##### 2. 숫자 - 문자
- String.valueOf(변환할 변수)   // 숫자를 문자열(String)로 변환
- Integer.toString(변환할 변수) // 숫자를 문자열(String)로 변환
##### 3. 정수 - 실수
### 3. 정수 ↔ 실수
- 정수 → 실수: (double)num, (float)num
- 실수 → 정수: (int)num (소수점 제거)
- 실수 → 정수(반올림): (int)Math.round(num)

> ### 문자열 배열
String[] numArr = num_str.split("") //문자열을 한 글자씩 나눠 배열로 변환

for(String num : numArr) { // 배열의 각 요소(문자)를 순회
    answer += Integer.perseInt(num); // 문자를 숫자로 변환 후, 누적 합산
}

> ### 문자열 인덱스
- charAt(i) : 문자열의 i번째 인덱스에 해당하는 문자를 가져오는 메서드
- substring(시작 인덱스, 마지막 인덱스) : 시작 인덱스부터 마지막 인덱스-1 문자열 반환
- substring(시작 인덱스) : 시작 인덱스부터 끝까지의 문자열 반환