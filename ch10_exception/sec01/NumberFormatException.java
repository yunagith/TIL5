package ch10_exception.sec01;

public class NumberFormatException {

	public static void main(String[] args) {
		String data1 = "100";	// ���ڿ� �Ͽ���
		
		// ���ڿ� "100"�� ���ڷ� ��ȯ
		// ���� ���·� �Ǿ� �ִ� ���ڿ��� ���ڷ� Ÿ�� ��ȯ�� ����
		int value1 = Integer.parseInt(data1);		// ���� �߻� ����
		System.out.println(value1);
		
		// ���ڿ� ���ڰ� ���� �ִ� ��� ���ڷ� Ÿ�� ��ȯ �� ���� �߻�
		String data2 = "a100";
		int value2 = Integer.parseInt(data2);		// ���⿡�� ���� �߻�		
		// ���� �ڵ� ���� �� ��

	}

}
