package input;


// 콘솔 (실행화면)을 통해 사용자에게 입력받는 방법
import java.util.Scanner; // 사용자에게 입력받기 위해서 Scanner라는 class	를 import 했다.
// 현재 프로그램에 없기때문에 어디서 가져왔다.

public class InputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		// Scanner : 클래스 (밑그림, 설계 ==> 붕어빵틀)
		// sc : 객체 (object, 사물, 대상 ==> 붕어빵) (실제 사용되는 것)
		
//		System.out.print("연도를 입력하세요 : "); // 사용자 유도 메세지
//		int year = sc.nextInt();
//		System.out.println("연도는 " + year + "년");
		
		// Q1. 사용자에게 연도를 입력받아 해당연도가 윤년인지 판단하는 프로그램
		//      아래의 조건 중 하나만 만족하면 윤년
		//      1) 4의 배수이어야하고 100의 배수가 아니어야 함
		//      2) 400의 배수는 무조건 윤년이 됨
		
//		System.out.print("연도를 입력하세요 : ");
//		int year = sc.nextInt();
//		isLeapYear = 	(year % 4 == 0) && (year % 100 != 0)
//		|| (year % 400 == 0)
//		String leapYearStr = (isLeapYear) ? "윤년이 맞습니다" : "윤년이 아닙니다";
//		
//		// true, flase => "윤년이 맞습니다", "윤년이 아닙니다"
//		System.out.println("윤년 여부 : " + isLeapYear);
		
		// Q2. 사용자에게 입력받은 두 개의 실수 (double)를 나누는 프로그
		// +, -, *, / (분모가 0인 경우 오류 출력) 프로그램
		
//		System.out.print("첫 번째 수를 입력하세요 : ");
//		double num1 = sc.nextDouble();
//		System.out.print("두 번째 수를 입력하세요 : ");
//		double num2 = sc.nextDouble();
//		
//		double plus = num1 + num2;
//		System.out.println("두 수를 더하면 : " + plus);
//		double minus = num1 - num2;
//		System.out.println("두 수를 빼면 : " + minus);
//		double mult = num1 * num2;
//		System.out.println("두 수를 곱하면 : " + mult);
//		double div = num1 / num2;
//		String divch = (num2 != 0) ? Double.toString(div) : "계산할 수 없습니다";
//		String div = (num2 == 0) ? "[에러] 0 으로 나눌수 없음" : num1 / num2 +"";
//		System.out.println("두 수를 나누면 : " + div);
		
		/*
		 *  Infinity, - Infinity : 무한대
		 *  nan (not a number)
		 *  
		 * */
		
		// Q3. 사용자에게 "hello world" 문자열을 입력받아보자!
		// sc.next()
		// sc.nextLine()

//		System.out.print("'hello world'를 입력해주세요! : ");
//		String str1 = sc.next();
//		System.out.println("입력한 문장 : " + str1);
//		
//		System.out.print("'hello world'를 입력해주세요! : ");
//		String str2 = sc.nextLine();
//		System.out.println(str2);
		
		// 만약 버퍼에 남겨있는 내용물을 삭제하고 싶다면?
//		sc.close(); // 내부적으로 flush() 호출
		
		// next() : 엔터/space 들어오기 전까지
		// nextLine() : 엔터 들어오기 전까지
		// "hello world"
		// 임시 저장 메모리 (버퍼, buffer)
		
		// Q1. char 하나만 저장하고 싶을 때?
//		char ch = sc.next().charAt(0); // 편
//		// 입력된 문자열 중 가장 첫번째를 가지고 옴
//		// "abc" -> 'a'
//		//  소괄호가 붙으면 함수다
//		ch = "hello world".charAt(0);
		
		// "a" vs 'a'
		// "a" : 데이터 + 함수 (String)
		// 'a' : 데이터 (char)
		
		
		 // Q1. 도시 (시 -> 특별시) 아래의 조건 중 
	     // 하나만 만족하면 특별시가 될 수 있다고 가정
	     // 1) 해당 도시가 중심지이고 인구가 100만 이상
	     // 2) 부자인 인구 50만 이상
	     	
		// 입력 변수 : 중심지인지 아닌지, 인구의 수, 부자의 수
		
