package quiz02;

public class AccountMain {
	public static void main(String[] args) {
		
		Account my = new Account("박종범","abc",1000); 
		my.deposit(19000);  //9000원 입금
		my.withDraw(5000); //5000원 출금
		System.out.println("잔액조회:"+ my.getBalance());
		
		
	}
	
}
