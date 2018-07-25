package icehs.science.chaptor06;

public class CoffeeTest {

	public static void main(String[] args) {
		
		Coffee americano = new Coffee();
		americano.name = "아메리카노";
		americano.price = 3500;
		
		americano.printCoffeeInfo();
		
		Coffee caffelatte = new Coffee();
		caffelatte.name = "카페라떼";
		caffelatte.price = 4000;
		
		caffelatte.printCoffeeInfo();
		
		Coffee makkiatto = new Coffee();
		makkiatto.name = "마끼아또";
		makkiatto.price = 4500;
		
		makkiatto.printCoffeeInfo();
		
		int totalPrice = americano.getPrice() + caffelatte.getPrice() + makkiatto.getPrice();
		
		System.out.println("총 금액 : " + totalPrice + "원");
	}

}
