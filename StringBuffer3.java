package com.rc.strings;

public class StringBuffer3 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("hello");
		//inserts the given String at the given position of the original String
		sb.insert(1, "harshith");
		System.out.println(sb);
		
		//replaces the given string from starting index to end index
		sb.replace(0, 3, "hii");
		System.out.println(sb);
		
		//delete() used to delete the given index from specified starting index to end index
		sb.delete(0, 5);
		System.out.println(sb);
		
		//reverse is used to reverse the given string
		sb.reverse();
		System.out.println(sb);
		
		//capacity() returns the capacity of the string if more than initial capacity then (initial cap *2)+2
		StringBuffer sb1 = new StringBuffer("hi"); //adds 16 + length of given String
		System.out.println(sb1.capacity());
		
		StringBuffer sb2 = new StringBuffer(); // intial capacity is 16
		sb2.append("Harshith");
		System.out.println(sb2.capacity());
		
		StringBuffer sb3 = new StringBuffer(); // size > 16 then capacity is (ip*2)+2
		sb3.append("hi iam harshith kumar , iam from banglore iam learning java to build scalabale apps");
		System.out.println(sb3.capacity());
		
		// length() returns the number of characters in the given String
		StringBuffer sb4 = new StringBuffer();
		sb4.append("Harshith");
		System.out.println(sb4.length());
		
		//StringBuffer is synchronous so slow in performance , where single thread can act on a single string object
		
		System.out.println(sb4.charAt(4)); // returns the character at the specific index
	}

}
