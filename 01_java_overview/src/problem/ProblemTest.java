package problem;

public class ProblemTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 산술 연산자 (+, -, *, /)
		// Q1. 원의 둘레, 넓이 계산하는 프로그램
		// 원의 둘레 : 2 * PI * 반지름
		// 원의 넓이 : PI * 반지름 * 반지름
		
		int r = 3;
		final double PI = 3.141592; 
		
		//원의 둘레 : peri (float)
		//원의 넓이 : area (float)
		double peri = 2 * PI * r;
		double area = PI * r * r;
		System.out.println("원의 둘레: " + peri);
		System.out.println("원의 널이: " + area);
		// 1) 18.84 -> "18.84" (자동 형변환)
		// 2) "원의 둘레: " + "18.84"
		// String 은 "1"(정수), "1.25"(실수) 모두 포함
		// -----------------------------------------
		// print(), println(), printf() (print format)
		// printf() (enter를 포함하지 않음)
		// 정수 (10진수) : %d (decimal)
		// 정수 (8진수) : %o (octal)
		// 정수 (16진수) : %x (hexadecimal)
		// 실수 (float, double) : %f
		// 문자 (char) : %c
		// 문자열 (String) : %s
		
		System.out.printf("원의 둘레: %.2f\n", peri); // %.2f는 소수점 2번째자리 까지만 출력, \n은 enter
		System.out.printf("원의 넓이: %.2f\n", area); // %.2f는 소수점 2번째자리 까지만 출력, \n은 enter
		System.out.printf("원의 둘레: %10.2f\n", peri);
		// %10.2f는 총 10칸 중에 숫자가 있는 4자리는 뒤에 출력하고 나머지 6자리는 앞에 빈칸으로 출력
		// 언제 사용하는지?
		int month = 1; // 1 ~ 12 (최대 2글자)
		int day = 1; // 1 ~ 31 (최대 2글자)
		System.out.printf("month = %2d, day = %2d\n", month, day);
		month = 12;
		day = 31;
		System.out.printf("month = %2d, day = %2d\n", month, day);
		// month와 day는 최대 2칸을 차지하니 %2d를 사용하면 보기좋게 출력할 수 있다
		
		// + 연산
		// 문자열 + 문자열 : 문자열 결합
		System.out.println("원의 둘레: " + "123");
		// 숫자 + 숫자 : 숫자 덧셈
		System.out.println(234 + 123);

		// Q2. boolean b = true를 int로 형변환하는 코드 작성
		
		boolean b = true;
//		System.out.println((int)b);
//		// boolean 값을 int로 형 변환 할수 없기때문?
//	    // boolean -> int 형 변환이 안됨 (java의 특징)
//		// false : 0
//		// true : 1
//		int t = -100;
//		boolean tb = (boolean)t;
//		// 역으로도 안됨
		
//		// Q3. 아래의 코드가 오류가 나는 이유를 설명하시오.
//	    // 오류가 없을 경우에는 왜 오류가 안 나는지도 생각해보세요!
//	    float f = 0.12; // double 타입의 데이터가 float 타입 변수에 할당되어 있기때문
		// double -> float : 오류
//	    int i = 2.1; // double 타입의 데이터가 int 타입 변수에 할당되어 있기때문
		// double -> int : 오류
//	    int i = (int)2.1; // 2.1 -> 2 (명시적 형변환)
//	    char c = "a"; // String 타입의 데이터가 char 타입 변수에 할당되어 있기때문 (String을 char로 형 변환 불가)
//	    boolean bl = 1; // int 타입의 데이터가 boolean 타입 변수에 할당되어 있기때문 (int를 boolean으로 형 변환 불가)
//	     boolean bl = (boolean)1; 이것도 안됨 1 -> true로 변경 불가!
	    double d = 1; // int 타입의 데이터가 double 타입 변수에 할당되어 있기때문 (int가 double로 형 변환되어 저장됨)
	    // 1 -> 1.0 변환됨 (자동 형변환)
	    //  int -> double : 가능
	    // 작은 개념에서 큰 개념으로 들어갈 때 자동 형변환이 일어남 (포함 가능)
	    double dd = 1.2f; // float 타입의 데이터가 double 타입 변수에 할당되어 있기때문 (float이 double로 형 변환되어 저장됨)
	    // 1.2f -> 1.2 (자동 형변환)
	    // float -> double : 가능
	    
	    
	    // Q4. x, y 변수를 이용하여
	    // x, y 변수를 이용하여 x, y에 담긴 값의 위치를 바꾸는 코드 작성 
	    // swap (switch)
	    int x = 10;
	    int y = 20;
	    System.out.println(x); // 10
	    System.out.println(y); // 20
	    
	    int tmp = x;
	    x = y;
	    y = tmp;	    
	    
	    System.out.println(x); // 예상 결과값: 20
	    System.out.println(y); // 예상 결과값: 10
	    System.out.println();
	    
	    // Q5. 다음 문장의 실행 결과를 확인하고 이유를 생각해보세요!
	    // 컴파일 했을 때 나는 오류 : 컴파일 에러
	    // 실행 했을 때 나는 오류 : 런타임 에러 (예외 처리 해서 수정 가능)
	   
	    int xx = 65;
	    System.out.printf("%.2f\n", (float)xx);
	    System.out.printf("%c\n", xx); // 65에 대한 아스키 코드 출력
	    
	    char chh = 'a';
	    System.out.printf("%d\n", (int)chh); // 문자 'a'에 대한 아스키코드 값 출력
	    
	    char chch = 97; // 'a'
	    System.out.printf("%d\n", (int)chch);
	    System.out.printf("%c", chch);
	    
	    // 아스키코드 A : 65, a : 97, 대문자 소문자는 32 차이
	    
	    
	}

}
