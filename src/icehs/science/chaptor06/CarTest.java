package icehs.science.chaptor06;

public class CarTest {

	public static void main(String[] args) {
		Car iceCar = new Car();
		iceCar.oilAmount = 5;
		iceCar.distance = 140;
		
		iceCar.printCarInfo();
		iceCar.addOil(10);
		
		iceCar.printCarInfo();
		iceCar.driveCar("IT센터", "인천공항", 10.17);
		
		iceCar.printCarInfo();
		iceCar.driveCar("인천공항", "곤지암리조트", 60.21);

		iceCar.printCarInfo();
		iceCar.calculateDrivingDistsance();

	}

}
