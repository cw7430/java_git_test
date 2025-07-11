package exec;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public void listTest() {
		// 1부터 9까지 숫자를 List에 저장 (for문 사용)
		List<Integer> numbers = new ArrayList<>();
		for (int i = 1; i <= 9; i++) {
			numbers.add(i);
		}

		// List에 들어 있는 내용을 출력 (for문 사용)

//        for(int i = 0; i < numbers.size(); i++) {
//            System.out.println("리스트 아이템: " + numbers.get(i));
//        }

		// or
		for (Integer number : numbers) {
			System.out.println("리스트 아이템: " + number);
		}
	}

	public void listTextBasic() {
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Hello");
		list.add("World");
		System.out.println(list);

		System.out.println("첫 번째 요소: " + list.get(0));
		System.out.println("두 번째 요소: " + list.get(1));
		System.out.println("세 번째 요소: " + list.get(2));

		for (int i = 0; i < list.size(); i++) {
			System.out.println("리스트 아이템: " + list.get(i));
		}

		for (String item : list) {
			System.out.println("리스트 아이템: " + item);
		}

		//int a = 10;

		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		System.out.println(intList);

		List<Double> doubleList = new ArrayList<>();
		doubleList.add(3.14);
		doubleList.add(2.71);
		System.out.println(doubleList);

		List<Animal> animalList = new ArrayList<>();
		animalList.add(new Cat());
		animalList.add(new Dog());
		for (Animal animal : animalList) {
			animal.sound();
		}
	}

	public static void main(String[] args) {
		// listTest();
		ListTest listTest = new ListTest();
		listTest.listTest();
	}

}