package exec;

public class Study {

	public static void main(String[] args) {
		// 조건문

		// if
		int num = 10;
		if (num > 0) {
			System.out.println("양수입니다.");
		} else if (num == 0) {
			System.out.println("0입니다.");
		} else {
			System.out.println("음수입니다.");
		}

		// switch
		int day = 3;
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

}
