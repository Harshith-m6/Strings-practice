package com.rc.strings;

import java.util.Arrays;

public class StringAnagram {
	public static void main(String[] args) {
		String s1 = "listen";
		String s2 = "silent";
		
		char[] str1 = s1.toCharArray();
		char[] str2 = s2.toCharArray();
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		System.out.println(Arrays.equals(str1, str2)?"anagram":"not anagram");
		
		
		
	}

}
