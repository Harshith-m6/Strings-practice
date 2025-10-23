package com.rc.strings;

public class StringBuffer1 {
	public static void main(String[] args) {
		// used for modify the Strings , mutable string objects can be created , strings are stored like character array 
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		sb.append(" ");
		sb.append("world");
		System.out.println(sb); // append is used to add the characters to the existing character arrey
		sb.toString();
		System.out.println(sb);
	}

}
