package ch10_exception.sec02;

import java.util.Scanner;

public class ExceptionEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		
		try {
			System.out.print("���� 1 �Է� : ");
			a = sc.nextInt();
			System.out.print("���� 2 �Է� : ");
			b = sc.nextInt();
			
			System.out.println(" ������ ��� : "+ a/b);
		} catch (Exception e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}
		sc.close();
	}

}
