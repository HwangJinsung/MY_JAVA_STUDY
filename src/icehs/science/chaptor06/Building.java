package icehs.science.chaptor06;

public class Building {
	String name;
	String address;
	int totalFloor;
	
	public void moveElevator() {
		System.out.println("���������� " + totalFloor + "������ ��մϴ�.");
	}
	
	public void changeAddress(String newAddress) {
		address = newAddress;
	}
}