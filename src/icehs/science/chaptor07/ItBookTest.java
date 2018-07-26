package icehs.science.chaptor07;

public class ItBookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ItBook sql = new ItBook("SQL Plus", 50000, 5.5);
		ItBook java = new ItBook("Java 2.0", 28000, 3.2);
		ItBook jsp = new ItBook("Servlet & JSP", 37000, 6.9);
		
		sql.printItBookInfo();
		java.printItBookInfo();
		jsp.printItBookInfo();
		
		System.out.println();
		
		System.out.println(sql.getTitle() + " 정가와 할인율을 변경합니다.");
		sql.setPrice(55000);
		sql.setDiscountRate(9.5);
		sql.printItBookInfo();
		System.out.println();
		
		System.out.println(java.getTitle() + " 정가를 변경합니다.");
		java.setDiscountRate(3.2);
		java.setPrice(33000);
		java.printItBookInfo();
		System.out.println();
		
		System.out.println(jsp.getTitle() + " 제목과 할인율을 변경합니다.");
		jsp.setDiscountRate(12.6);
		jsp.setTitle("Servlet & JSP");
		jsp.printItBookInfo();

	}

}
