package com.rc.strings;

import java.util.Arrays;

public class StringDuplicateChars {
	public static void main(String[] args) {
		String s = "madam";
		int [] a = new int[26];
		for(char c : s.toCharArray())
		{
			a[c-'a']++;
		}
		for(int i =0 ; i<a.length ; i++)
		{
			if(a[i]>1)
			{
				System.out.println((char)('a'+i)+"  -> "+a[i]);
			}
		}
		
	}

}
