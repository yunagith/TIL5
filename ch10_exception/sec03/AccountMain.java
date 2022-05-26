package ch10_exception.sec03;

public class AccountMain {

	public static void main(String[] args) {
		// ����� ���� ���ܿ� ���� �߻� ����
		Account account = new Account();
		
		//�����ϱ�
		account.deposit(10000);
		System.out.println("���ݾ� : "+ account.getBalance());
		
		//����ϱ�
		try {
			account.withdraw(30000);		// throws �ִ� �޼ҵ� : �ݵ�� try ������ ȣ��
		} catch (BalanceInsufficientException e) {
			//���� �߻���ų �� �����ڿ��� ������ �޽��� ��ȯ (���� ��ü ���ο� ����Ǿ�����)
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			System.out.println("���� ���� ���� ���");
			e.printStackTrace();
		}

	}

}
