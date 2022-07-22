package aboutClass;

public class AccountTest {

	public static void main(String[] args) {

		Account mike = new Account("123-45", 10000);
		Account jane = new Account("567-89", 10000);

		boolean result = true;
		while (result) {
			result = mike.transfer(jane, 3000);
		}

		System.out.println(mike.toString());
		System.out.println(jane.toString());

	}

}

class Account {

	String num; // 계좌번호
	int balance; // 잔액

	public Account(String num, int balance) {
		super();
		this.num = num;
		this.balance = balance;
	}

	public boolean transfer(Account target, int amount) {
		if (amount > balance) {
			return false;
		}

		balance = balance - amount;
		target.balance = target.balance + amount;

		return true;
	}

	@Override
	public String toString() {
		return "Account {num: " + num + ", balance: " + balance + "}";
	}

}