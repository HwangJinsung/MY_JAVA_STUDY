package icehs.science.chaptor06;

public class AccountTest {

	public static void main(String[] args) {
		Account gil = new Account();
		gil.accName = "ȫ�浿";
		gil.accNo = "123-456789";
		gil.balance = 10000;
		gil.printAccountInfo();
		
		System.out.println("20000���� �Ա��մϴ�.");
		gil.deposit(20000);
		
		System.out.println("�ܾ� : " + gil.balance + " ��");
		
		
		System.out.println("-20000���� �Ա��մϴ�.");
		gil.deposit(-20000);
		
		System.out.println("�ܾ� : " + gil.balance + " ��");
		
		
		System.out.println("-20000���� ����մϴ�.");
		gil.withdraw(-20000);
		
		System.out.println("�ܾ� : " + gil.balance + " ��");
		
		
		System.out.println("45000���� ����մϴ�.");
		gil.withdraw(45000);

		
		System.out.println("�ܾ� : " + gil.balance + " ��");	
		
	}

}
