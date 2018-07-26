package icehs.science.chaptor08;

public class StudentArrayTest {

	public static void main(String[] args) {
		Student [] studentInfo = {new Student("강감찬", "STU0001", "010-1234-5678"), 
				new Student("이순신", "STU0002", "010-2345-6789"),
				new Student("김유신", "STU0003", "010-9876-5432")};
		
		for(int i = 0; i < studentInfo.length; i++) {
			System.out.println(studentInfo[i].getName() + "(" + studentInfo[i].getSchoolnum() + ") / 전화번호 : " + studentInfo[i].getPhonenum() );
			
		}

	}

}
