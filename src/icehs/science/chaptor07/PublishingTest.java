package icehs.science.chaptor07;

public class PublishingTest {

	public static void main(String[] args) {
		Publication pub1 = new Publication();
		
		System.out.println("===== 출판물 정보를 세팅 합니다. =====");
		pub1.setTitle("만화 삼국지");
		pub1.setPrice(-1000);
		pub1.setPrice(5000);
		pub1.setPage(-500);
		pub1.setPage(300);
		pub1.printPublicationInfo();
	}

}
