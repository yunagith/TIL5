package ch10_exception.sec02;

public class TryCatchEx2 {

	public static void main(String[] args) {

			int[] arr = {1, 2, 3};
			
			try {
			
			System.out.println(arr[5]);
			} catch(ArrayIndexOutOfBoundsException e) {
				//���� ó�� ����
				System.out.println("�迭�� �ε��� ������ ������ϴ�.");
		}

		}

	}
