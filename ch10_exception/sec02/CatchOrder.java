package ch10_exception.sec02;

public class CatchOrder {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		
		try {
			System.out.println(arr[5]);
		} catch (ArrayIndexOutOfBoundsException e) {	// 하위 클래스 catch 블록만 실행
			System.out.println("배열의 인덱스를 벗어났습니다.");
		}catch (Exception e) {	// 실행 안됨					
			System.out.println("숫자를 변환할 수 없습니다.");
		}finally {														
			System.out.println("다시 실행하세요.");
		}
			
		/*try {
			System.out.println(arr[5]);
		} catch (Exception e) {	// 상위 클래스 catch 블록만 실행
			System.out.println("배열의 인덱스를 벗어났습니다.");
		}catch (ArrayIndexOutOfBoundsException e) {	// 실행 안됨					
			System.out.println("숫자를 변환할 수 없습니다.");
		}finally {														
			System.out.println("다시 실행하세요.");
		}*/
	}

}
