package ch10_exception.sec03;

// ����� ���� ���� Ŭ���� ����
public class BalanceInsufficientException extends Exception {
	public BalanceInsufficientException() {} // �⺻ ����
	
	// String Ÿ�� �Ű������� ���� ������
	// ���� �߻� ���� (���� �޼���)�� ����
	// ���� Ŭ������ �����ڸ� ȣ���Ͽ� ���� �޽��� ����
	// ���� �޽��� �뵵�� catch{ } ����� ���� ó�� �ڵ忡�� �̿�
	public BalanceInsufficientException(String message) {
		super(message);
	}

}