//		System.out.print("도시가 중심지 인가요? (true, false) : ");
//		boolean isCityCenter = sc.nextBoolean();
		
//		System.out.print("도시가 중심지 인가요? (yes, no) : ");
//		char ynch = sc.next().charAt(0); // yes, no
//		boolean isCityCenter = (ynch == 'y') || (ynch == 'Y');
//		System.out.print("인구수를 입력하세요 (단위 : 만) : ");
//		int pop = sc.nextInt();
//		System.out.print("부자수를 입력하세요 (단위 : 만) : ");
//		int riches = sc.nextInt();
//		String metcity = (isCityCenter && pop >= 100) || (riches >= 50) ? "특별시 입니다" : "특별시가 아닙니다";
////		String checker1 = (ynch == 'y' || ynch == 'n') ? metcity : "[에러] 중심지 여부는 y 또는 n 만 입력가능합니다";
////		String checker2 = (ynch != 'y' && ynch != 'n') || (pop > riches) ? checker1 : "[에러] 부자수는 인구수를 넘을 수 없습니다";
//		System.out.println("당신의 도시는 : " + metcity);
//		
//		String ynch1 = sc.next().toLowerCase(); // toLowerCase 는 전체 다 소문자로 바뀐다 YES, Yes, yEs ==> yes
//		// toUpperCase 는 대문자로!!
//		
//		System.out.println(ynch1.equals("yes")); // 문자열끼리 비교는 equals()
//		System.out.println(ynch1.startsWith("y")); // y로 시작하는 모든 문자열은 true
		
		
		// Q2. 사용자에게 세 변의 길이(정수)를 입력 받아서
		// 세 변으로 삼각형을 만들 수 있는지 확인하는 프로그램
		// a, b, c (c가 가장 크다고 가정)
		// a + b > c
		
		System.out.print("세 변중 가장 긴 변의 길이를 입력하세요 : ");
		int side1 = sc.nextInt();
		System.out.print("두 번째 변의 길이를 입력하세요 : ");
		int side2 = sc.nextInt();
		System.out.print("세 번째 변의 길이를 입력하세요 : ");
		int side3 = sc.nextInt();
		boolean isTriangle = (side2 + side3) > side1;
		System.out.println(isTriangle ? "삼각형을 만들 수 있습니다" : "삼각형을 만들 수 없습니다");
		
		
	    // Q3. 사용자에게 국어, 수학, 영어 성적 (정수)을 입력을 받아서
	    // 세 과목의 평균이 70점이 넘는지 확인하는 프로그램
	    
		System.out.print("국어 성적을 입력해주세요 : ");
		double kor = sc.nextDouble();
		System.out.print("수학 성적을 입력해주세요 : ");
		double mat = sc.nextDouble();
		System.out.print("영어 성적을 입력해주세요 : ");
		double eng = sc.nextDouble();
		double avg = (kor + mat + eng) / 3;
		// kor, mat, eng가 int 값이면 분모 3을 3.0 입력하여 double로 형변환해줘야함
		// 그렇지 않으면 int / int 연산이 되어 소수점 아래 부분 값을 잃게됨
		boolean avgChk = avg > 70;
		System.out.println(avgChk ? "평균이 70점을 넘습니다" : "평균이 70점을 넘지 않습니다");
		
		
	     // Q4. 사용자에게 수를 하나 입력받아 
	     // 해당 수가 홀수인지 짝수인지 판단하는 프로그램
		
		System.out.print("자연수 하나를 입력해주세요 : ");
		int num = sc.nextInt();
		// 홀수 (odd), 짝수 (even)
		boolean isOdd = (num % 2) == 1;
		boolean isEven = (num % 2) == 0;
		System.out.println(isOdd ? "홀수 입니다" : "짝수 입니다");
		
	}

}
