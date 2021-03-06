package overview;
// 패키지 : 클래스 집합 (이름은 소문자 작성)

public class HelloTest { // Hello + Test
	// 클래스 : 자바에서는 소스코드를 클래스단위로 개발
	// 이름은 첫 문자를 대문자 작성 (카멜 표기법)
	// 클래스 이름은 소스코드 파일명 (클래스.java)과 동일해야 함 
	// ex) HelloTest (두 단어가 연결되어있는 복합어라고 한다면, 그 단어의 첫 글자를 대문자로한다)
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 메인 함수 : 프로그램이 처음에 시작되는 부분
		// 코드가 순차적으로 실행
		
		// 주석 (comment)
		// 1) 코드 설명 (협업/소통을 위해 사용)
		// 2) 개발자 이름, 수정일
		
		/* 주석이 길어지게 될 경우에 사용
		 * 여러줄
		 * 짜리
		 * 주석
		 * */
		
		// 문장의 끝에는 세미콜론 (;) 작성! (**)
		// 하나의 문장이 끝났다는 것을 컴퓨터에게 알려주기 위해 ;(세미콜론)을 입력한다
		System.out.println("Hello World! 1");
		System.out.println("Hello World! 2");
		System.out.println("Hello World! 3");
		System.out.println("Hello Java! 1");
		// 화면에 출력하는 함수
		
		// 자동완성 : sysout + (ctrl + space)
		System.out.println("Hello Java! 2");
		
		System.out.println("Hello Java! 3");
		// 문자열 출력 후에 자동으로 엔터 (ln이 컴퓨터에서는 엔터)
		System.out.print("Hello Java! 4");
		System.out.print(" "); // space
		// 문자열 출력 후에 엔터 포함 X
		System.out.print("Hello Java! 5");
		// 문자열 출력 후에 엔터 포함 X
		
		
		// 실행 : ctrl + f11
		
		// print() : 화면에 출력 함수
		// 1) println("hello") : "hello" (문자열)을 출력하고 엔터 O
		// 2) print("hello") : "hello" (문자열)을 출력하고 엔터 X
		// 3) printf() : print + format (형식)을 맞춰서 출력
		
		// a : 변수
		// a() : 함수
		// 소괄호가 오면 함수다
		
	}

}
