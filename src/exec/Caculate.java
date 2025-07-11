package exec;

import java.util.Scanner;

public class Caculate {

	private static int sum(int x, int y) {
		return x + y;
	}

	private static int difference(int x, int y) {
		return x - y;
	}

	private static int product(int x, int y) {
		return x * y;
	}

	private static Integer division(int x, int y) {
		if (x == 0) {
			System.out.println("에러: 0으로 나눌 수 없습니다.");
			return null;
		}
		return y / x;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("첫 번째 숫자를 입력하세요: ");
		int num1 = scanner.nextInt();

		System.out.print("두 번째 숫자를 입력하세요: ");
		int num2 = scanner.nextInt();
		
		String divisionResult = division(num1, num2) == null ?  "나눗셈: 에러- 0으로 나눌 수 없습니다." :  "나눗셈: " + division(num1, num2);

		System.out.println("--- 결과 ---");
		System.out.println("덧셈: " + sum(num1, num2));
		System.out.println("뺄셈: " + difference(num1, num2));
		System.out.println("곱셈: " + product(num1, num2));
		System.out.println(divisionResult);

		scanner.close();

	}

}
