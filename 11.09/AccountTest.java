public class AccountTest {

	public static void main(String[] args) {
		Account a = new Account("123-45", "김철수", 10000);
		Account b = new Account("567-89", "박영희", 10000);
		
		System.out.println(a.getAno() +" "+ a.getOwner() + " " + a.getBalance());
		System.out.println(b.getAno() + " " + b.getOwner() + " "+ b.getBalance());
		
		a.tranfer(b, 3000);
		
		System.out.println(a.getAno() +" "+ a.getOwner() + " " + a.getBalance());
		System.out.println(b.getAno() + " " + b.getOwner() + " "+ b.getBalance());
	}
}

class Account {
	private String ano;		//계좌번호
	private String owner;	//계좌주
	private int balance;	//잔액
	
	public Account (String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	
	public String getAno() {
		return ano;
	}


	public void setAno(String ano) {
		this.ano = ano;
	}


	public String getOwner() {
		return owner;
	}


	public void setOwner(String owner) {
		this.owner = owner;
	}


	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}


	void tranfer(Account target, int amount) {
		if (balance < amount) {
			System.out.println("잔액이 없습니다.");
		}
		else {
			balance -= amount;
			target.balance += amount;
		}
	}
}
