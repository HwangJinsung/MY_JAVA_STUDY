package icehs.science.chaptor08;

public class MaxMinTest {

	public static void main(String[] args) {
		int [] arr = {12, 53, 24, 10, 22, 38, 64, 39};
		int max = arr[0];
		int min = arr[0];
		System.out.print("배열 데이터 : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			
			if(arr[i] > max) {
				max = arr[i];
			}
			else if(arr[i] < min) {
				min = arr[i];
			}

		}
		System.out.println();
		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min);
		
	}
}
