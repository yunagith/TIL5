package ch10_exception.sec02;

public class CatchOrder {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		
		try {
			System.out.println(arr[5]);
		} catch (ArrayIndexOutOfBoundsException e) {	// ���� Ŭ���� catch ��ϸ� ����
			System.out.println("�迭�� �ε����� ������ϴ�.");
		}catch (Exception e) {	// ���� �ȵ�					
			System.out.println("���ڸ� ��ȯ�� �� �����ϴ�.");
		}finally {														
			System.out.println("�ٽ� �����ϼ���.");
		}
			
		/*try {
			System.out.println(arr[5]);
		} catch (Exception e) {	// ���� Ŭ���� catch ��ϸ� ����
			System.out.println("�迭�� �ε����� ������ϴ�.");
		}catch (ArrayIndexOutOfBoundsException e) {	// ���� �ȵ�					
			System.out.println("���ڸ� ��ȯ�� �� �����ϴ�.");
		}finally {														
			System.out.println("�ٽ� �����ϼ���.");
		}*/
	}

}
