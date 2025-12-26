package com.rc.strings;

public class StringCharCount {
	public static void main(String[] args) {
		String s = "madam";
		int count =0;
		for(int i =0 ; i<=s.length()-1 ; i++)
		{
			if(s.charAt(i)!=' ')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
