package com.rc.strings;

public class StringAna {
	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silent";
		int[] count = new int[26];
		if(str1.length()!=str2.length())
		{
			System.out.println("Not a anagram");
		}
		
		for(int i = 0 ; i<str1.length(); i++)
		{
			count[str1.charAt(i)-'a']++;
			count[str2.charAt(i)-'a']--;
		}
		
		for(int i : count)
		{
			if(i!=0)
			{
				System.out.println("Not anagram");
				return;
			}
		}
		System.out.println("Anagram");
	}

}
