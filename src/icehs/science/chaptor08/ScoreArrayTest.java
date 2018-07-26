package icehs.science.chaptor08;

public class ScoreArrayTest {

	public static void main(String[] args) {
		int [] scores = new int [4];
		scores [0] = 93;
		scores [1] = 87;
		scores [2] = 90;
		scores [3] = 55;
		
		String [] subject = {"국어", "영어", "수학", "사회"};
		
		
//		double avg = ((double)(scores[0] + scores[1] + scores[2]) / 3);
		
		int sum = 0;
		
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
			System.out.println(subject[i] + " : " + scores[i]);
		}
		
		double avg = (double)sum / scores.length;
				
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
	}

}