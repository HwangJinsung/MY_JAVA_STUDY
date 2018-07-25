package icehs.science.chaptor06;

public class AccountTest {

	public static void main(String[] args) {
		Account gil = new Account();
		gil.accName = "홍길동";
		gil.accNo = "123-456789";
		gil.balance = 10000;
		gil.printAccountInfo();
		
		System.out.println("20000원을 입금합니다.");
		gil.deposit(20000);
		
		System.out.println("잔액 : " + gil.balance + " 원");
		
		
		System.out.println("-20000원을 입금합니다.");
		gil.deposit(-20000);
		
		System.out.println("잔액 : " + gil.balance + " 원");
		
		
		System.out.println("-20000원을 출금합니다.");
		gil.withdraw(-20000);
		
		System.out.println("잔액 : " + gil.balance + " 원");
		
		
		System.out.println("45000원을 출금합니다.");
		gil.withdraw(45000);

		
		System.out.println("잔액 : " + gil.balance + " 원");	
		
	}

}
