package ch10_exception.sec01;

public class ArrayIndexOutOfBoundsException2 {

	public static void main(String[] args) {
		String data1 = args[0];
		String data2 = args[1];
		
		System.out.println("args[0] : " + data1);
		System.out.println("args[1] : " + data2);
		// main() args�� ���� �����Ǿ� ���� ������ ArrayIndexOutOfBoundsException ���� �߻�
				// args �� ���� : RunConfiguration���� �Ű��� ����
	}

}
