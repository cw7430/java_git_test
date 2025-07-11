package exec;

public class Study2 {

	private static void forTest() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
	}

	private static void whileTest(int count) {
		while (count > 0) {
			System.out.println(count);
			count--;
		}

	}

	private static void doWhileTest(int num) {
		do {
			System.out.println(num);
			num++;
		} while (num < 3);
	}

	public static void main(String[] args) {
		// 반복문

		// for
		forTest();

		// while
		whileTest(3);

		// do-while
		doWhileTest(3);
	}
}
