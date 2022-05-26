package ch10_exception.sec02;

public class TryCatchEx {

	public static void main(String[] args) {
		// try ~ catch 예제
		
		try {
		Class clazz = Class.forName("java.lang.String"); //ClassNotFoundException
		} catch(ClassNotFoundException e) {
			//예외 처리 구문
				System.out.println(" 클래스가 존재하지 않습니다.");
		}
		System.out.println("종료");
		}
	
	
	}
