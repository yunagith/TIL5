package ch10_exception.sec01;

public class NullPointerExceptionEx {

	public static void main(String[] args) {
		String data = null ;  // null�� �ʱ�ȭ�ϰ� ���� �������� ���� ���¿��� ��� �����ؼ� ��� �� ���� �߻� : NullPointerException
		//String data = " "; // ���� ���ڿ��� �ʱ�ȭ �� ��� ���� �߻����� ����
		System.out.println(data.equals("�ڹ�"));

	}

}
