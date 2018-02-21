package prob05;

public class Account {
	private String accountNo;
	private int balance;
	
	public Account() {
	}
	
	public Account(String accountNo) {
		System.out.println( accountNo + "계좌가 개설되었습니다." );
		this.accountNo = accountNo;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void save(int money) {
		System.out.println( accountNo + "계좌에 " + money + "만원이 입금되었습니다");
		this.balance += money;
	}
	
	public void deposit(int money) {
		if(balance < money) {
			System.out.println("잔액이 부족합니다.");
		} else {
			System.out.println( accountNo + "계좌에 " + money + "만원이 출금되었습니다");
			this.balance -= money;
		}
	}
}