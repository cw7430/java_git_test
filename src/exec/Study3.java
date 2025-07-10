package exec;

public class Study3 {

	public static void main(String[] args) {
		// 배열

		// 선언과 생성
		int[] numbers = new int[5]; // 길이가 5인 정수 배열
		String[] names = new String[3];

		// 초기화
		int[] scores = { 90, 80, 70 };
		String[] fruits = { "Apple", "Banana", "Orange" };

		// 요소 접근
		System.out.println(scores[0]);
		System.out.println(fruits[2]);

		// 배열 길이
		System.out.println(names.length);

		// 반복문과 배열
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
			System.out.println(numbers[i]);
		}
	}

}
