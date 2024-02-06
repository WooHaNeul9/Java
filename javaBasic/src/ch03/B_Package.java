package ch03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class B_Package {

	public static void main(String[] args) {
		
		// wrapper 클래스 : 기본형 데이터 타입을 참조형 데이터 타입으로 다룰 수 있도록 하는 클래스
		// 일반적으로 기본형 데이터 타입의 풀네임에 첫글자를 대문자로 지정하면 Wrapper 클래스가 됨
		Integer wrapperInt = 10;
		Double wrapperDouble = 10.0;
		Boolean wrapperBoolean = false;
		String wrapperString = "String";
		
		// 자주 사용하는 기능
		// 1. parse 메서드 : 문자열을 특정 타입으로 변환
		int number = Integer.parseInt("123"); // 문자열 123을 숫자 123으로 변환
		
		// 2. toString 메서드 : 특정 타입의 값을 문자열로 변환
		String string = Integer.toString(123); // 숫자 123을 문자열 123으로 변환
		
//-------------------------------------------------------------------------------//
		
		// Collection Framework : java에서 데이터 구조에 대한 표준화된 기법을 제공함
		// 배열은 크기를 정해놓으면 그 크기에 맞도록 선언을 해야하며 크기를 초과하면 안됨
		// 배열의 문제를 해결하기 위해서 Collection Framework를 사용함
				
		// List : 데이터를 저장할 때 중복을 허용하고 순서가 존재함 => 인덱스로 접근할 수 있음
		// List는 인터페이스임
		// List<E> : E 자리에 어떤 타입의 List를 만들 것인지 선언, 참조형 데이터 타입만 들어와야함
		List<Integer> arrayList; // 정수 형태의 배열 생성할 수 있음 => int[] arrayList;
		//List<Object> arrayList; // 모든 타입을 요소로 사용할 수 있음, 웬만하면 사용 안하는게 좋음
		//List arrayList; 제너릭 타입을 추가하지 않아도 모든 타입을 요소로 사용할 수 있음
		
		// 1. ArrayList : 가장 많이 사용함, List 중에서 내부 배열을 사용하여 인덱스를 사용한 검색이 빠름
		arrayList = new ArrayList<>(); // 이걸 더 자주 사용함
		System.out.println(arrayList); // 결과값 : []
		
		// 2. LinkedList : 이중 연결 기법을 사용하여 추가, 삭제가 빠름
		arrayList = new LinkedList<>();
		
		// add() : List에 요소를 추가하는 것
		// 추가할 요소의 데이터 타입은 반드시 제너릭으로 지정한 타입으로만 추가 가능
		arrayList.add(10); // <>에 지정해놓은 타입으로만 추가해야함
		System.out.println(arrayList); // 결과값 : [10]
		//arrayList.add("add"); // ( X ) => String 타입을 사용하려면 List<Object> arrayList; or List arrayList; 선언하여 사용하면됨
		arrayList.add(20);
		arrayList.add(30);
		System.out.println(arrayList); // [10, 20, 30]
		
		// get() : List의 특정 인덱스 요소에 접근
		// 1. List 인덱스 범위를 초과하는 인덱스를 지정할 수 없음
		// 2. 기본형 데이터 타입의 변수로 반환값을 받을 경우 null 값을 받을 수 있음을 주의 => 참조형 변수는 null 값을 받을 수 있지만 기본 타입은 null 값을 받을 수 없음
		int arrayElement = arrayList.get(0);
		// int arrayElement = arrayList.get(1); => 에러발생 : 첫번째 요소가 없기 때문
		System.out.println(arrayElement); // 결과값 : 10
		// List<Integer> arrayList;로 선언했을 시, int arrayElement = arrayList.get(0); 컴파일 에러 발생 => int arrayElement = (Integer)arratList.get(0);으로 강제 형변환하여 사용 가능하긴함
						
		// Set() : List의 특정 인덱스 요소를 변경
		// arrayList.set(인덱스,요소);
		// List 인덱스 범위를 초과하는 인덱스를 지정할 수 없음
		arrayList.set(0,50);
		System.out.println(arrayList); // 결과값 : [50, 20, 30]
		
		// remove() : List의 특정 요소를 삭제
		arrayList.remove(0);
		System.out.println(arrayList); // 결과값 : [20, 30]
		
		// size() : List의 길이를 반환
		System.out.println(arrayList.size()); // 결과값 : 2
		
		System.out.println("======================================");

//-------------------------------------------------------------------------------//
		
		// Set : 데이터를 저장할 때 중복을 허용하지 않고 순서가 존재하지 않음 (= 집합)
		// 인덱스로 접근할 수 없음
		// Set<E>
		Set<String> set;		
		
		// HashSet : 해싱 기법을 사용해서 검색 속도가 빠름
//		set = new HashSet<>();
				
		// TreeSet : 요소를 정렬해서 추가
		set = new TreeSet<>();
		
		// add() : Set에 요소를 추가
		// 동일한 요소가 이미 추가되어있다면 추가하지 않음
//		set.add("Apple");
//		System.out.println(set); // 결과값 : [Apple]
//		set.add("Banana");
//		System.out.println(set); // 결과값 : [Apple, Banana]
//		set.add("Banana");
//		System.out.println(set); // 결과값 : [Apple, Banana] => Banana가 이미 존재하는 중복된 값이라서 추가되지 않음
		
//		set.add("Banana");
//		System.out.println(set); // 결과값 : [Banana]
//		set.add("Apple");
//		System.out.println(set); // 결과값 : [Apple, Banana]
//		set.add("Banana1");
//		System.out.println(set); // 결과값 : [Banana1, Apple, Banana] => 그냥 HashSet을 사용시 순서가 섞여서 나옴
		
		set.add("Banana");
		System.out.println(set); // 결과값 : [Banana]
		set.add("Apple");
		System.out.println(set); // 결과값 : [Apple, Banana]
		set.add("Banana1");
		System.out.println(set); // 결과값 : [Apple, Banana1, Banana1] => TreaSet 사용시 순서가 올바르게 나옴
		
		// remove() : Set에서 특정 요소를 제거
		// 제거하고자 하는 요소가 없더라도 예외가 발생하지 않음
		set.remove("Apple");
		System.out.println(set); // 결과값 : [Banana, Banana1]
		
		// contains() : Set에서 특정 요소가 존재하는지 확인
		System.out.println(set.contains("Apple")); // 결과값 : false => 위에서 Apple 지움
		System.out.println(set.contains("Banana")); // 결과값 : true
		
		System.out.println("======================================");
		
//-------------------------------------------------------------------------------//
		
		// Map : 키와 값이 한쌍으로 이루어진 요소들의 집합
		// 키는 중복 불가능, 값은 중복 가능
		// Map<K, V>;
		Map<String, String> map;
		
		// HashMap : 해싱 기법으로 키의 검색 속도가 빠름
//		map = new HashMap<>();
		
		
		// TreeMap : 키를 정렬하여 저장
		map = new TreeMap<>();
		
		// put() : Map에 키와 값을 추가
		// 만약 동일한 키가 존재한다면 해당 키의 값을 변경함
//		map.put("Apple", "사과");
//		System.out.println(map); // 결과값 : {Apple=사과}
//		map.put("Banana","바나나");
//		System.out.println(map); // 결과값 : {Apple=사과, Banana=바나나}		
//		map.put("Apple", "링고");
//		System.out.println(map); // 결과값 : {Apple=링고, Banana=바나나}
//		map.put("Banana1", "바나나");
//		System.out.println(map); // 결과값 : {Banana1=바나나, Apple=링고, Banana=바나나} => 똑같은 값을 가질 수 있음, HashMap 사용시 정렬이 안되어 있음
		
		map.put("Apple", "사과");
		System.out.println(map); // 결과값 : {Apple=사과}
		map.put("Banana","바나나");
		System.out.println(map); // 결과값 : {Apple=사과, Banana=바나나}		
		map.put("Apple", "링고");
		System.out.println(map); // 결과값 : {Apple=링고, Banana=바나나}
		map.put("Banana1", "바나나");
		System.out.println(map); // 결과값 : {Banana=바나나, Apple=링고, Banana1=바나나} => 똑같은 값을 가질 수 있음, HashMap 사용시 정렬되어 있음
		
		// get() : Map에서 특정 키를 가지는 요소를 반환
		// 존재하지 않는 키로 검색할 경우 null을 반환
		System.out.println(map.get("Apple")); // 결과값 : 링고
		System.out.println(map.get("아아")); // 결과값 : null
		
		// remove() : Map에서 특정 키를 가지는 요소를 제거
		// 없는 값을 지울려고 하면 아무 변화 일어나지 않음
		// remove 작업에 성공하면 해당 키의 값을 반환
		map.remove("Apple");
		System.out.println(map); // 결과값 : {Banana=바나나, Banana1=바나나}
	
		System.out.println(map.remove("Banana")); // 결과값 : 바나나 => Set에서는 remove를 하면 true,false를 반환하는데, Map에서는 값을 반환함(= pop한다)

//-------------------------------------------------------------------------------//					

		class Human {
			String name;
			String address;		
			int age;
		}
		
		Human human1 = new Human();
	
		human1.name = "홍길동";
		human1.address = "부산광역시 진구";
		human1.age = 10;
		
		System.out.println(human1.name); // 결과값 : 홍길동
		System.out.println(human1.address); // 결과값 : 부산광역시 진구
		System.out.println(human1.age); // 결과값 : 10
		// name = "홍길동"
		// address = "부산광역시 진구"
		
// 		class에 age가 없을 시 ( O )
//		Map<String,String> human2 = new HashMap<>();
//		human2.put("name","홍길동");
//		human2.put("address","부산광역시 진구");
//		System.out.println(human2); // 결과값 : {address=부산광역시 진구, name=홍길동}
		
//		class에 age가 있을 때 ( X )
		Map<String,Object> human2 = new HashMap<>();
		human2.put("name","홍길동");
		human2.put("address","부산광역시 진구");
//		human2.put("age", 10);
		human2.put("age", "열살"); // Object는 모든 값이 들어갈 수 있음 
		System.out.println(human2); // 결과값 : {address=부산광역시 진구, name=홍길동, age=열살}
		
		// 문제점
		// 1. 사용 혹은 추가할 때 오타(실수)에 대한 가능성 발생
		human2.get("nmae");
		// 2. 타입의 안전성의 문제 발생
		// Integer age = (Integer)human2.get("age");
				
		System.out.println("======================================");		
		
	}
}