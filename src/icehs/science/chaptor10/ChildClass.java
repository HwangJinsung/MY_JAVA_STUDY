package icehs.science.chaptor10;

public class ChildClass extends SuperClass implements InterfaceOne, InterfaceTwo {

	@Override
	public void methodTwo() {
		System.out.println("인터페이스 2에서 구현해야 하는 매서드");
		
	}

	@Override
	public void methodFirst() {
		System.out.println("인터페이스 1에서 물려받아 구현해야 하는 매서드");
		
	}

}
