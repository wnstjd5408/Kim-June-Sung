import java.util.Scanner;

public class PenMain {
 public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	Pen other = new Pen();
	System.out.print("색깔을 고르시오 :");
	String color = sc.nextLine();
	other.setColor(color);
	System.out.println("가격을 적으시오");
	int price = sc.nextInt();
	other.setPrice(price);
	
	other.writepen();
	
	 
	Pen red = new Pen("Red", 15000 );
	
	red.writepen();
	red.info();  
	
	
	
}
}
