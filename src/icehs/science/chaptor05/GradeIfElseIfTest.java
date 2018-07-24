package icehs.science.chaptor05;

public class GradeIfElseIfTest {

	public static void main(String[] args) {
		int gildongScore = 92;
		
		if(gildongScore <= 100 && gildongScore >= 90) {
			System.out.println("A학점 입니다.");
		}
		else if(gildongScore < 90 && gildongScore >= 80) {
			System.out.println("B학점 입니다.");
		}
		else if(gildongScore < 80 && gildongScore >= 70) {
			System.out.println("C학점 입니다.");
		}
		else if(gildongScore < 60 && gildongScore <= 0) {
			System.out.println("F학점 입니다.");
		}
		else {
			System.out.println("학점을 알 수가 없습니다. 점수를 잘못 입력하셨습니다.");
		}
	}

}
