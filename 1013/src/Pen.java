
public class Pen {
	//객체의 속성을 나타내는 것을 필드(멤버변수)라고 부릅니다.
 private String color;
 public String getColor() {
	return color;
}


public void setColor(String color) {
	this.color = color;
}


public int getPrice() {
	return price;
}


public void setPrice(int price) {
	this.price = price;
}
private int price;
 
 public Pen(String color, int price) {
	 this.color =color;
	 this.price = price;
 }
 	//객체의 기능을 나타내는 것을 메서드(멤버함수)라고 부릅니다.
 public Pen() {
	 
 }

 public void writepen() {
	 System.out.println(color + "로 색칠합니다");
 }
 public void info() {
	 System.out.println("-------Pen's Info----------");
	 System.out.println("색상 :" + color);
	 System.out.println("가격 :" + price);
 } 
}

