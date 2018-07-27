package icehs.science.chaptor10;

public class Galaxy extends Mobile {

	private String osVersion;

	public String getOsVersion() {
		return osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
		System.out.println(this.getProduction() + " : " + osVersion);
	}
	
	
	@Override
	public void charge(int time) {
		System.out.println(this.getProduction() + " : 보조 배터리 " + time + "분 충전");
	}
}
