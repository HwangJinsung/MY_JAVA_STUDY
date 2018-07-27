package icehs.science.chaptor10;

public class AccountTest {

	public static void main(String[] args) {
		Account[] fundAcc = { 
				new Account("1313-445566","전우치",100000),
				new FundAccount("111-2222","홍길동",5280000,5.6),
				new FundAccount("666-7777","홍길순",1029000,2.9)
		};
		
		for (int i = 0; i < fundAcc.length; i++) {
			if (fundAcc[i] instanceof FundAccount) {
				fundAcc[i].openAccount();
				((FundAccount)fundAcc[i]).earnMoney();
			}
			else if (fundAcc[i] instanceof Account) {
				fundAcc[i].openAccount();
			}
			System.out.println();
		}

	/*	fundAcc.setName("홍길동");
		fundAcc.setName("111-2222");
		fundAcc.setBalance(50000000);*/
		

//		fundAcc.setEarningRate(4.7);

	}

	
}
