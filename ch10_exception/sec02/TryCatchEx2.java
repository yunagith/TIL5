package ch10_exception.sec02;

public class TryCatchEx2 {

	public static void main(String[] args) {

			int[] arr = {1, 2, 3};
			
			try {
			
			System.out.println(arr[5]);
			} catch(ArrayIndexOutOfBoundsException e) {
				//예외 처리 구문
				System.out.println("배열의 인덱스 범위를 벗어났습니다.");
		}

		}

	}
