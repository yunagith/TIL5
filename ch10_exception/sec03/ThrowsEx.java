package ch10_exception.sec03;

public class ThrowsEx {

	public static void main(String[] args) {
		try {
			findClass();	// throws�� ���� �޼ҵ�� �ݵ�� try ��� ������ ȣ���ؾ� �ϰ�
		} catch (ClassNotFoundException e) {	// catch ��Ͽ��� ���ܸ� ó���ؾ� ��
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}

	}
	
	// throws�� �پ� �ִ� �޼ҵ� : �� �޼ҵ忡�� �߻��ϴ� ���ܸ� ���� ó������ �ʰ�
	// �� �޼ҵ带 ȣ���� ������ ���� ó���� �� �ѱ�
	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");  // ClassNotFoundException ���� �߻�
	}
}
