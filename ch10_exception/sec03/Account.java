package ch10_exception.sec03;

public class Account {
	private long balance;
	
	public Account () {}
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance+=money;
	}
	
	// ��� �޼ҵ� : ���� �߻�
	// �ڽ��� ȣ���� ������ ���ܸ� ó���ϵ��� throws Ű����� ���ܸ� �� �ѱ�
	public void withdraw(int money) throws BalanceInsufficientException{
		// �ܰ� �����ϸ� ���ܸ� �߻���Ű�鼭 ���� �޽��� ���� (���� �޽����� ���� ��ü ���ο� ����)
		if(balance<money) {
			throw new BalanceInsufficientException("�ܰ� ���� : "+(money-balance)+"���ڶ�"); // "���� �޽���" �����ڿ��� ����
			
		}
		balance-=money;
	}
}
