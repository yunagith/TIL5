package ch10_exception.sec02;

public class TryCatchEx {

	public static void main(String[] args) {
		// try ~ catch ����
		
		try {
		Class clazz = Class.forName("java.lang.String"); //ClassNotFoundException
		} catch(ClassNotFoundException e) {
			//���� ó�� ����
				System.out.println(" Ŭ������ �������� �ʽ��ϴ�.");
		}
		System.out.println("����");
		}
	
	
	}
