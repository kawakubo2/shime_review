package project01_クラス分け版;

public class Member {

	String name;
	int id;
	String birthDay;
	String address;
	String postCode;
	
	public Member() {};
	
	public Member(String name,int id,String birthDay,String address,String postCode) {
		this.name = name;
		this.id = id;
		this.birthDay = birthDay;
		this.address = address;
		this.postCode = postCode;
	}
	
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	
	public String getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
