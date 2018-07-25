package icehs.science.chaptor07;

public class TelevisionTest {

	public static void main(String[] args) {
		Television tv1 = new Television("INFINIA", 1500000);
		Television tv2 = new Television("XCANVAS", 1000000, "LCD TV");
		Television tv3 = new Television("CINEMA", 1500000, "3D TV");
		
		tv1.printTelevisionInfo();
		tv2.printTelevisionInfo();
		tv3.printTelevisionInfo();
				
		System.out.println(tv1.price + tv2.price + tv3.price);
	}

}
