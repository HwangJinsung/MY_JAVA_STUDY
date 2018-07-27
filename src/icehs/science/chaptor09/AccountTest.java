package icehs.science.chaptor09;

public class AccountTest {

	public static void main(String[] args) {
		FundAccount[] fundAcc = { 
				new FundAccount("111-222","홍길동",5000000,4.7),
				new FundAccount("666-777","홍길순",1000000,2.9)
		};
		
		for (int i = 0; i < fundAcc.length; i++) {
			fundAcc[i].openAccount();
			fundAcc[i].earnMoney();
			System.out.println();
		}

	/*	fundAcc.setName("홍길동");
		fundAcc.setName("111-2222");
		fundAcc.setBalance(50000000);*/
		

//		fundAcc.setEarningRate(4.7);

	}

	
}
