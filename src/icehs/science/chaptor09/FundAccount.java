package icehs.science.chaptor09;

public class FundAccount extends Account {
	private double earningRate;
	


	public double getEarningRate() {
		return earningRate;
	}

	public FundAccount(double earningRate) {
		this.earningRate = earningRate;
	}
	
	public void earnMoney() {
		System.out.println("수익률 : " + this.earningRate + "%");
		System.out.println("수익이 발생했습니다.");
	}
	
}
