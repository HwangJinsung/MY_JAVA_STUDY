package icehs.science.chaptor05;

public class VariousSumTest {

	public static void main(String[] args) {
		int sumTotal = 0;
		int sumOdd = 0;
		int sumEven = 0;
		
		for (int i = 0; i <= 1000; i++) {
			sumTotal += i;
			if (i % 2 == 0) {
				sumEven += i;
			}
			else {
				sumOdd += i;
			}
			
		}
		
		System.out.println("1부터 1000까지의 합 : " + sumTotal);
		System.out.println("1부터 1000까지 짝수들의 합 : " + sumEven);
		System.out.println("1부터 1000까지 홀수들의 합 : " + sumOdd);
	}

}
