package icehs.science.chaptor04;

public class SalaryTest {

	public static void main(String[] args) {
		
		int salary = 1000000;
		
		int annualSalary = salary * 12;
		int afterSalary = annualSalary - annualSalary * 10 / 100;
		int bonus = salary * 20 / 100 * 4;
		int bonus2 = bonus - bonus * 55/1000;
		int realMoney = afterSalary + bonus2;
		
		System.out.println("연봉 : " + annualSalary + ", 세후 연봉 : " + afterSalary);
		System.out.println("보너스 : " + bonus + ", 세후 보너스 : " + bonus2);
		System.out.println("지급액 : " + realMoney);

	}

}
