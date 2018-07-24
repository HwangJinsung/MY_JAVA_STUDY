package icehs.science.chaptor05;

public class ValuationBasisTest {

	public static void main(String[] args) {


		int num1 = 10;
		int num2 = 20;
		int num3 = 40;
		int num4 = 50;
		int num5 = 80;
		
		double result1 = (double)num1 * num2 / 2 * 60 / 100;
		double result2 = (double)(num3 + num4) / 2 * 13 / 100;
		double result3 = (double)num5 * 27 / 100;
		
		double result = result1 + result2 + result3;
		
		
		
		System.out.println(result);
		
		if (result<=100 && result>=95) {
			System.out.println("Special Class 입니다!!");
		}
		else if (result<95 && result>=90) {
			System.out.println("Gold Class 입니다!!");
	    }
		else if (result<90 && result>=85) {
			System.out.println("Silver Class 입니다!!");
		}
		else if (result<85 && result>=80) {
			System.out.println("Bronze Class 입니다!!");
		}
		if (result<80 && result>=0) {
			System.out.println("Member Class 입니다!!");
		}
	}
}
