package icehs.science.chaptor08;

public class Student {
	
	private String name;
	private String schoolnum;
	private String phonenum;
	
	public Student(String name, String schoolnum, String phonenum) {
		this.name = name;
		this.schoolnum = schoolnum;
		this.phonenum = phonenum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSchoolnum() {
		return schoolnum;
	}

	public void setSchoolnum(String schoolnum) {
		this.schoolnum = schoolnum;
	}

	public String getPhonenum() {
		return phonenum;
	}

	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}
	
	
}
