package icehs.science.chaptor05;

public class MultipleFiveSumTEst {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		int index = 1;
		
		while(sum <= 100) {
			if(i % 5 == 0) {
				sum += i;
				System.out.println(index + ". ( + " + i + " ) " + sum);
				index++;
			}
			i++;
		}
		

	}

}
