package icehs.science.chaptor06;

public class CoffeeTest {

	public static void main(String[] args) {
		
		Coffee americano = new Coffee();
		americano.name = "�Ƹ޸�ī��";
		americano.price = 3500;
		
		americano.printCoffeeInfo();
		
		Coffee caffelatte = new Coffee();
		caffelatte.name = "ī���";
		caffelatte.price = 4000;
		
		caffelatte.printCoffeeInfo();
		
		Coffee makkiatto = new Coffee();
		makkiatto.name = "�����ƶ�";
		makkiatto.price = 4500;
		
		makkiatto.printCoffeeInfo();
		
		int totalPrice = americano.getPrice() + caffelatte.getPrice() + makkiatto.getPrice();
		
		System.out.println("�� �ݾ� : " + totalPrice + "��");
	}

}
