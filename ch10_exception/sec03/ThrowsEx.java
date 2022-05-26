package ch10_exception.sec03;

public class ThrowsEx {

	public static void main(String[] args) {
		try {
			findClass();	// throws가 붙은 메소드는 반드시 try 블록 내에서 호출해야 하고
		} catch (ClassNotFoundException e) {	// catch 블록에서 예외를 처리해야 함
			System.out.println("클래스가 존재하지 않습니다.");
		}

	}
	
	// throws가 붙어 있는 메소드 : 이 메소드에서 발생하는 예외를 직접 처리하지 않고
	// 이 메소드를 호출한 곳으로 예외 처리를 떠 넘김
	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");  // ClassNotFoundException 예외 발생
	}
}
