package com.rc.strings;

public class StringPalindromeCheck {
	public static void main(String[] args) {
		String s = "madam";
		s.toLowerCase();
		String rev ="";
		for(int i=s.length()-1; i>=0; i--)
		{
			rev+=s.charAt(i);
		}
		System.out.println(rev);
		
		System.out.println(rev.toLowerCase().equals(s.toLowerCase())?"Palindrome":"Not a Palindrome");
		
		System.out.println(pali(s));
	}
	
	static boolean pali(String s)
	{
		StringBuilder sb = new StringBuilder(s);
		return sb.reverse().toString().equals(s);
	}
	
	

}
