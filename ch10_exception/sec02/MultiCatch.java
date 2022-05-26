package ch10_exception.sec02;

public class MultiCatch {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		
		try {
			System.out.println(arr[5]);
			System.out.println(Integer.parseInt("a100")); // �� ������ ������� ����
		} catch (ArrayIndexOutOfBoundsException e) {	// ����� �̵��ؼ� ���� ó��
			System.out.println("�迭�� �ε����� ������ϴ�.");
		}catch (NumberFormatException e) {						// �� catch ��ϵ� ������� ����
			System.out.println("���ڸ� ��ȯ�� �� �����ϴ�.");
		}finally {														// ���� ó�� �� ������ ����
			System.out.println("�ٽ� �����ϼ���.");
		}
	}

}
