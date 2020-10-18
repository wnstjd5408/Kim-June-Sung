import java.util.Scanner;

public class AccountMain {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int menu;
		int money;

		System.out.println("계좌를 등록합니다.");
		System.out.print("이름을 입력하시오 : ");
		String name = sc.nextLine();

		System.out.print("비밀번호를 입력하시오 :");
		String ps = sc.nextLine();

		System.out.print("금액을 입력하시오 :");
		int price = sc.nextInt();
		Account a = new Account(name, ps, price);
		while(true) {
			System.out.println("메뉴를 입력하시오");
			System.out.println("1.예금 / 2.출금 / 3. 잔액 조회 / 4. 종료");
			menu=sc.nextInt(); 
			if(menu == 1) {
				while(true) {
					System.out.print("비밀 번호를 입력하시오 :");
					String password = sc.next();
					if(password.equals(a.getPassword())) {
						System.out.println("비밀번호가 맞았습니다!!");
						System.out.print("얼마를 입금 하는가 ?");
						money =sc.nextInt();
						a.deposit(money);
						System.out.println(money + "입금 되었습니다!!");
						break;
					}
					else {
						System.out.println("비밀번호가 틀렸습니다.");
					}

				}
			}
			else if(menu == 2) {	
				while(true) {
					System.out.print("비밀 번호를 입력하시오 :");
					String password = sc.next();
					if(password.equals(a.getPassword())) {
						System.out.println("비밀번호가 맞았습니다!!");
						System.out.print("얼마를 출금 하는가 ?");
						money =sc.nextInt();
						if(money > a.getBalance()) {
							System.out.println("금액이 부족합니다.");
						}
						else {
							a.withDrawMoney(money);
						}
					}

					else {
						System.out.println("비밀번호가 틀렸습니다.");
					}
				}
			}
			else if(menu == 3) {
				System.out.println(a.getName() + "의 잔액은 " + a.getBalance() +
						"입니다");

			}
			else if(menu == 4) {
				System.exit(0);
			}

		}
	}
}
