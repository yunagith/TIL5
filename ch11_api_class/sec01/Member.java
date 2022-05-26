package ch11_api_class.sec01;

public class Member implements Cloneable {
	String id;
	String name;
	String password;
	int age;
	boolean adult;
	
	public Member(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	
	public Member getMember() {
		Member cloned = null;
		
		try {
			cloned = (Member) clone(); // clone() 리터 타입 Object 타입 -> Member 타입으로 변환
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cloned;
	}
}
