package icehs.science.chaptor03;

public class TypeCastingEx {

	public static void main(String[] args) {
		double billwealth = 7000000000L;
		System.out.println("Original value : " + billwealth);
		
		double doublebillwealth = billwealth;
		System.out.println("double형으로 변환 : " + doublebillwealth);
		
		int intbillwealth = (int)billwealth;
		System.out.println("int형으로 강제 변환 : " + intbillwealth);
	}

}