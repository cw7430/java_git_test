package exec;

public class Bird implements Flyable, Walkable {

	@Override
	public void fly() {
		System.out.println("새가 날아갑니다.");
	}
	
	@Override
	public void walk() {
		System.out.println("새가 걷습니다.");
	}
	
	public static void main(String[] args) {
		Bird myBird = new Bird();
		myBird.fly();
		myBird.walk();
	}


}
