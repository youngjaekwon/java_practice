package arithmetic;

// 자동정렬 : ctrl + A (전체 블럭 잡기) + ctrl + shift + F (자동정렬)
public class ArithmeticOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 대입/할당 연산자 (assignment operator) : 변수 = 데이터 : 컴퓨터에서 같다는 == 으로 표기
		 * 
		 * 산술 연산자 (+, -, *, /, %) : x % y : x를 y로 나누었을 때 나머지 값 ex) 3 % 5 == 3 ex) 5 % 3
		 * == 2 ex) 10 % 6 = 4 ex) 2 % 4 = 2
		 * 
		 * when? 배수 x % 2 == 1 (ex) 1, 3, 5, 7, ... x는 홀수) x % 2 == 0 (ex) 2, 4, 6, 8,
		 * ... x는 짝수)
		 * 
		 * x % 5 == 0 (x는 5의 배수) x % 16 == 0 (x는 16의 배수)
		 */

		int x = 10;
		int y = 20;
		System.out.println(x + y); // 30
		System.out.println(x - y); // -10
		System.out.println(x * y); // 200
		System.out.println(x / y); // 0.5, 값이 이상 (0) double값이 int로 바뀌면서 소수점 아래부분 버림
		System.out.println(x % y); // 10
		// x y
		// 정수 사칙연산 정수 ==> 정수
		// 정수 사칙연산 실수 ==> 실수
		// 실수 사칙연산 정수 ==> 실수
		// 실수 사칙연산 실수 ==> 실수
		// 둘 중 하나라도 실수가 있으면 연산의 결과는 실수다
		// * 사칙연산의 결과는 피연산자 중 데이터 타입의 범위가 큰 놈을 따라간다!

		// (데이터타입)변수 : 형 변환 (type casting)
		System.out.println((double) x / y);
		// 10 -> 10.0
		System.out.println(x / (double) y);
		// 20 -> 20.0
		System.out.println((double) x / (double) y);
		
		// Q1. 온도 변환기 (화씨 온도 -> 섭씨 온도)
		double f = 95;
		double c = (f - 32) * 5 / 9;
		c = ((double) 5 / 9) * (f - 32);
		c = (5.0 / 9) * (f - 32); // << 조금 더 직관적
		System.out.printf("화씨온도 %.2f는 섭씨온도 %.2f입니다\n", f, c);
		// 5 / 9 * (f - 32) 의 경우 {정수 / 정수 * (실수 - 정수)}, 정수 / 정수 = 정수 (0), 실수 - 정수 = 실수 (64), 정수(0) * 실수 (64)가 되어
		// 결과가 0으로 나온다. 따라서 앞의 (5 / 9) 중 하나 이상의 값을 double로 형변환 해줘야한다.
		
		// Q2.
		double total = 7500;
		double pay = 10000;
		double tax = total * 0.1; // 전체 상품 총액의 10%
		double change; // 세금을 제외한 잔돈을 출력
		change = pay - (total + tax);
		System.out.printf("잔돈은 %.0f원 입니다\n", change);
		
		// Q3. 
		int var = 10;
		
		// "10", "a", "10.23", String은 모든 데이터 형식을 표현할 수 있다
		String strVar = "hello" + var; // String + int의 형태로 int가 String으로 형변환되어 연산됨 hello10
		// 연산의 결과는 피연산자 중에서 큰 놈을 따라간다!
		// "hello" + "10" -> "hello10"
		// 문자열 + 문자열 ==> 문자열 결합
		
		// strVar 변수에 들어간 데이터 예상해보기 (이유도 생각)
		System.out.println(strVar);
		
		int intVar = 20 + var; // 30 (정수 + 정수의 연산 (20 + 10 == 30))
		// intVar 변수에 들어간 데이터 예상해보기 (이유도 생각)
		System.out.println(intVar);
		
		// +
		// 문자열 + 문자열 ==> 문자열의 결합
		// "hello" + "world" => "helloworld"
		
		

	}

}
