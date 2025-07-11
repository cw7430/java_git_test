package exec;

public class Car {
	private String brand;
	private String model;
	private String year;

	public void move() {
		System.out.println("자동차가 움직입니다.");
	}

	public void stop() {
		System.out.println("자동차가 멈춥니다.");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
	
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.setBrand("Toyota");
		
		System.out.println("브랜드" + myCar.getBrand());
		
		myCar.move();
		myCar.stop();
	}

}
