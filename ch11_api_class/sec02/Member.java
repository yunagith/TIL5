package ch11_api_class.sec02;

import java.util.Arrays;

public class Member implements Cloneable{
	String name;
	int age;
	int[] scores;
	Car car;
	
	public Member(String name, int age, int[] scores, Car car) {
		super();
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	public Member getMember() { //복제된 객체 반환
		Member cloned = null;
		
		try {
			cloned = (Member)clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cloned;
		
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// 먼저 얕은 복사를 해서 name, age 복제
		Member cloned = (Member)super.clone();
		
		// 배열 scores 복제
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
				
		//car 복제
		cloned.car = new Car(this.car.model);
		
		//깊은 복제된 Member 객체 리턴
		return cloned;
	}
}







