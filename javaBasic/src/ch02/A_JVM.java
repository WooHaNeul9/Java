package ch02;

class ExampleClass2 {
	static int number = 3;
	double doubleNumber;
	
	Sample1 method() {
		Sample1 sample = new Sample1();
		sample.data = -456;
		
		return sample;
	}
	
	static void staticMethod() {
		
	}
}

class Sample1 {
	int data;
	
	Sample1() {}
	
	Sample1 (Sample1 sample) {
		this.data = sample.data;
	}
	
}

public class A_JVM {
	
	public static void main(String[] args) {
		
		ExampleClass2 instance1 = new ExampleClass2();
		ExampleClass2 instance2 = new ExampleClass2();
		
		Sample1 sample = new Sample1();
		sample.data = 8;
		
		int number = 0;
		instance1.doubleNumber = 9.9;

		sample = instance1.method();
		System.out.println(sample.data); // 결과값 : -456
		
		int number2 = number;
		number2++;
		System.out.println(number); // 결과값 : 0
		System.out.println(number2); // 결과값 : 1

		Sample1 sample2 = sample;
		sample2.data++;
		System.out.println(sample.data); // 결과값 : -455
		System.out.println(sample2.data); // 결과값 : -455
				
		Sample1 sample3 = new Sample1(sample);
		System.out.println(sample.data); // 결과값 : -455
		System.out.println(sample3.data); // 결과값 : -455
		
		sample3.data++;
		System.out.println(sample.data); // 결과값 : -455
		System.out.println(sample3.data); // 결과값 : -454
				
//		Sample1 sample = new Sample1();
//		sample.data = 0;

		
		
//---------------------------------------------------------------------------------------------//					

//=============================================================================================//
// arg 부분에 대한 JVM
		
//		void method(int arg) {
//			arg++;
//			System.out.println("method in : " + arg); // 결과값 : 1
//		}

//=============================================================================================//
		
//		instance1.method(number); // int number 작업의 number 값이 복사되어 0을 보이고 위의 method arg를 1 증가시켜서 값을 반환함		
//		System.out.println(number); // 결과값 : 0
		
//---------------------------------------------------------------------------------------------//	

		
		
		
		
//=============================================================================================//
// arg.data 부분에 대한 JVM
		
//		void method(Sample1 arg) {
//			arg.data++;
//			System.out.println("method in : " + arg.data); // 결과값 : 1
//		}

//=============================================================================================//
		
//		instance1.method(sample);
//		System.out.println(sample.data); // 결과값 : 1

//---------------------------------------------------------------------------------------------//	
	
		
		
		
		
//=============================================================================================//
				
//		int method() {
//			int number = 99;
//		
//			return number;
//	}

//=============================================================================================//
				
//		number = instance1.method();
//		System.out.println(number); // 결과값 : 99

//---------------------------------------------------------------------------------------------//			
	}
}
