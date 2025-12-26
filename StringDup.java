package com.rc.strings;
import java.util.*;
public class StringDup {
	public static void main(String[] args) {
		String str = "madam";
		StringBuilder sb = new StringBuilder();
		Set<Character> unique = new HashSet<>();
		for(char c : str.toCharArray())
		{
			if(!unique.add(c))
			{
				sb.append(c);
			}
		}
		System.out.println(sb.toString());
		
	}

}
