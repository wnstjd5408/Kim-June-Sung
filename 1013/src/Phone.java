
public class Phone {
	//멤버변수 선언
	private String color;
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	private String model;
	private int price;
	/*
	 * 생성자: 생성자는 객체가 생성될 때 실행해야할 로직을 
	 * 작성할 수 있습니다. 생성자는 선언해야만 호출할 수 있으며
	 * 생성자를 하나도 선언하지 않을경우 자동으로 기본생성자가 선언됩니다.
	 */
	//생성자 선언: 생성자의 이름은 클래스 이름과 대/소문자까지 같아야 합니다.
	//그리고 반환유형은 적지 않습니다.
	
	public Phone() {
		System.out.println("생성자가 호출됨!!");
		color = "블랙";
		model = "아이폰12";
	}
	/*
	 * 1.생성자는 중복해서 여러개 선언할 수 있습니다.
	 * 2.단, 매개변수의 종류나 개수가 달라져야합니다.
	 */
	//메서드 선언
	
	public void info() {
		System.out.println("===========핸드폰의 정보=============");
		System.out.println("색상: " + color);
		System.out.println("모델명:" + model);
		System.out.println("가격 :" + price);
		
	}
}
