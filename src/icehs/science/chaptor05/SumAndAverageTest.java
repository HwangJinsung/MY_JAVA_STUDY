package icehs.science.chaptor05;

public class SumAndAverageTest {

	public static void main(String[] args) {
		
		int sum = 0;
		double avg = 0;
		
		for (int i = 0; i <= 500; i++) {
			sum += i;
		}

		avg = (double)sum / 500;
				
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
	}

}
