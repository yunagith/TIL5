package ch10_exception.sec04_ex;

import java.nio.channels.AlreadyBoundException;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		String[] strArray = {"10","2a"};
		int value = 0;
		for(int i=0;i<=2;i++) {
			try {
				value = Integer.parseInt(strArray[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("�ε����� �ʰ�����");
			}catch (NumberFormatException e) {
				System.out.println("���ڸ� ��ȯ�� �� ����");
			}finally {
				System.out.println(value);
			}
		}
	}

}
