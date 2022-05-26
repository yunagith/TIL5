package ch11_api_class.sec01;

import java.util.Date;  

public class ToStringEx {

	public static void main(String[] args) {
		Object obj = new Object();
		Date date = new Date();
		String str = new String("ȫ�浿");
		
		System.out.println(obj.toString());
		System.out.println(date.toString());
		System.out.println(date.toGMTString());		// deprecated
		System.out.println(date.toLocaleString());	// deprecated
		System.out.println(str.toString());

	}

}
