package com.rc.strings;

public class StringReverse {
	public static void main(String[] args) {
		String s = "abcde";
		String rev = "";
		for(int i = s.length()-1 ; i>=0 ; i--)
		{
			rev+=s.charAt(i);
		}
		System.out.println(rev);
		
		System.out.println(rev(s));
	}
	
	static String rev(String s)
	{
		StringBuilder sb = new StringBuilder(s);
		return sb.reverse().toString();
	}
	
	

}
