
public class Account {
	private String name;
    private	String password;
	private int balance;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	public Account() {};
	//생성자 선언
	public Account(String aName, String pw, int bal) {			
		name = aName;
		password = pw;
		balance = bal;
	}

	//입금 기능
	public void deposit(int money) {
		balance += money;
	}

	//출금 기능
	public void withDrawMoney(int money) {		
		balance -= money; //balance = balance - money;
	}

	//잔액 조회 기능
	public int getBalance() {
		return balance;
	}

}

