package icehs.science.chaptor07;

import icehs.science.chaptor06.Car;

public class BookTest {

	public static void main(String[] args) {
		Book book1 = new Book();
		
		Car c1 = new Car();
		c1.name = "asdf";
		
		Book book2 = new Book("�ظ�����", 15000);
		
		Book book3 = new Book("Į�ǳ뷡", "����");
		
		Book book4 = new Book("�ٶ��� ��", "�Ѻ��", 39200);
		
		book1.printBookInfo();
		book2.printBookInfo();
		book3.printBookInfo();
		book4.printBookInfo();
	}

}
