package com.rc.strings;

public class StringBuffer2 {
	public static void main(String[] args) {
		//size constructor
		StringBuffer sb = new StringBuffer(1);
		sb.append("abhi harshith");
		System.out.println(sb);
		
		//initial string constructor
		StringBuffer sb1 = new StringBuffer("hello ");
		sb1.append("world");
		System.out.println(sb1);
	}

}
