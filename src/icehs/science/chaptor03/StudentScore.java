package icehs.science.chaptor03;

public class StudentScore {

	public static void main(String[] args) {
		double mathScore = 94.7;
		double engScore = 83.2;
		double korScore = 87.1;
		
		int intmathScore = (int)mathScore;
		int intengScore = (int)engScore;
		int intkorScore = (int)korScore;
		
		System.out.println("수학 : " + intmathScore);
		System.out.println("영어 : " + intengScore);
		System.out.println("국어 : " + intkorScore);

	}

}
