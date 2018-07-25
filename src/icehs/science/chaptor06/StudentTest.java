package icehs.science.chaptor06;

public class StudentTest {

	public static void main(String[] args) {

		Student hong = new Student();
		hong.name = "홍길동";
		hong.korean = 94;
		hong.english = 80;
		hong.math = 89;
		hong.stuID = "S001";
		
		
		hong.printStudentInfo();//
		hong.calculateAVG();
		
		System.out.println();
		System.out.println("* 학번을 변경합니다!!!.");
		System.out.println();
		
		hong.changeStudentID("STU0001");

		hong.printStudentInfo();
		
		
		
	}

}
