package icehs.science.chaptor05;

public class ForEx {

	public static void main(String[] args) {

int result = 0;
		for(int inx = 1; inx <= 100; inx++ ) {
			result = inx + result;
		}
		System.out.println(result);
	}

}
