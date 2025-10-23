package com.rc.strings;

public class StringBuilder1 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		// append() adds the string to the existing string
		sb.append("Harshith");
		System.out.println(sb);
		
		// returns the character at the given index of the string
		System.out.println(sb.charAt(5));
		
		// sets the character at the specific index 
		sb.setCharAt(2, 's');
		System.out.println(sb);
		
		//get the substring from the specific indexes
		System.out.println(sb.substring(0,3));
		
		//find the index of specific substring (returns -1 if the substring is not present)
		System.out.println(sb.indexOf("Has"));
		
		//deletes the character at specific index
		sb.deleteCharAt(3);
		System.out.println(sb);
		
		//to convert stringBuilder to string
		String s =sb.toString();
		
		System.out.println(s);
		
		
	}

}
