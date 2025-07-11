package exec;

public class Study {

	private static void ifTest(int num) {
		if (num > 0) {
			System.out.println("양수입니다.");
		} else if (num == 0) {
			System.out.println("0입니다.");
		} else {
			System.out.println("음수입니다.");
		}
	}

	private static void switchTest(int day) {
		switch (day) {
		case 1:
			System.out.println("월요일");
			break;
		case 2:
			System.out.println("화요일");
			break;
		case 3:
			System.out.println("수요일");
			break;
		default:
			System.out.println("기타 요일");
			break;
		}
	}

	public static void main(String[] args) {
		// 조건문

		// if
		ifTest(10);

		// switch
		switchTest(3);

	}

}
