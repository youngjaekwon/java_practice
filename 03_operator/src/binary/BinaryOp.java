package binary;

public class BinaryOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 이항 연산자 (binary operator)
		// x + y, x - y, ....
		// 산술 연산자도 이항 연산자임 (+, -, /, *, %)
		
		int x = 10;
		int y = 20;
		x = x + y;
		System.out.println(x); // 30
		
		// 복합 대입 연산자
		x += y; // x = x + y와 동일 (**)
		System.out.println(x); // 50
		
		x -= y; // x = x - y;
		System.out.println(x); // 30
		
		x *=y ; // x = x * y;
		System.out.println(x); // 600
		
		x /= y; // x = x / y;
		System.out.println(x); // 30
		
		x %= y; // x = x % y;
		System.out.println(x); // 10
		
		
		// 관계 연산
		/*
		 * == : 같니?
		 * != : 다르니?
		 * > : 크니?
		 * < : 작니?
		 * >= : 크거나 같니?
		 * <= : 작거나 같니? 
		 * 
		 * 
		 * 연산의 결과 boolean (true, flase)
		 * */

		System.out.println(3 == 3); // true
		System.out.println(3 != 3); // false
		System.out.println(5 != 3); // true
		System.out.println(3 > 3); // false
		System.out.println(3 >= 3); // true
		System.out.println(10 > 3); // true
		System.out.println(5 < 5); // false
		System.out.println(5 <= 5); // true
		System.out.println(-20 < -10); // true
		
		
		// 논리 연산자 (그리고, 또는, 아니다)
		/*
		 * x && y (그리고)
		 * x || y (또는)
		 * !x (아니다)
		 * 
		 * 그리고 (&&) : 둘 다 true면 true, 둘 중하나라도 false면 false
		 * 또는 (||) : 둘 중 하나라도 true면 true
		 * 아니다 (!) : 결과를 반전
		 * 
		 * x, y의 데이터 타입은 boolean (true, false로 판단 가능식)
		 * ex) x = (3 == 3)
		 * */
		
		
		System.out.println((3 == 3) && (5 == 3)); // false
		System.out.println((3 != 3) && (5 == 3)); // false
		System.out.println((3 == 3) || (5 == 3)); // true
		System.out.println((3 != 3) || (5 == 3)); // false
		System.out.println(!(3 != 3)); // true
//		System.out.println(3 && 3); //  오류남 (x, y 가 boolean이 아님)
		
		
		// 삼항 연산자 (ternary operator)
		/* (조건식) ? 참일 때 결과 : 거짓일 때 결과
		 * int z = (x > y) ? x  :  y
		 * 1) (x > y) => z = x
		 * 2) (x <= y) => z = y
		 * 
		 * * z에 들어가고 있는 값은 어떻게 결정되나요? (x, y중)
		 * : x, y 중에 더 큰 값 (x, y가 동일하지 않다고 가정)
		 * 
		 * ex) x, y 중에 더 작은 값 저장하는 삼항 연산자
		 * int z = (x < y) ? x : y <- 이 방법이 시인성이 좋음
		 * int z = !(x > y) ? x : y
		 * 
		 * */
		
		x = 3;
		y = 5;
		String str = (x > y ) ?
				x + "(은)는 " + y + "보다 큽니다" : x + "(은)는 " + y + "보다 작습니다";
		System.out.println(str);
		
		str = (x > y ) ? "큽니다" : "작습니다";
		System.out.printf("%s(은)는 %s보다 %s\n" ,x, y, str); // printf는 +연산이 안된다
		
		// %n vs \n
		// %n : 엔터 (printf (%d, %f.. formattor))
		// \n : 엔터 (printf, print, println) << 이쪽을 쓰는것이 더 나음
		
		/* Q1. 윤년 검사 프로그램
		 * int year = 2021;
		 * 
		 * 아래의 조건 중 하나만 만족하면 윤년
		 * 1) 4의 배수이어야하고 100의 배수가 아니어야 함
		 * 2) 400의 배수는 무조건 윤년이 됨
		 * 
		 * 
		 * Q2. 양수 음수 판단 프로그램
		 * int num = -100;
		 * 
		 * 해당 수가 0보다 크면 "양수"를 출력
		 *         0보다 작으면 "음수"를 출력
		 *         0이면 "0"을 출력 (**)
		 *         
		 * Q3. 나누기
		 * int a = -1;
		 * int b = 0;
		 * 
		 * a/b의 연산이 가능하면 연산 결과를 출력
		 * a/b의 연산이 불가능하면 "연산 불가능합니다"를 출력
		 * 
		 * (* 나눗셈에서 분모는 0이 될 수 없습니다!)
		 * 
		 * *int -> String,
		 * String s = Integer.toString(i);
		 * int i = 3;
		 * String s = Integer.toString(i); // "3"
		 * 3 -> "3"
		 * 
		 * 
		 * */
		
		// Q1.
		int year = 2021;
		boolean checker1 = ((year % 4) == 0) && ((year % 100) != 0);
		boolean checker2 = ((year % 400) == 0);
		String leepyear = (checker1 || checker2) ? year + "년은 윤년 입니다" : year + "년은 윤년이 아닙니다";
		System.out.println(leepyear);
		
		// Q2.
		int num = -100;
		String pnchck = (num > 0) ? "양수" : "음수";
		String pnchck2 = (num == 0) ? "0" : pnchck;
		System.out.println(pnchck2);
		
		// Q3.
		int a = -1;
		int b = 0;
		double division = (double)a / b;
		String chck = (b != 0) ? Double.toString(division)  : "연산 불가능합니다";
		System.out.println(chck);
		System.out.println((b != 0) ? division : "연산 불가능합니다");
		
		// 비트 연산자 (IoT, 하드웨어)
		// 2진수로 변환해서 연산한다 (같은 자리수 끼리 연산)
		/* ~ : 비트별 NOT (0과 1을 반전)
		 * & : 비트별 AND (하나라도 0이면 0)
		 * ^ : 비트별 XOR (exclusive or, 배타적논리합) (3^5 != 3의 5승, Math.pow(3, 5)) (같으면 0 다르면 1)
		 * | : 비트별 OR (하나라도 1이면 1)
		 * << : 비트 왼쪽 이동 (2진수에서 자리수가 한 칸 왼쪽으로 이동) // 2의 n승을 곱할때 유리
		 * >> : 비트 오른쪽 이동 (2진수에서 자리수가 한 칸 오른쪽으로 이동) // 2의 n승을 나눌때 유리
		 *  : 비트가 움직이는 것을 Shift 연산자
		 *  
		 *  a * 2, a * 4, a * 8
		 *  a << 1, a << 2, a << 3
		 *  
		 *  a * (1/2), a * (1/4), a * (1/8)
		 *  a >> 1, a >> 2, a >> 3
		 * */
		
		System.out.println();
		
		int var1 = 5;
		int var2 = 3;
		System.out.println(var1 & var2); // AND
		System.out.println(var1 | var2); // OR
		System.out.println(var1 ^ var2); // XOR
		System.out.println(~var2); // NOT
		// 0// 011(2)
		// 1// 100(2) == -4
		System.out.println(~8);
		// 1000(2)
		System.out.println(var1 << 1);  // x2
		System.out.println(var1 << 2);  // x4
		System.out.println(var1 >> 1); // 5/2 == 2 (정수끼리의 나눗셈과 같음)
		// 101 >> 1
		// 010
		System.out.println(var1 >> 2); // 5/4 == 1 (정수끼리의 나눗셈과 같음)
		// 101 >> 2
		// 001

	}

}
